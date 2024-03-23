// Day 23 of 100
// Open new window

import Inherit.NewPage;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DayTwentyThree implements ActionListener {

    JFrame page;
    JButton button;

    public DayTwentyThree() {
        page = new JFrame();
        button = new JButton("click me");

        page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        page.getContentPane().setBackground(Color.YELLOW);
        page.setVisible(true);
        page.setSize(500, 700);
        page.setLayout(null);
        button.setBounds(100, 120, 100, 50);
        button.addActionListener(this);
        page.add(button);
    }

    public static void main(String[] args) {
        new DayTwentyThree();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            NewPage newPage = new NewPage();
        }
    }
}