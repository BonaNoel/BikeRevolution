<!DOCTYPE html>
<html>
<head>
    <title> Bike Start </title>
    <link rel="stylesheet" href="service-style.css">
</head>
<body>
<div class="container1">
    <div class="title">
        <h1> BIKEREVOLUTION </h1>
    </div>
    <div class="buttons">
        <a href="Index.php" class="btn"> Vissza </a>
    </div>
    <div class="form">
        <form action="" method="post">
            <label for="name"> Név: </label>
            <input type="text" name="name" placeholder="Név" class="nev"> <br>
            <label for="phone"> Telefonszám: </label>
            <input type="text" name="phone" placeholder="Telefonszám" class="telefon"> <br>
            <label for="date"> Időpont: </label>
            <input type="datetime-local" name="date" class="ido"> <br>
            <label for="description"> Leírás: </label>
            <input type="text" name="description" class="leiras" placeholder="Leírás"> <br>
            <input type="submit" name="submit" class="foglalas" value="Foglalás">
        </form>
    </div>
</div>

<?php
// Check if the form is submitted
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    // Your corrected database connection code for MariaDB
    $host = '127.0.0.1';
    $port = '3306';
    $dbname = 'bikerevolutiondb';
    $user = 'root';
    $password = '';

    try {
        $pdo = new PDO("mysql:host=$host;port=$port;dbname=$dbname", $user, $password);
        $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
        echo "Connected successfully<br>";
    } catch (PDOException $e) {
        die("Connection failed: " . $e->getMessage());
    }

    // Collect form data
    $name = $_POST['name'];
    $phone = $_POST['phone'];
    $date = $_POST['date'];
    $description = $_POST['description'];

    // Insert data into the database
    $stmt = $pdo->prepare("INSERT INTO Customers (date, description, name, phone) VALUES (:date, :description, :name, :phone)");
    $stmt->bindParam(':name', $name);
    $stmt->bindParam(':phone', $phone);
    $stmt->bindParam(':date', $date);
    $stmt->bindParam(':description', $description);

    try {
        $stmt->execute();
        echo 'Data inserted successfully';
    } catch (PDOException $e) {
        echo 'Error inserting data: ' . $e->getMessage();
    }
}
?>
</body>
</html>