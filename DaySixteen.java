// Day 16 of 100
// Started GUI with Swing.
// Understanding Concept

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class DaySixteen {
    static String path = "./Inherit/Fox.png";
    public static void main(String[] args) {
        ImageIcon logo = new ImageIcon(path);  // will need it for setting logo
        JFrame bg = new JFrame();       // Creates a frame
        
        bg.setSize(600, 800);           // Width, Height
        bg.setVisible(true);            // accepts boolean
        bg.setTitle("Vision");
        bg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // this will close the app when clicking on X button. Default: will close just frame
        bg.setIconImage(logo.getImage());       // getImage() function will take image from logo object
        bg.getContentPane().setBackground(new Color(164, 190, 92));  // BG color
    }
}