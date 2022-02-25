package be.ucll.hayen_nick;


public class Film {
    private int id;
    private String titel;
    private int releasejaar;
    private int duur;
    private double score;

    public Film(String titel, int releasejaar, int duur, double score){
        if(titel == null) throw new IllegalArgumentException();
        if(releasejaar < 1900) throw new IllegalArgumentException();
        if(duur <= 0) throw new IllegalArgumentException();
        if(score < 0) throw new IllegalArgumentException();
        this.titel = titel;
        this.releasejaar = releasejaar;
        this.duur = duur;
        this.score = score;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public int getReleasejaar() {
        return releasejaar;
    }

    public int getDuur() {
        return duur;
    }

    public double getScore() {
        return score;
    }
}
