package td1;

import java.util.ArrayList;

class Ecole {
    private ArrayList<ESTien> estiens;

    public Ecole() {
        this.estiens = new ArrayList<>();
    }

    public void ajouterESTien(ESTien estien) {
        estiens.add(estien);
    }

    public void afficherESTiens() {
        for (ESTien estien : estiens) {
            System.out.println(estien.getNom() + " : " + estien.getAnneeArrivee() + " (" + estien.calculerAnciennete() + " ans à l'EST)");
        }
    }

    public double calculerAncienneteMoyenne() {
        int totalAnciennete = 0;
        for (ESTien estien : estiens) {
            totalAnciennete += estien.calculerAnciennete();
        }
        return totalAnciennete / (double) estiens.size();
    }
}



