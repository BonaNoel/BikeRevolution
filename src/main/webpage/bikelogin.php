<!DOCTYPE html>
<html>
<head>
    <title> Bike Register </title>
    <link rel="stylesheet" href="login-style.css">
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
    <form action="bikelogin.php" method="post">
        <div id="response-container">
            <?php
            if (isset($_SESSION['error_message'])) {
                echo "<p class='error-message'>{$_SESSION['error_message']}</p>";
                unset($_SESSION['error_message']); // Clear the error message
            }
            ?>
        </div>
        <input type="text" name="username" placeholder="Felhasználó név" required>
        <input type="password" name="password" placeholder="Jelszó" required>
        <input type="submit" name="submit" value="Bejelentkezés">
    </form>
</div>
</body>
</html>
