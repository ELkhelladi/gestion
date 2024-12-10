package cab2;

public class Lettre extends Courrier{
	protected String format;
public Lettre(double poids, String mode, String adress , String format) {
		super(poids, mode, adress);
		this.format=format;
}		
public double tarifBase() {
    if (format.equals("A4")) {
        return 2.5;
    }
    return 3.5;
}
@Override
public double timbrer() {
    return  (poids * 0.1 )+tarifBase();
    
}
	
}
