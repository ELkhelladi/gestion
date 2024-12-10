package cab2;
import java.awt.*; 
import java.awt.event.*;

public class ex extends Frame {
    Label lNom = new Label("Nom:");
    Label lPrenom = new Label("Prénom:");
    Label lAge = new Label("Âge:");
    
    TextField tNom = new TextField(12);      // Champ pour le nom
    TextField tPrenom = new TextField(12);   // Champ pour le prénom
    TextField tAge = new TextField(3);       // Champ pour l'âge (limité à 3 caractères)

    List liste = new List(); 
    Panel p = new Panel(new GridLayout(4, 2, 5, 5)); // Panel avec une grille de 4 lignes x 2 colonnes
    Button bAjouter = new Button("Ajouter"); 
    Button bQuitter = new Button("Quitter");

    public ex() { 
        add(p, BorderLayout.NORTH); // Positionner le panel en haut de la fenêtre
        add(liste, BorderLayout.CENTER); // Placer la liste au centre de la fenêtre

        // Ajout des labels et champs de texte dans la grille
        p.add(lNom);
        p.add(tNom);
        p.add(lPrenom);
        p.add(tPrenom);
        p.add(lAge);
        p.add(tAge);

        // Ajout des boutons dans le bas de la grille
        p.add(bAjouter); 
        p.add(bQuitter);

        // Action pour le bouton "Ajouter"
        bAjouter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lire les informations entrées dans les champs
                String nom = tNom.getText();
                String prenom = tPrenom.getText();
                String age = tAge.getText();

                // Ajouter les informations sous forme de chaîne formatée à la liste
                liste.add("Nom: " + nom + " | Prénom: " + prenom + " | Âge: " + age);

                // Effacer les champs après l'ajout
                tNom.setText("");
                tPrenom.setText("");
                tAge.setText("");
            }
        });

        // Action pour le bouton "Quitter"
        bQuitter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        ex f = new ex();
        f.setVisible(true);
    }
}
