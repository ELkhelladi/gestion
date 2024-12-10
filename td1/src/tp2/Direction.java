package tp2;

public class Direction {
    public static void main(String[] args) {
        Ecole ecole = new Ecole();

        Etudiant etudiant1 = new Etudiant("Mohammed Nouri", 2013, "SIGID", 16.36);
        Etudiant etudiant2 = new Etudiant("Chaimae Mhisar", 2011, "SZGI", 17.5);
        EtudiantEchange etudiant3 = new EtudiantEchange("Björn Borgue", 2012, "SMeca", 13.5, "KTH");

        Enseignant enseignant = new Enseignant("Abdellah Moslih", 1998, 30000, "LABSSIS", "S1PQC");
        Secretaire secretaire = new Secretaire("Najat Tahiri", 2005, 5000, "LABSSIS");

        ecole.ajouterESTien(etudiant1);
        ecole.ajouterESTien(etudiant2);
        ecole.ajouterESTien(etudiant3);
        ecole.ajouterESTien(enseignant);
        ecole.ajouterESTien(secretaire);

        System.out.println("Liste des ESTiens :");
        ecole.afficherESTiens();

        System.out.println("\nAncienneté moyenne : " + ecole.calculerAncienneteMoyenne() + " ans");
    }
}