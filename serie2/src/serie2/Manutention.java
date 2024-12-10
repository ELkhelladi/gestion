package serie2;

public class Manutention extends Employe {
protected static int heure;
	public Manutention(String nom, String prenom, int age, String dateEntree, int heure) {
		super(nom, prenom, age, dateEntree);
	this.heure=heure;
	}

	

	@Override
	public double calculerSalaire() {
		
		return heure * 65;

	}
	
		
}
