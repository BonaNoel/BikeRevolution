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
        <div id="response-container">
            <?php
            if (isset($_GET["response"])) {
                $responseMessage = $_GET["response"];
                $responseClass = isset($_GET["response_class"]) ? $_GET["response_class"] : '';
                echo "<p class='$responseClass'>$responseMessage</p>";
            }
            ?>
        </div>
        <form action="SubmitScript.php"  method="post">
            <label for="name"> Név: </label>
            <input type="text" name="name" placeholder="Név" class="nev" required> <br>
            <label for="phone"> Telefonszám: </label>
            <input type="text" name="phone" placeholder="Telefonszám" class="telefon" required> <br>
            <label for="date"> Időpont: </label>
            <input type="datetime-local" name="date" class="ido" required> <br>
            <label for="description"> Leírás: </label>
            <input type="text" name="description" class="leiras" placeholder="Leírás" required> <br>
            <input type="submit" name="submit" class="foglalas" value="Foglalás">
            <div class="error-container">
                <?php if (isset($successMessage)) : ?>
                    <p class="success-message"><?php echo $successMessage; ?></p>
                <?php elseif (isset($errorMessage)) : ?>
                    <p class="error-message"><?php echo $errorMessage; ?></p>
                <?php endif; ?>
            </div>
        </form>
    </div>
</div>
</body>
</html>