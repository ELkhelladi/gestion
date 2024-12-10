package cab2;

public abstract class Courrier {
	protected double poids;
	protected String mode;
	protected String adress;
	public Courrier (double poids,String mode,String adress) {
		this.poids=poids;
		this.mode=mode;
		this.adress=adress;
	}
	public abstract double timbrer();
	public boolean courrierInvalide() {
	    if (adress == null) {
	        return true; // Retourne true si l'adresse est nulle (indiquant que le courrier est invalide)
	    }
	    return false; // Sinon, retourne false (le courrier est valide)
	}
	@Override
    public String toString() {
        return   	adress + " " +mode+ " "+poids ;
    }
}
