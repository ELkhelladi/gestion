package cab2;
import java.awt.*; import javax.swing.*;

import java.awt.event.*;
public class TestEvent extends Frame {
Label l=new Label("Votre Nom:");
TextField t=new TextField (12); 
List liste =new List(); 
Panel p=new Panel();
Button b =new Button ("Ajouter"); 
Button b2 =new Button ("Quitter");
public TestEvent(){ 
add(p); 
p.setLayout(new FlowLayout ());
p.add(l);
p.add(t); 
p.add(b); 
p.add(b2);
p.add(liste); 
b.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
liste.add (t.getText());//Lire le contenu du t et l’ajouter à la liste
t.setText("");
}});
b2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
System.exit(0); }}); 
setBounds(10,10,250,250);
 }
public static void main(String[] args) {
    
	TestEvent f = new TestEvent();
    f.setVisible(true);
}
}
