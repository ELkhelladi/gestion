package TP;
 class ETransfere extends Etudiant {
	private String universite;

	public ETransfere(String nom, int annee, String section,double note, String universite) {
		super(nom, annee, note,section);
		this.universite = universite;
	}

	public String getUniversite() {
		return universite;
	}

	public void setUniversite(String universite) {
		this.universite = universite;
	}

	@Override
/*	public void afficher() {
		System.out.println("Etudiant transfere : ");
		super.afficher();
		System.out.println("   Université : " + universite);
	}*/
	
	public String toString() {
		System.out.println("Etudiant transfere : ");
		return super.toString()+"   Université : " + universite;
		
	}
}

