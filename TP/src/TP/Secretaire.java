package TP;

 class Secretaire extends Employe{
	public Secretaire() {
		super();
	}
	
	public Secretaire(String nom, int annee, String laboInst, double salaire) {
		super(nom, annee, laboInst, salaire);
	}
	
	@Override
	/*public void afficher() {
		System.out.println("Secretaire : ");
		super.afficher();
	}*/
	public String toString() {
		System.out.println("Secretaire : ");
		return super.toString();
		
	}
}

