package TP;
 class ERegulier extends Etudiant {



	public ERegulier(String nom, int annee, String section, double note) {
		super(nom, annee, note, section);
	}

	

	
	
	@Override
	/*public void afficher() {
		System.out.println("Etudiant regulier : ");
		super.afficher();
		System.out.println("  Note : " + note);
	}*/
	
	public String toString() {
		System.out.println("Etudiant regulier : ");
		return super.toString();
		
	}
}

