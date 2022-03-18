package be.ucll.domain.model;


public class Film {
    private int id;
    private String titel;
    private int releasejaar;
    private int duur;
    private double score;

    public Film(String titel, int releasejaar, int duur, double score){
        this.setTitel(titel);
        this.setReleasejaar(releasejaar);
        this.setDuur(duur);
        this.setScore(score);
    }

    public boolean equals(Object o) {
        if(o instanceof Film) {
            return this.getTitel().equals(((Film)o).getTitel());
        }
        return false;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitel(String titel) {
        if(titel == null || titel.isEmpty()) {
            throw new IllegalArgumentException("Titel mag niet leeg zijn");
        }
        this.titel = titel;
    }

    public void setReleasejaar(int releasejaar) {
        if(releasejaar<1900) {throw new IllegalArgumentException("Releasjaar moet na 1900 zijn");}
        this.releasejaar = releasejaar;
    }

    public void setDuur(int duur) {
        if(duur<0) {throw new IllegalArgumentException("De duur moet minstens 1 minuut zijn");}
        this.duur = duur;
    }

    public void setScore(double score) {
        if(score<1 || score>10) {throw new IllegalArgumentException("De score moet tussen 1 en 10 liggen");}
        this.score = score;
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
