package View;

import Controller.EmployeeController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeView extends JFrame {
    private JTextField nomField, prenomField, emailField, telephoneField, salaireField;
    private JComboBox<String> posteBox, roleBox;
    public JButton ajouterButton;

    public EmployeeView(EmployeeController controller) {
        setTitle("Ajouter un employé");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 2));

        // Champs de formulaire
        add(new JLabel("Nom:"));
        nomField = new JTextField();
        add(nomField);

        add(new JLabel("Prénom:"));
        prenomField = new JTextField();
        add(prenomField);

        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        add(new JLabel("Téléphone:"));
        telephoneField = new JTextField();
        add(telephoneField);

        add(new JLabel("Poste:"));
        posteBox = new JComboBox<>(new String[]{"INGENIEUR", "TECHNICIEN", "MANAGER"});
        add(posteBox);

        add(new JLabel("Role:"));
        roleBox = new JComboBox<>(new String[]{"ADMIN", "EMPLOYE"});
        add(roleBox);

        add(new JLabel("Salaire:"));
        salaireField = new JTextField();
        add(salaireField);

        // Bouton Ajouter
        ajouterButton = new JButton("Ajouter");
        add(ajouterButton);

        ajouterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nom = nomField.getText();
                String prenom = prenomField.getText();
                String email = emailField.getText();
                String telephone = telephoneField.getText();
                String poste = (String) posteBox.getSelectedItem();
                String role = (String) roleBox.getSelectedItem();
                double salaire = Double.parseDouble(salaireField.getText());

                controller.addEmployee(nom, prenom, email, telephone, poste, role, salaire);
                JOptionPane.showMessageDialog(EmployeeView.this, "Employé ajouté avec succès !");
            }
        });

        setVisible(true);
    }
}
