<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="nl">
<head>
    <title>Voeg Toe</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/normalize.css">
    <link rel="stylesheet" href="css/stylesheet.css">
    <link rel="icon" href="images/favicon.png">
</head>
<body>
<header>
    <nav>
        <ul>
            <li><a href="index.jsp">Home</a></li>
            <li><a href="Voeg%20Toe.jsp">Voeg Toe</a></li>
            <li><a href="Controller">Overzicht</a></li>
        </ul>
    </nav>
</header>
<main class="form">
    <form action="Controller" method="post" novalidate>
        <h1 class="hoofding">Voeg een film toe</h1>
        <%if(request.getAttribute("fout") != null) {%>
        <p>U vulde niet alle velden correct in.</p>
        <%}%>
        <p><label for="Titel">Titel:</label><input type="text" id="Titel" name="Titel" required></p>
        <p><label for="Releasejaar">Releasejaar:</label><input type="text" id="Releasejaar" name="Releasejaar" required></p>
        <p><label for="Duur">Duur:</label><input type="text" id="Duur" name="Duur" required></p>
        <p><label for="Score">Score:</label><input type="text" id="Score" name="Score" required></p>
        <p><input type="submit" value="Voeg Toe"></p>
    </form>
</main>
<footer>
    <ul>
        <li>Webontwikkeling 2</li>
        <li>Nick Hayen</li>
    </ul>
</footer>
</body>
</html>
