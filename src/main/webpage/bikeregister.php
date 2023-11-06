<!DOCTYPE html>
<html>
<head>
    <title> Bike Register </title>
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
            margin-top: 5%;
        }
        .title {
            font-size: 40px;
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
        div.form{
            display: block;
            text-aling: center;
        }
        .form {
            display: inline-block;
            margin-top: 5%;
            margin-left: 35%;
            margin-right: 35%;
            text_align: left;
            padding: 30px;
            background-color: rgba(0, 0, 0, 0.5);
            border-radius: 10px;
        }
        .form input {
            width: 100%;
            padding: 10px;
            margin: 5px;
            border: 1px solid white;
            border-radius: 5px;
            background-color: rgba(0, 0, 0, 0.5);
            color: white;
        }
        .form input:focus {
            outline: none;
        }
        .form input[type="submit"] {
            border: none;
            padding: 10px 30px;
            margin: 10px;
            font-size: 20px;
            font-family: "Times New Roman", Times, serif;
            transition: 0.6s ease;
        }
        .form input[type="submit"]:hover {
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
    </div>
    <div class="container">
        <div class="buttons">
            <a href="Index.php" class="btn"> Vissza </a>
        </div>
    </div>
    <div class="form">
        <form action="bikeregister.php" method="post">
            <input type="text" name="username" placeholder="Username" required>
            <input type="password" name="password" placeholder="Password" required>
            <input type="submit" name="submit" value="Regisztáció">
        </form>
    </div>