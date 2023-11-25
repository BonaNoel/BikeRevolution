<?php
$host = '127.0.0.1';
$port = '3306';
$dbname = 'bikerevolutiondb';
$user = 'root';
$password = '';

try {
    $con = new PDO("mysql:host=$host;port=$port;dbname=$dbname", $user, $password);
    $con->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
} catch (PDOException $e) {
    echo "Connection failed: " . $e->getMessage();
    exit();
}

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Get username and password from the form
    $username = $_POST["username"];
    $password = $_POST["password"];

    // Check if the username exists
    $checkQuery = "SELECT password FROM login_data WHERE username = :username";
    $checkStatement = $con->prepare($checkQuery);
    $checkStatement->bindParam(':username', $username);
    $checkStatement->execute();

    $row = $checkStatement->fetch(PDO::FETCH_ASSOC);

    if (!$row) {
        // Username does not exist
        $errorMessage = "HIBA: FELHASZNÁLÓ NÉV VAGY JELSZÓ NEM MEGFELELŐ!";
        $responseClass = "error-message"; // Set response class to "error"
        header("Location: bikelogin.php?response=" . urlencode($errorMessage) . "&response_class=" . urlencode($responseClass));
        exit(); // Exit to avoid further execution
    } else {
        // Check if the password matches (using MD5)
        $md5Password = md5($password);
        if ($md5Password === $row['password']) {
            // Password matches, set success message and delay before redirect
            $successMessage = "SIKERES BEJELENTKEZÉS!";
            $responseClass = "success-message"; // Set response class to "success"
            // Redirect to the bikeservice webpage immediately
            header("Location: bikeservice.php?response=" . urlencode($successMessage) . "&response_class=" . urlencode($responseClass));
            exit(); // Exit to avoid further execution
        } else {
            // Password does not match
            $errorMessage = "Error: Username or Password is incorrect.";
            $responseClass = "error-message"; // Set response class to "error"
            header("Location: bikelogin.php?response=" . urlencode($errorMessage) . "&response_class=" . urlencode($responseClass));
            exit(); // Exit to avoid further execution
        }
    }
}

// If no POST request, redirect to login page with an error message
$errorMessage = "Invalid request.";
$responseClass = "error";
header("Location: bikelogin.php?response=" . urlencode($errorMessage) . "&response_class=" . urlencode($responseClass));
exit();
?>
