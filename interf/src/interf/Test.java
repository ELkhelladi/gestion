package interf;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
public class Test extends JFrame {
private JButton sud1 = new JButton ("sud1");
private JButton sud2 = new JButton ("sud2");
private JTextField centre = new JTextField ("");
private JButton est = new JButton ("est");
private JButton north = new JButton ("north");
private JPanel pan1 = new JPanel();
private JPanel pan2 = new JPanel();
private JPanel pan3 = new JPanel();
private JPanel pan4 = new JPanel();
private JPanel pan5 = new JPanel();
private JPanel pan6 = new JPanel();
public Test(){
setTitle("Mélange de Layouts "); 
setSize(300,250);
add(pan1);
pan1.setLayout(new BorderLayout());
pan1.add(sud1,BorderLayout.SOUTH); 
pan1.add(pan2,BorderLayout.CENTER);
pan1.add(pan4,BorderLayout.EAST);

pan2.setLayout(new BorderLayout());
pan2.add(pan3,BorderLayout.NORTH); 
pan2.add(centre, BorderLayout.CENTER);
pan2.add(pan5,BorderLayout.SOUTH);
pan3.setLayout(new GridLayout(5,1));
pan3.add(new JLabel("Nom"));
pan3.add(new JTextField(""));
pan3.add(new JLabel("prenom"));
pan3.add(new JTextField(""));
pan3.add(new JLabel("adresse"));
pan4.setLayout(new GridLayout(9,1));

pan4.add(new JCheckBox("tennis"));
pan4.add(new JCheckBox("squash"));
pan4.add(new JCheckBox("natation"));
pan4.add(new JCheckBox("athletisme"));
pan4.add(new JCheckBox("randonnée"));
pan4.add(new JCheckBox("foot"));
pan4.add(new JCheckBox("basket"));
pan4.add(new JCheckBox("volley"));
pan4.add(new JCheckBox("pelanque"));
pan1.add(pan6,BorderLayout.SOUTH); 
pan5.setLayout(new FlowLayout());
pan5.add(new JLabel("sexe"));
pan5.add(new JRadioButton("homme"));
pan5.add(new JRadioButton("femme"));
pan6.setLayout(new FlowLayout());
pan6.add(new JButton("ok"));
pan6.add(new JButton("annuler"));


setDefaultCloseOperation(EXIT_ON_CLOSE);
setLocationRelativeTo(null);
setVisible(true); 
}
public static void main(String[] args) {
	new Test();
}
}
