// Day 18 of 100
// Continuing GUI with Swing. Panels

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;

public class DayEighteen {
    public static void main(String[] args) {
        ImageIcon logo = new ImageIcon("./Inherit/Fox.png");
        JFrame bg = new JFrame();
        JPanel redCard = new JPanel();
        JPanel blueCard = new JPanel();
        JPanel greenCard = new JPanel();

        bg.setSize(600, 800);
        bg.setVisible(true);
        bg.setTitle("Vision");
        bg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bg.setIconImage(logo.getImage());
        bg.getContentPane().setBackground(new Color(164, 190, 92));

        redCard.setBackground(Color.red);
        redCard.setBounds(0, 0, 100, 100);
        bg.add(redCard);

        blueCard.setBackground(Color.blue);
        blueCard.setBounds(100, 0, 100, 100);
        bg.add(blueCard);

        greenCard.setBackground(Color.green);
        greenCard.setBounds(0, 100, 200, 100);
        bg.add(greenCard);

    }
}