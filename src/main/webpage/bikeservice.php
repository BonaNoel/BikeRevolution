<!DOCTYPE html>
<html>
<head>
    <title> Bike Start </title>
    <style>
        body {
            background-image: url("bike.jpg");
            background-repeat: no-repeat;
            background-size: cover;
            background-position: center;
            background-attachment: fixed;
        }
        .container {
            text-align: center;
            margin-top: 10%;
        }
        .title {
            font-size: 40px;
            font-family: "Times New Roman", Times, serif;
            color: black;
        }
        .subtitle {
            font-size: 20px;
            font-family: "Times New Roman", Times, serif;
            color: black;
        }

        .btn {
            border: 1px solid black;
            padding: 10px 30px;
            color: black;
            text-decoration: none;
            margin: 10px;
            font-size: 20px;
            font-family: "Times New Roman", Times, serif;
            transition: 0.6s ease;
        }
        .btn:hover {
            background-color: black;
            color: white;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="title">
            <h1> BIKEREVOLUTION </h1>
        </div>
    <div class="container">
        <div class="buttons">
            <a href="bikelogin.php" class="btn"> Vissza </a>
        </div>
    </div>
    <div class="container">
        <div class="form">
            <form action="bikeservice.php" method="post">
                <input type="text" name="name" placeholder="Név"> <br>
                <input type="text" name="phone" placeholder="Telefonszám"> <br>
                <input type="datetime-local" name="date"> <br>
                <input type="text" name="description" placeholder="Leírás"> <br>
                <input type="submit" name="submit" value="Foglalás">
            </form>
        </div>
</body>
</html>