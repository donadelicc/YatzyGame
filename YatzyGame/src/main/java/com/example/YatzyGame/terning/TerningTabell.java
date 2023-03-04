package com.example.YatzyGame.terning;


public class TerningTabell {
    private Terning[] terninger;

    public TerningTabell() {
        this.terninger = new Terning[5];
        for(int i = 0; i < 5; i++) {
            this.terninger[i] = new Terning();
        }
    }

    public TerningTabell(int antall) {
        this.terninger = new Terning[antall];
        for(int i = 0; i < antall; i++) {
            this.terninger[i] = new Terning();
        }
    }

    public int getAntallTerninger() {
        return this.terninger.length;
    }

    public Terning getTerning(int index) {
        return this.terninger[index];
    }

    public Terning[] getTerninger() {
        return terninger;
    }

    public void setTerninger(Terning[] terninger) {
        this.terninger = terninger;
    }

    public void trillAlle() {
        for(Terning t : this.terninger) {
            t.trill(); // fra terning
        }
    }

    public void trillEn(int index) {
        this.terninger[index].trill();
    }

    public String toString() {
        String resultat = "Terninger: ";
        for(Terning t : this.terninger) {
            resultat += t.getVerdi() + " ";
        }
        return resultat;
    }
    
}
