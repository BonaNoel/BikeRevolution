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

$successMessage = '';
$errorMessage = '';

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $name = $_POST['name'];
    $phone = $_POST['phone'];
    $date = $_POST['date'];
    $description = $_POST['description'];

    // Validate date and time
    $dayOfWeek = date('N', strtotime($date));
    $time = date('H:i', strtotime($date));

    if ($dayOfWeek >= 1 && $dayOfWeek <= 5 && $time >= '08:00' && $time <= '18:00') {
        // Insert data into the database with auto-incremented ID
        $sql = "INSERT INTO web_customers (date, description, name, phone) VALUES (?, ?, ?, ?)";
        $stmt = $con->prepare($sql);
        $stmt->bindParam(1, $date);
        $stmt->bindParam(2, $description);
        $stmt->bindParam(3, $name);
        $stmt->bindParam(4, $phone);

        try {
            if ($stmt->execute()) {
                $successMessage = "SIKERES FOGLALÁS!";

                // Redirect to bikeservice.php with success message and class
                header('Location: bikeservice.php?response=' . urlencode($successMessage) . '&response_class=success-message');
                exit();
            } else {
                $errorMessage = "SIKERTELEN FOGLALÁS!";
            }
        } catch (PDOException $e) {
            $errorMessage = "Error: " . $e->getMessage();
        } finally {
            $stmt->closeCursor(); // Close the cursor to allow for the next query
        }
    } else {
        $errorMessage = "A FOGLALÁS CSAK MUNKANAP 8:00-18:00 KÖZÖTT LEHETSÉGES!";
        header('Location: bikeservice.php?response=' . urlencode($errorMessage) . '&response_class=error-message');
        exit();
    }
}

// Redirect to webpage.php with error message and class
header('Location: webpage.php?response=' . urlencode($errorMessage) . '&response_class=error-message');
exit();
?>
