package cab2;

public class Poste {
    public static void main(String[] args) {
    	BoitLettre boite = new BoitLettre();

        // Ajout de courriers à la boîte
        boite.ajouterCourrier(new Lettre(200, "oui", "Avenue Hassan II, Rabat", "A3"));
        boite.ajouterCourrier(new Lettre(800, "non", "", "A4")); // Lettre invalide
        boite.ajouterCourrier(new Publicite(1500, "oui", "Avenue Jrifat, 25 bis, Safi"));
        boite.ajouterCourrier(new Colis(5000, "oui", "Rue lala Maryam, 18, Kenitra", 30));
        boite.ajouterCourrier(new Colis(3000, "oui", "Avenue Matar, N'19 rue rahma", 70)); // Colis invalide

        // Affichage du contenu de la boîte
        boite.afficher();

        // Calcul et affichage du montant total de timbrage
        System.out.println("Le montant total de timbrage est de: " + boite.timbrer() + " Dhs");
    }
}
