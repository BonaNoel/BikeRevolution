<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bike Register</title>
    <link rel="stylesheet" href="register-style.css">
</head>
<body>
<div class="container">
    <div class="title">
        <h1>BIKEREVOLUTION</h1>
    </div>
</div>
<div class="container">
    <div class="buttons">
        <a href="Index.php" class="btn">Vissza</a>
    </div>
</div>
<div class="form">
    <div id="response-container">
        <?php
        if (isset($_GET["response"])) {
            $responseMessage = $_GET["response"];
            $responseClass = isset($_GET["response_class"]) ? $_GET["response_class"] : '';
            echo "<p class='$responseClass'>$responseMessage</p>";
        }
        ?>
    </div>
    <form action="RegistrationScript.php" method="post">
        <input type="text" name="username" placeholder="Felhasználó név" required>
        <input type="password" name="password" placeholder="Jelszó" required>
        <input type="submit" name="submit" value="Regisztráció">
        <div class="error-container">
            <?php if (isset($successMessage)) : ?>
                <p class="success-message"><?php echo $successMessage; ?></p>
            <?php elseif (isset($errorMessage)) : ?>
                <p class="error-message"><?php echo $errorMessage; ?></p>
            <?php endif; ?>
        </div>
    </form>
</div>
</body>
</html>
