package cab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TP6 extends JFrame {
    // Déclaration des composants
    private JTextField nomField, prenomField, ageField;
    private JButton ajouterButton, supprimerButton, modifierButton;

    public TP6() {
        // Configuration de la fenêtre
        setTitle("Exemple Interface");
        setSize(530, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialisation des composants
        nomField = new JTextField();
        prenomField = new JTextField();
        ageField = new JTextField();

        ajouterButton = new JButton("Ajouter");
        supprimerButton = new JButton("Supprimer");
        modifierButton = new JButton("Modifier");

        // Panneaux et disposition
        JPanel panel1 = new JPanel(new GridLayout(1, 3));
        JPanel panel2 = new JPanel(new GridLayout(3, 2));

        // Ajout des champs et étiquettes au panneau panel2
        panel2.add(new JLabel("Nom"));
        panel2.add(nomField);
        panel2.add(new JLabel("Prénom"));
        panel2.add(prenomField);
        panel2.add(new JLabel("Age"));
        panel2.add(ageField);

        // Ajout des boutons au panneau panel1
        panel1.add(ajouterButton);
        panel1.add(supprimerButton);
        panel1.add(modifierButton);

        // Ajout des panneaux à la fenêtre
        add(panel1, BorderLayout.SOUTH);
        add(panel2, BorderLayout.CENTER);

        // Ajout des écouteurs d'événements aux boutons
        ajouterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Récupération des valeurs et affichage dans la console
                String nom = nomField.getText();
                String prenom = prenomField.getText();
                String age = ageField.getText();
                System.out.println("Nom: " + nom + ", Prénom: " + prenom + ", Age: " + age);
            }
        });

        supprimerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Effacer les champs de texte
                nomField.setText("");
                prenomField.setText("");
                ageField.setText("");
                System.out.println("Les informations ont été supprimées.");
            }
        });

        modifierButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code de modification à ajouter ici (si nécessaire)
                System.out.println("Modification des informations.");
            }
        });

        // Rendre la fenêtre visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new TP6();
    }
}
