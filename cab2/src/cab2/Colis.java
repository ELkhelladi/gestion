package cab2;

public class Colis extends Courrier {
	protected double volume;
	public Colis(double poids, String mode, String adress,double volume) {
		super(poids, mode, adress);
		this.volume=volume;
	}

	@Override
	public double timbrer() {
		
		return( 0.25*volume)+(0.1*poids);
	}
	public boolean inValide() {
	    return adress == null || volume > 50;
	}
}
