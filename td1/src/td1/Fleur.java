package td1;

class Fleur {
    private String nom;
    private String couleur;
    private boolean eclose;
    public Fleur(String nom, String couleur) {
        this.nom = nom;
        this.couleur = couleur;
        this.eclose = false;
    }

    public Fleur(Fleur autreFleur) {
        this.nom = autreFleur.nom;
        this.couleur = autreFleur.couleur;
        this.eclose = autreFleur.eclose;
    }

  
    public void eclore() {
        eclose = true;
        System.out.println("Fragile corolle taillée dans un cristal veiné de " + couleur);
    }

  
    @Override
    public String toString() {
        if (eclose) {
            return "qu'un simple souffle";
        } else {
            return nom + " fraichement cueillie";
        }
    }
}

