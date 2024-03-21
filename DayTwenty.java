// Day 20 of 100
// Border Layout

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DayTwenty {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(600, 800);
        frame.setLayout(new BorderLayout());

        JPanel lPanel = new JPanel();
        JPanel rPanel = new JPanel();
        JPanel tPanel = new JPanel();
        JPanel bPanel = new JPanel();
        JPanel cPanel = new JPanel();

        lPanel.setBackground(Color.BLUE);
        rPanel.setBackground(Color.CYAN);
        tPanel.setBackground(Color.RED);
        bPanel.setBackground(Color.MAGENTA);
        cPanel.setBackground(Color.LIGHT_GRAY);

        lPanel.setPreferredSize(new Dimension(80, 80));
        rPanel.setPreferredSize(new Dimension(80, 80));
        tPanel.setPreferredSize(new Dimension(80, 80));
        bPanel.setPreferredSize(new Dimension(80, 80));
        cPanel.setPreferredSize(new Dimension(80, 80));

        frame.add(lPanel, BorderLayout.WEST);
        frame.add(rPanel, BorderLayout.EAST);
        frame.add(tPanel, BorderLayout.NORTH);
        frame.add(bPanel, BorderLayout.SOUTH);
        frame.add(cPanel, BorderLayout.CENTER);

        // =============================== Adding Subpanel can have their own layout manager ================================

        cPanel.setLayout(new BorderLayout() {
            
        });
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.green);
        panel2.setBackground(Color.black);
        panel3.setBackground(Color.ORANGE);
        panel4.setBackground(Color.yellow);
        panel5.setBackground(Color.darkGray);

        panel1.setPreferredSize(new Dimension(40, 40));
        panel2.setPreferredSize(new Dimension(40, 40));
        panel3.setPreferredSize(new Dimension(40, 40));
        panel4.setPreferredSize(new Dimension(40, 40));
        panel5.setPreferredSize(new Dimension(40, 40));

        cPanel.add(panel1, BorderLayout.WEST);
        cPanel.add(panel2, BorderLayout.EAST);
        cPanel.add(panel3, BorderLayout.NORTH);
        cPanel.add(panel4, BorderLayout.SOUTH);
        cPanel.add(panel5, BorderLayout.CENTER);
        

    }
}