package cab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EX1 extends JFrame {
    private JTextField A, B, C;
    private JLabel result;

    public EX1() {
        
        setTitle("calcul equation");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        
        A = new JTextField(5);
        B = new JTextField(5);
        C = new JTextField(5);

        
        add(A);
        add(new JLabel("X² +"));
        add(B);
        add(new JLabel("X +"));
        add(C);
        add(new JLabel("= 0"));

        
        JButton calcButton = new JButton("get resultat");
        add(calcButton);

        
        result = new JLabel("");
        add(result);

       
        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateSolutions();
            }
        });
    }

    private void calculateSolutions() {
        try {
            double a = Double.parseDouble(A.getText());
            double b = Double.parseDouble(B.getText());
            double c = Double.parseDouble(C.getText());

            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                result.setText("Deux solutions: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                result.setText("Une solution unique: x = " + x);
            } else {
                result.setText("Pas de solution réelle.");
            }
        } catch (NumberFormatException ex) {
            result.setText("Veuillez entrer des valeurs numériques valides.");
        }
    }

    public static void main(String[] args) {
        EX1 frame = new EX1();
        frame.setVisible(true);
    }
}
