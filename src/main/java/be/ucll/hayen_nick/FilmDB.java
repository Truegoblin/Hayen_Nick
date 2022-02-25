package be.ucll.hayen_nick;

import java.util.ArrayList;
import java.util.List;

public class FilmDB {
    private int sequence = 0;
    private final List<Film> animals = new ArrayList<>();
    public FilmDB() {
// voeg enkele dieren toe via constructor
// zodat lijst niet leeg is bij opstart van het project
        this.add(new Film("Interstellar", 2014,169,8.5));
        this.add(new Film("Into the Spiderverse", 2018,116,10));
    }
    public void add(Film film) {
// schrijf hier de nodige validatie
        this.sequence++;
        film.setId(sequence);
        animals.add(film);
    }

}
