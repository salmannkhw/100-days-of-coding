// Day 19 of 100
// Button

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;

public class DayNineteen {
    public static void main(String[] args) {
        ImageIcon logo = new ImageIcon("./Inherit/Fox.png");
        JFrame bg = new JFrame();
        JButton click = new JButton();

        bg.setLayout(null);
        bg.setSize(600, 800);
        bg.setVisible(true);
        bg.setTitle("Vision");
        bg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bg.setIconImage(logo.getImage());
        bg.getContentPane().setBackground(new Color(164, 190, 92));

        click.setLayout(null);
        click.setBounds(250, 100, 100, 50);
        click.addActionListener(e -> System.out.println("Clicked"));
        click.setText("Click me");
        click.setFocusable(false);
        click.setFont(new Font("Comic Sans", Font.BOLD, 15));
        click.setBorder(BorderFactory.createBevelBorder(5));
        bg.add(click);


    }
}
