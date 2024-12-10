package cab2;

import java.util.ArrayList;

public class BoitLettre {
    private ArrayList<Courrier> boite= new ArrayList<>();

    public void ajouterCourrier(Courrier c) {
        boite.add(c);
    }

    
   public double timbrer() {
        double montantTotal = 0;
        for (Courrier c : boite) {
            montantTotal += c.timbrer();
        }
        return montantTotal;
    }

    // Méthode pour calculer le nombre de courriers invalides
    public int courriersInvalides() {
        int invalides = 0;
        for (Courrier courrier : boite) {
            if (courrier.courrierInvalide()) {
                invalides++;
            }
        }
        return invalides;
    }

    // Méthode pour afficher le contenu de la boîte aux lettres
    public void afficher() {
        for (Courrier c : boite) {
        	System.out.println(c.getClass().getSimpleName());
            System.out.println(c.toString());
            System.out.println(c.timbrer());
            System.out.println(c.courrierInvalide());
            
        }
        System.out.println("La boîte contient " + courriersInvalides() + " courriers invalides");
    }
}

