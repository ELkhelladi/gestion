package serie2;

public class ManutentionARisque extends Manutention implements Arisque {
    public ManutentionARisque(String nom, String prenom, int age, String dateEntree, int heure) {
        super(nom, prenom, age, dateEntree, heure);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire()+Arisque.prime;
    }
    
}

