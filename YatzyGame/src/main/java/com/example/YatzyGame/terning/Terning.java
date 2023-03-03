package com.example.YatzyGame.terning;

public class Terning {
    private int verdi;

    public Terning() {
        this.verdi = 1;
    }

    public Terning(int verdi) {
        this.verdi = verdi;
    }

    public int getVerdi() {
        return verdi;
    }

    public void setVerdi(int verdi) {
        this.verdi = verdi;
    }

    public void trill() {
        this.verdi = (int) (Math.random() * 6) + 1;
    }

    public String toString() {
        return "Terning: " + this.verdi;
    }
    
}
