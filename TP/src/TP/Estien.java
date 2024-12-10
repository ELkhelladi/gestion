package TP;

class Estien {
	protected String nom;
	protected int annee;
	
	public Estien() {

	}

	public Estien(String nom, int annee) {
		super();
		this.nom = nom;
		this.annee = annee;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
	/*protected void afficher() {
		System.out.println("   Nom  : " + nom);
		System.out.println("   Annee  : " + annee);
	}*/
	
	public String toString() {
		return "nom :  "+nom+"    ,   "+"annee  : "+annee;
		
	}
	
}
