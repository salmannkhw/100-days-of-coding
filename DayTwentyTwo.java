// Day 22 of 100
// Grid Layout, Layered Pane

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class DayTwentyTwo {

    public static void main (String [] args) {

        JFrame home = new JFrame();
        home.setVisible(true);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.getContentPane().setBackground(Color.DARK_GRAY);
        home.setSize(600, 800);

        // home.setLayout(new GridLayout(3, 4, 10, 10));   // Rows and Columns, optional (Hmargin, Vmargin)
        // for (int i = 1; i < 13; i++) {
        //     home.add(new JButton("" + i));
        // }
        
        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.BLUE);
        label1.setBounds(50, 50, 200, 300);
        
        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setBounds(75, 75, 200, 300);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.red);
        label3.setBounds(100, 100, 200, 300);

        JLayeredPane stack = new JLayeredPane();
        stack.setBounds(0, 0, 600, 800);
        stack.setBackground(Color.lightGray);
        stack.setOpaque(true);
        home.add(stack);

        stack.add(label1);
        stack.add(label2);
        stack.add(label3);
        
        
    }
}