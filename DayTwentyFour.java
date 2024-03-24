// Day 24 of 100
// JoptionPane

import javax.swing.JOptionPane;

public class DayTwentyFour {
    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Hello Earth", "Title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello Earth", "Title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello Earth", "Title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello Earth", "Title", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello Earth", "Title", JOptionPane.ERROR_MESSAGE);

        JOptionPane.showConfirmDialog(null, "Are you from earth?", "Home Planet", JOptionPane.YES_NO_CANCEL_OPTION);
        // Sysout can be used to find the return int

        String name = JOptionPane.showInputDialog("What is your name");
        System.out.println(name);

        JOptionPane.showOptionDialog(null, "Hey bro", "Title", JOptionPane.YES_NO_OPTION, 0, null, null, 0);

    }
}
