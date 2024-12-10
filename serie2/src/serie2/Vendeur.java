package serie2;

public class Vendeur extends Commercial {
    public Vendeur(String nom, String prenom, int age, String dateEntree, double chiffreAffaire) {
        super(nom, prenom, age, dateEntree, chiffreAffaire);
    }

    @Override
    public double calculerSalaire() {
        return (0.2 * chiffreAffaire) + 4000; 
    }

    
}