package serie2;

public abstract class Commercial extends Employe {
	protected  double chiffreAffaire;
    
    public Commercial(String nom, String prenom, int age, String dateEntree, double chiffreAffaire2) {
		
    	super(nom, prenom, age, dateEntree);
		this.chiffreAffaire=chiffreAffaire;
	}

	
    public abstract double calculerSalaire();

    
}
