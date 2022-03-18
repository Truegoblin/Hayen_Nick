<%@ page import="be.ucll.domain.model.Film" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="nl">
<head>
    <title>Overzicht</title>
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
<main>
    <table>
        <tr>
            <th>Titel</th>
            <th>Releasejaar</th>
            <th>Duur</th>
            <th>Score</th>
        </tr>
        <% ArrayList<Film> films = (ArrayList<Film>)request.getAttribute("films"); %>
        <%
            for(Film film : films) {
        %>
        <tr>
            <td><%=film.getTitel()%></td>
            <td><%=film.getReleasejaar()%></td>
            <td><%=film.getDuur()%></td>
            <td><%=film.getScore()%></td>
        </tr>
        <%
            }
        %>
    </table>
    <p class="langste">De langste film is: <%= request.getAttribute("langsteFilm")%></p>
</main>
<footer>
    <ul>
        <li>Webontwikkeling 2</li>
        <li>Nick Hayen</li>
    </ul>
</footer>
</body>
</html>
