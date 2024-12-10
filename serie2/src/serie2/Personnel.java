package serie2;

import java.util.ArrayList;

public class Personnel {
	    private ArrayList<Employe> employes;

	    public Personnel() {
	        employes = new ArrayList<>();
	    }

	    public void ajouterEmploye(Employe e) {
	        employes.add(e);
	    }

	    public void afficherSalaires() {
	        for (Employe e : employes) {
	        	System.out.println(e.getClass().getSimpleName());
	            System.out.println(e.toString() + " gagne " + e.calculerSalaire() + " Dhs.");
	            
	        }
	    }

	    public double salaireMoyen() {
	        double total = 0;
	        for (Employe e : employes) {
	            total += e.calculerSalaire();
	        }
	        return total / employes.size();
	    }
	}
