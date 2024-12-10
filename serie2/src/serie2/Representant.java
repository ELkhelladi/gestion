package serie2;

public class Representant  extends Commercial   {

	public Representant(String nom, String prenom, int age, String dateEntree, double chiffreAffaire2) {
		super(nom, prenom, age, dateEntree, chiffreAffaire2);
		
	}

	@Override
	public double calculerSalaire() {

		return (0.2 * super.chiffreAffaire) + 8000;
	}
	
}


