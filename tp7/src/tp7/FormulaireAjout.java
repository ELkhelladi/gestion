package tp7;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class FormulaireAjout extends JFrame {
    
    private JTextField nomField, prenomField, ageField;
    private JButton btn1, btn2, btn3;

    
    private static final String URL = "jdbc:mysql://localhost:3306/bdtest"; 
    private static final String USER = "root"; 
    private static final String PASSWORD = ""; 

    public FormulaireAjout() {
        
        setTitle("Exemple Interface");
        setSize(530, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        nomField = new JTextField();
        prenomField = new JTextField();
        ageField = new JTextField();
        btn1 = new JButton("Ajouter");
        btn2 = new JButton("Supprimer");
        btn3 = new JButton("Afficher");

        
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

        
        add(pan2, BorderLayout.SOUTH);
        add(pan1, BorderLayout.CENTER);

        
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                     PreparedStatement ps = connection.prepareStatement("INSERT INTO personne (Nom, Prenom, Age) VALUES (?, ?, ?)")) {

                    ps.setString(1, nomField.getText());
                    ps.setString(2, prenomField.getText());
                    ps.setInt(3, Integer.parseInt(ageField.getText()));

                    ps.executeUpdate();
                    System.out.println("Enregistrement ajouté.");
                    nomField.setText("");
                    prenomField.setText("");
                    ageField.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                     PreparedStatement ps = connection.prepareStatement("DELETE FROM personne WHERE Nom = ? AND Prenom = ?")) {

                    ps.setString(1, nomField.getText());
                    ps.setString(2, prenomField.getText());

                    ps.executeUpdate();
                    System.out.println("Enregistrement supprimé.");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        DefaultTableModel tableModel=new DefaultTableModel(); 
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Effacer les données précédentes du tableau
                tableModel.setRowCount(0); // Réinitialise le modèle de tableau
                try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                     Statement stmt = connection.createStatement();
                     ResultSet rs = stmt.executeQuery("SELECT * FROM personne")) {

                    // Parcours des résultats et ajout dans le tableau
                    while (rs.next()) {
                        String nom = rs.getString("Nom");
                        String prenom = rs.getString("Prenom");
                        int age = rs.getInt("Age");
                        // Ajouter une nouvelle ligne au modèle du tableau
                        tableModel.addRow(new Object[]{nom, prenom, age});
                    }

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });


        
        setVisible(true);
    }

    public static void main(String[] args) {
        new FormulaireAjout();
    }
}
