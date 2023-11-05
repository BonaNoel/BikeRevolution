 <!-- Purpose: Bike Start page / Index page -->

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
            margin-top: 20%;
        }
        .title {
            font-size: 50px;
            font-family: "Times New Roman", Times, serif;
            color: white;
        }
        .subtitle {
            font-size: 30px;
            font-family: "Times New Roman", Times, serif;
            color: white;
        }
        .btn {
            border: 1px solid white;
            padding: 10px 30px;
            color: white;
            text-decoration: none;
            margin: 10px;
            font-size: 20px;
            font-family: "Times New Roman", Times, serif;
            transition: 0.6s ease;
        }
        .btn:hover {
            background-color: white;
            color: black;
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
            <a href="bikelogin.php" class="btn"> Login </a>
            <a href="bikeregister.php" class="btn"> Register </a>
        </div>
    </div>
</body>