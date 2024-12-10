package td1;

import java.util.Calendar;

class ESTien {
    protected String nom;
    protected int anneeArrivee;

    public ESTien(String nom, int anneeArrivee) {
        this.nom = nom;
        this.anneeArrivee = anneeArrivee;
    }

    public String getNom() {
        return nom;
    }

    public int getAnneeArrivee() {
        return anneeArrivee;
    }

    public int calculerAnciennete() {
        int anneeCourante = Calendar.getInstance().get(Calendar.YEAR);
        return anneeCourante - anneeArrivee;
    }
}


