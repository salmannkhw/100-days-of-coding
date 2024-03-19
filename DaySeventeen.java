// Day 17 of 100
// Continuing GUI with Swing.

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.border.Border;

public class DaySeventeen {
    public static void main(String[] args) {
        ImageIcon logo = new ImageIcon("./Inherit/Fox.png");  // Will need it for setting logo
        ImageIcon fox = new ImageIcon("./Inherit/Fox1.jpg");  // For using it in Label
        JFrame bg = new JFrame();       // Creates a frame
        JLabel prompt = new JLabel();   // Creates a label      // can pass String as an argument to set a text.
        Border fence = BorderFactory.createLineBorder(Color.ORANGE, 3);

        bg.setSize(600, 800);           // Width, Height
        bg.setVisible(true);            // accepts boolean
        bg.setTitle("Vision");
        bg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // this will close the app when clicking on X button. Default: will close just frame
        bg.setIconImage(logo.getImage());       // getImage() function will take image from logo object
        bg.getContentPane().setBackground(new Color(164, 190, 92));  // BG color

        prompt.setText ("It is my logo"); 
        prompt.setPreferredSize(new Dimension(100, 100));       // set size
        bg.add(prompt);                                         //  IMPT 
        prompt.setIcon(fox);
        prompt.setHorizontalAlignment(JLabel.CENTER);
        prompt.setHorizontalTextPosition(JLabel.CENTER);        // Text positioning
        prompt.setVerticalTextPosition(JLabel.BOTTOM);
        prompt.setForeground(Color.blue);                       // Set color
        prompt.setFont (new Font ("MV Boli",Font.PLAIN, 15));   // Set font
        prompt.setIconTextGap(5);
        prompt.setBackground(Color.black);                      // Background color for Label
        prompt.setOpaque(true);                                 // IMPT
        prompt.setBorder(fence);

        bg.setLayout(null); // helps to set bounds for lable
        prompt.setBounds(200, 200, 120, 180);
        // bg.pack()                                            // useful

        

    }
}