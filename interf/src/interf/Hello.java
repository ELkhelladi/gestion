package interf;

import javax.swing.*;
import java.awt.*;

public class Hello extends JFrame {
    public Hello() {
        setTitle("Hello World");
        setSize(300, 200);
        Container c = getContentPane();
        c.setBackground(Color.YELLOW);
        setIconImage(new ImageIcon("c:\\Users\\...\\icon.gif").getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        Hello f = new Hello();
        f.setVisible(true);
    }
}
