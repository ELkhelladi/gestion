package cab2;

public class Publicite extends Courrier {
	public Publicite(double poids, String mode, String adress) {
		super(poids, mode, adress);

	}

	@Override
	public double timbrer() {
		return 5*poids;
	}

}
