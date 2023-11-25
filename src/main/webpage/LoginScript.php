<?php
session_start(); // Start the session

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
        $_SESSION['error_message'] = "Error: Username not found.";
    } else {
        // Check if the password matches (using MD5)
        $md5Password = md5($password);
        if ($md5Password === $row['password']) {
            // Password matches, redirect to bikeservice.php
            header("Location: bikeservice.php");
            exit();
        } else {
            // Password does not match
            $_SESSION['error_message'] = "Error: Incorrect password.";
        }
    }
}

// Redirect to the login page after processing
header("Location: bikelogin.php");
exit();
?>
