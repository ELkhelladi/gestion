package cab2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calcule extends JFrame {
    private JTextField firstNumberField, secondNumberField;
    private JLabel resultLabel;

    public calcule() {
        setTitle("Ma Fenêtre");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel firstLabel = new JLabel("Premier nombre :");
        firstLabel.setBounds(10, 10, 120, 25);
        add(firstLabel);

        firstNumberField = new JTextField();
        firstNumberField.setBounds(140, 10, 100, 25);
        add(firstNumberField);

        JLabel secondLabel = new JLabel("Deuxième nombre :");
        secondLabel.setBounds(10, 40, 120, 25);
        add(secondLabel);

        secondNumberField = new JTextField();
        secondNumberField.setBounds(140, 40, 100, 25);
        add(secondNumberField);

        JButton sumButton = new JButton("La somme");
        sumButton.setBounds(10, 80, 100, 25);
        add(sumButton);

        JButton productButton = new JButton("Le produit");
        productButton.setBounds(120, 80, 100, 25);
        add(productButton);

        JButton subtractButton = new JButton("La soustraction");
        subtractButton.setBounds(10, 120, 100, 25);
        add(subtractButton);

        JButton divideButton = new JButton("La division");
        divideButton.setBounds(120, 120, 100, 25);
        add(divideButton);

        resultLabel = new JLabel("Résultat : ");
        resultLabel.setBounds(10, 160, 250, 25);
        add(resultLabel);

        // Actions des boutons
        sumButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculer("somme");
            }
        });

        productButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculer("produit");
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculer("soustraction");
            }
        });

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculer("division");
            }
        });
    }

    private void calculer(String operation) {
        try {
            double num1 = Double.parseDouble(firstNumberField.getText());
            double num2 = Double.parseDouble(secondNumberField.getText());
            double resultat = 0;

            switch (operation) {
                case "somme":
                    resultat = num1 + num2;
                    break;
                case "produit":
                    resultat = num1 * num2;
                    break;
                case "soustraction":
                    resultat = num1 - num2;
                    break;
                case "division":
                    if (num2 != 0) {
                        resultat = num1 / num2;
                    } else {
                        resultLabel.setText("Erreur : Division par zéro.");
                        return;
                    }
                    break;
            }
            resultLabel.setText("Résultat : " + resultat);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Erreur : Entrée invalide.");
        }
    }

    public static void main(String[] args) {
        calcule frame = new calcule();
        frame.setVisible(true);
    }
}