package Inherit;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {

    public MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.getContentPane().setBackground(new Color(41,189,193));
        this.setSize(600, 800);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
}
