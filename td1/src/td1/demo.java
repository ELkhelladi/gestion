package td1;

import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer la valeur de extr1: ");
        double extr1 = scanner.nextDouble();

        System.out.print("Entrer la valeur de extr2: ");
        double extr2 = scanner.nextDouble();
        Segment s = new Segment(extr1, extr2);
        System.out.println("Longueur du segment: " + s.getLongeur());

        
        System.out.println("Le point 3 appartient-il au segment ? " + s.appartient(3));

     
        s.ordonne();
        System.out.println("Segment après ordonnancement : " + s);

        
        System.out.println(s.toString());
        scanner.close();
    }
}
