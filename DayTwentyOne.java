// Day 21 of 100
// Flow Layout

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DayTwentyOne {

    public static void main(String[] args) {

        JFrame home = new JFrame();
        home.setVisible(true);
        home.getContentPane().setBackground(new Color(240, 200,100));
        home.setSize(600, 800);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        panel1.setBackground(Color.GREEN);
        panel2.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(200, 350));
        panel2.setPreferredSize(new Dimension(200, 350));

        panel1.setLayout(new FlowLayout());
        home.add(panel1, BorderLayout.CENTER);
        home.add(panel2, BorderLayout.EAST);


        for (int i = 1; i < 16; i++) {
            panel1.add(new JButton("" + i));
        }

        
    }
}