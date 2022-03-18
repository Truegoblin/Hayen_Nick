package be.ucll.ui.controller;

import be.ucll.domain.db.FilmDB;
import be.ucll.domain.model.Film;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
    private final FilmDB filmdb = new FilmDB();

    public Controller() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("films", filmdb.getAll());
        request.setAttribute("langsteFilm", filmdb.getLangsteFilm().getTitel());
        RequestDispatcher view = request.getRequestDispatcher("Overzicht.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String titelParam = request.getParameter("Titel");
        String releasejaarParamString = request.getParameter("Releasejaar");
        String duurParamString = request.getParameter("Duur");
        String scoreParamString = request.getParameter("Score");
        if (titelParam == null || titelParam.isBlank() || releasejaarParamString == null ||
            releasejaarParamString.isBlank() || duurParamString == null || duurParamString.isBlank() ||
            scoreParamString == null || scoreParamString.isBlank()) {
            request.setAttribute("fout", "Alle velden moeten ingevuld worden.");
            RequestDispatcher opnieuw = request.getRequestDispatcher("Voeg%20Toe.jsp");
            opnieuw.forward(request, response);
        } else {
            int releasejaarParam = Integer.parseInt(request.getParameter("Releasejaar"));
            int duurParam = Integer.parseInt(request.getParameter("Duur"));
            double scoreParam = Double.parseDouble(request.getParameter("Score"));
            Film result = new Film(titelParam, releasejaarParam, duurParam, scoreParam);
            filmdb.add(result);
            request.setAttribute("films", filmdb.getAll());
            request.setAttribute("langsteFilm", filmdb.getLangsteFilm().getTitel());
            RequestDispatcher view = request.getRequestDispatcher("Overzicht.jsp");
            view.forward(request, response);
        }
    }
}
