package Inherit;

import java.awt.Color;
import javax.swing.JFrame;

public class NewPage{

    JFrame page = new JFrame();

    public NewPage () {

        page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        page.getContentPane().setBackground(Color.blue);
        page.setVisible(true);
        page.setSize(500, 700);
        page.setLayout(null);
        
        


    }
}
