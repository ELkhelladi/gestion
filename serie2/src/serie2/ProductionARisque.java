package serie2;

public class ProductionARisque extends Production implements Arisque{
   

    public ProductionARisque(String nom, String prenom, int age, String dateEntree, int nombreUnites) {
		super(nom, prenom, age, dateEntree, nombreUnites);
	
	}

	@Override
    public double calculerSalaire() {
        return super.calculerSalaire()+Arisque.prime;
    }
	
}


