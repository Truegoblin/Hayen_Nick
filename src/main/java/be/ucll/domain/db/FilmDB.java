package be.ucll.domain.db;

import be.ucll.domain.model.Film;

import java.util.ArrayList;

public class FilmDB {
    private int sequence = 0;
    private final ArrayList<Film> films = new ArrayList<>();
    public FilmDB() {
        this.add(new Film("The Dark Knight", 2008,152,8.5));
        this.add(new Film("Into the Spiderverse", 2018,116,10));
        this.add(new Film("Django Unchained", 2012, 165, 9));
        this.add(new Film("Avengers Endgame", 2019, 182, 8));
    }

    public void add(Film film) {
        this.sequence++;
        film.setId(sequence);
        films.add(film);
    }

   public ArrayList<Film> getAll(){
        return films;
   }

   public Film getLangsteFilm(){
        if(films.size() == 0) return null;
        Film langste = films.get(0);
        for(Film film : films) {
            if(film.getDuur() > langste.getDuur()) langste = film;
        }
        return langste;
   }

}
