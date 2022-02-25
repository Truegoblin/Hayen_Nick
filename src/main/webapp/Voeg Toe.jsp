<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="nl">
<head>
    <title>Voeg Toe</title>
    <link rel="stylesheet" href="css/normalize.css">
    <link rel="stylesheet" href="css/stylesheet.css">
</head>
<body>
<header>
    <h1>Mijn Favoriete Films</h1>
    <nav>
        <ul>
            <li><a href="index.jsp">Home</a></li>
            <li><a href="Voeg%20Toe.jsp">Voeg Toe</a></li>
            <li><a href="Overzicht.jsp">Overzicht</a></li>
        </ul>
    </nav>
</header>
<main class="form">
    <form action="#">
        <p><label for="Titel">Titel:</label><input type="text" id="Titel" required></p>
        <p><label for="Releasejaar">Releasejaar:</label><input type="text" id="Releasejaar" required></p>
        <p><label for="Duur">Duur:</label><input type="text" id="Duur" required></p>
        <p><label for="Score">Score:</label><input type="text" id="Score" required></p>
        <p><input type="submit" value="Voeg Toe"></p>
    </form>
</main>
</body>
</html>
