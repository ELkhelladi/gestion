package tp2;

public class CompteBancaire {
	private double solde;
	private int numCompte;
	private static int numComptes;
	private static int compteur = 0;
	public CompteBancaire(double solde,int numComptes) {
        this.solde = solde;
        this.numCompte = ++compteur;
    }
	public void afficheNumCompte() {
        System.out.println("Numéro de compte : " + numCompte);
    }
}
