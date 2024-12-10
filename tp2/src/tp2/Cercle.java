package tp2;

import java.util.Scanner;

public class Cercle {
	private double rayon;
	public Cercle () {
		this.rayon=0;
	}
public Cercle (double rayon) {
	this.rayon=rayon;
}
/*public Cercle(double rayoun ) {
	Scanner scan=new Scanner(System.in);
	System.out.println("la valeur de rayoun");
	 rayon=scan.nextDouble();
	 this.rayon=rayon;
}*/

public double surface() {
    return Math.PI * rayon * rayon;
}
public double perimetre() {
    return 2 * Math.PI * rayon;
}
public String toString() {
    return "Cercle de rayon " + rayon;
}
}