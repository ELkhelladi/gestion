package connixion;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class FormulaireAjout extends JFrame {
    // Déclaration des composants
    private JTextField nomField, prenomField, ageField;
    private JButton btn1, btn2, btn3;

    // Déclaration des variables de connexion JDBC
    private static final String URL = "jdbc:mysql://localhost:3306/Personne_db"; // Remplacez 'nom_base' par le nom de votre base de données
    private static final String USER = "root"; // Remplacez par votre nom d'utilisateur de la BD
    private static final String PASSWORD = ""; // Remplacez par votre mot de passe de la BD

    public FormulaireAjout() {
        // Configuration de la fenêtre
        setTitle("Exemple Interface");
        setSize(530, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialisation des composants
        nomField = new JTextField();
        prenomField = new JTextField();
        ageField = new JTextField();
        btn1 = new JButton("Ajouter");
        btn2 = new JButton("Supprimer");
        btn3 = new JButton("Afficher");

        // Panneaux et disposition
        JPanel pan2 = new JPanel(new GridLayout(1, 3));
        JPanel pan1 = new JPanel(new GridLayout(3, 2));

        pan1.add(new JLabel("Nom"));
        pan1.add(nomField);
        pan1.add(new JLabel("Prénom"));
        pan1.add(prenomField);
        pan1.add(new JLabel("Age"));
        pan1.add(ageField);
        pan2.add(btn1);
        pan2.add(btn2);
        pan2.add(btn3);

        // Ajout des panneaux
        add(pan2, BorderLayout.SOUTH);
        add(pan1, BorderLayout.CENTER);

        // Écouteur d'événement pour le bouton "Ajouter"
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                     PreparedStatement ps = connection.prepareStatement("INSERT INTO personnes (nom, prenom, age) VALUES (?, ?, ?)")) {

                    ps.setString(1, nomField.getText());
                    ps.setString(2, prenomField.getText());
                    ps.setInt(3, Integer.parseInt(ageField.getText()));

                    ps.executeUpdate();
                    System.out.println("Enregistrement ajouté.");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Écouteur d'événement pour le bouton "Supprimer"
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                     PreparedStatement ps = connection.prepareStatement("DELETE FROM personnes WHERE nom = ? AND prenom = ?")) {

                    ps.setString(1, nomField.getText());
                    ps.setString(2, prenomField.getText());

                    ps.executeUpdate();
                    System.out.println("Enregistrement supprimé.");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Écouteur d'événement pour le bouton "Afficher"
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                     Statement stmt = connection.createStatement();
                     ResultSet rs = stmt.executeQuery("SELECT * FROM personnes")) {

                    while (rs.next()) {
                        String nom = rs.getString("nom");
                        String prenom = rs.getString("prenom");
                        int age = rs.getInt("age");
                        System.out.println("Nom: " + nom + ", Prénom: " + prenom + ", Age: " + age);
                    }

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Rendre la fenêtre visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new FormulaireAjout();
    }
}