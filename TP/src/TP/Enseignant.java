package TP;

 class Enseignant extends Employe {
	private String section;
	
	public Enseignant() {
		super();
	}
	
	public Enseignant(String nom, int annee, String laboInst, double salaire, String section) {
		super(nom, annee, laboInst, salaire);
		this.section = section;
	}
	
	@Override
	/*public void afficher() {
		System.out.println("Enseignant : ");
		super.afficher();
		System.out.println("   Section : " + section);
	}*/
	public String toString() {
	System.out.println("Enseignant:");
		return super.toString()+"  Section : "+section;
		
	}  
}
