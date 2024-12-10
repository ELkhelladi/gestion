package TP;
 class Etudiant extends Estien {
	protected String section;
	protected double note;

	
	public Etudiant(String nom, int annee,double note, String section) {
		super(nom, annee);
		this.section = section;
		this.note=note;
	}
	
	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	@Override
	/*public void afficher() {
		super.afficher();
		System.out.println("   Section : " + section);
	}*/
	public String toString() {
		return super.toString()+"   Section : " + section+"  note: "+note;
		
	}
}
