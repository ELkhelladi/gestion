	package serie2;

public class Main {
	public static void main(String[] args) {
        Personnel p = new Personnel();

        p.ajouterEmploye(new Vendeur("Mourad", "Business", 45, "1995", 30000));
        p.ajouterEmploye(new Representant("Mohamed", "Vendtout", 25, "2001", 20000));
        p.ajouterEmploye(new Production("Yves", "Boss", 28, "1998", 1000));
        p.ajouterEmploye(new Manutention("Jeanne", "Stocktout", 32, "1998", 200));
        p.ajouterEmploye(new ProductionARisque("Jean", "Flippe", 28, "2000", 1000));
        p.ajouterEmploye(new ManutentionARisque("Ali", "Abordage", 30, "2001", 45));

        p.afficherSalaires();
        System.out.println("Le salaire moyen dans l'entreprise est de " + p.salaireMoyen() + " Dhs.");
    }

}
