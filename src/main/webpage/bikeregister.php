<!DOCTYPE html>
<html>
<head>
    <title> Bike Register </title>
    <link rel="stylesheet" href="register-style.css">
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
        <form action="RegistrationScript.php" method="post">
            <input type="text" name="username" placeholder="Felhasználó név" required>
            <input type="password" name="password" placeholder="Jelszó" required>
            <input type="submit" name="submit" value="Regisztráció">
            <div class="error-container">
                <p class="error-message"><?php echo isset($errorMessage) ? $errorMessage : ''; ?></p>
            </div>
        </form>
    </div>