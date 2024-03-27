// Day 25 of 100
// Text field

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class DayTwentyFive{
    static JTextField uName = new JTextField();
    static JButton submit = new JButton("Submit");
    
    public static void main(String[] args) {
        JFrame home = new JFrame();
        home.setLayout(new FlowLayout());
        home.getContentPane().setBackground(new Color(234,255,123));
        home.setSize(600, 800);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        uName.setPreferredSize(new Dimension(200, 30)); 
        uName.setVisible(true);
        uName.setFont(new Font("Comic Sans", Font.PLAIN, 15));
        uName.setForeground(Color.blue);
        uName.setBackground(Color.lightGray);
        // uName.setText("Username");

        home.add(uName);
        home.add(submit);
        
        home.setVisible(true);      // this was causing glitch so added it after adding all component in JFrame
        
        
    }
}