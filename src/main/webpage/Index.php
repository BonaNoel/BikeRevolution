
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
        <div class="subtitle">
            <h2> Magyarország legmegbízhatóbb kerékpár szervíze </h2>
        </div>
    </div>
    <div class="container">
        <div class="buttons">
            <a href="bikelogin.php" class="btn"> Bejelentkezés </a>
            <a href="bikeregister.php" class="btn"> Regisztráció </a>
        </div>
    </div>
</body>