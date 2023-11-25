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

    // Check if the username already exists
    $checkQuery = "SELECT COUNT(*) FROM login_data WHERE username = :username";
    $checkStatement = $con->prepare($checkQuery);
    $checkStatement->bindParam(':username', $username);
    $checkStatement->execute();

    if ($checkStatement->fetchColumn() > 0) {
        // Registration failed because the username already exists
        $errorMessage = "HIBA: EZ A FELHASZNÁLÓ NÉV MÁR LÉTEZIK";
        $responseClass = "error-message";
        header("Location: bikeregister.php?response=" . urlencode($errorMessage) . "&response_class=" . urlencode($responseClass));
    } else {
        // Encrypt the password (you should use a more secure method, like password_hash)
        $encryptedPassword = md5($password);

        // Insert the data into the database
        $insertQuery = "INSERT INTO login_data (username, password) VALUES (:username, :password)";
        $insertStatement = $con->prepare($insertQuery);
        $insertStatement->bindParam(':username', $username);
        $insertStatement->bindParam(':password', $encryptedPassword);

        try {
            if ($insertStatement->execute()) {
                // Registration successful message
                $successMessage = "SIKERES REGISZTRÁCIÓ!";
                $responseClass = "success-message";
                header("Location: bikeregister.php?response=" . urlencode($successMessage) . "&response_class=" . urlencode($responseClass));
            } else {
                // Registration failed for some reason
                $errorMessage = "Error: " . $insertStatement->errorInfo()[2];
                $responseClass = "error-message";
                header("Location: bikeregister.php?response=" . urlencode($errorMessage) . "&response_class=" . urlencode($responseClass));
            }
        } catch (PDOException $e) {
            // Handle any exceptions that occur during the registration process
            $errorMessage = "Error: " . $e->getMessage();
            $responseClass = "error-message";
            header("Location: bikeregister.php?response=" . urlencode($errorMessage) . "&response_class=" . urlencode($responseClass));
        } finally {
            $insertStatement->closeCursor(); // Close the cursor to allow for the next query
        }
    }
}
?>
