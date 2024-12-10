package TP;

 class Employe extends Estien {
	protected String laboInst;
	protected Double salaire;
	
	public Employe() {
		super();
	}
	
	public Employe(String nom, int annee, String laboInst, double salaire) {
		super(nom, annee);
		this.laboInst = laboInst;
		this.salaire = salaire;
	}

	public String getLaboInst() {
		return laboInst;
	}

	public void setLaboInst(String laboInst) {
		this.laboInst = laboInst;
	}

	public Double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
	
	/*@Override
	public void afficher() {
		super.afficher();
		System.out.println("   Laboratoire / Institut : " + laboInst);
		System.out.println("   Salaire : " + salaire);
	}*/
	@Override
	public String toString() {
		return super.toString()+"    laboratoire :  "+laboInst+"  ,  "+"salaire :  "+salaire;
		
	}
}

