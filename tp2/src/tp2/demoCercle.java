package tp2;

	import java.util.Scanner;

	public class demoCercle {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Veuillez entrer le rayon du cercle : ");
	        double rayon = scanner.nextDouble(); 
	        Cercle c = new Cercle(rayon);
	        System.out.println("Surface du cercle: " + c.surface());
	        System.out.println("Périmètre du cercle: " + c.perimetre());
	        System.out.println(c);
	        
	    }
	}

