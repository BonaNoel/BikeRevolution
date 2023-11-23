<?php
error_reporting(E_ALL);
ini_set('display_errors', 1);

// Your corrected database connection code for MariaDB
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

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $name = $_POST['name'];
    $phone = $_POST['phone'];
    $date = $_POST['date'];
    $description = $_POST['description'];

    // Insert data into the database with auto-incremented ID
    $sql = "INSERT INTO customers (date, description, name, phone) VALUES (?, ?, ?, ?)";
    $stmt = $con->prepare($sql);
    $stmt->bindParam(1, $date);
    $stmt->bindParam(2, $description);
    $stmt->bindParam(3, $name);
    $stmt->bindParam(4, $phone);

    try {
        if ($stmt->execute()) {
            $con->lastInsertId();
            // No need to get the last inserted ID, as it's an auto-increment column

            echo "New record created successfully";

            // Redirect to bikeservice.php
            header('Location: bikeservice.php');
            exit();  // Ensure that no other code is executed after the redirect
        } else {
            echo "Error: " . $stmt->errorInfo()[2];
        }
    } catch (PDOException $e) {
        echo "Error: " . $e->getMessage();
    } finally {
        $stmt->closeCursor(); // Close the cursor to allow for the next query
    }
}
?>