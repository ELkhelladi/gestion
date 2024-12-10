package serie2;

public class Production extends Employe {
    private int nombreUnites;

    public Production(String nom, String prenom, int age, String dateEntree, int nombreUnites) {
        super(nom, prenom, age, dateEntree);
        this.nombreUnites = nombreUnites;
    }

    @Override
    public double calculerSalaire() {
        return nombreUnites * 5;
    }

    
}
