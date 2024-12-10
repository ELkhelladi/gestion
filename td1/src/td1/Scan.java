package td1;

import java.util.Scanner;

public class Scan {
	public static void main(String[]args) {
	int a,b;
    int S;
  Scanner clavier = new Scanner (System.in);
	System.out.println("enter a :");
	  a=clavier.nextInt();
	System.out.println("enter b :");
	  a=clavier.nextInt();

  S=a+b;
		 System.out.println("la somme de a et b est :"+S);
		 clavier.close(); 
	}
 
}
