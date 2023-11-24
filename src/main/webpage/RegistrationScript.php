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
        $errorMessage = "Error: Username already exists. Please choose a different username.";
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
                echo "Registration successful!";

                // Redirect to index.php
                header("Location: index.php");
                exit();
            } else {
                echo "Error: " . $insertStatement->errorInfo()[2];
            }
        } catch (PDOException $e) {
            echo "Error: " . $e->getMessage();
        } finally {
            $insertStatement->closeCursor(); // Close the cursor to allow for the next query
        }
    }
}
?>