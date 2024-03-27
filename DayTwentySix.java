// Day 27 of 100
// CheckBox
// radio button


import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

import Inherit.MyFrame;

public class DayTwentySix {

    public static void main(String[] args) {

        MyFrame bg = new MyFrame();

        JCheckBox checkBox = new JCheckBox();
        checkBox.setText("Hooman?");
        checkBox.setFocusable(false);

        JRadioButton button1 = new JRadioButton("One");
        JRadioButton button2 = new JRadioButton("Two");
        JRadioButton button3 = new JRadioButton("Three");

        button1.setFocusable(false);
        button2.setFocusable(false);
        button3.setFocusable(false);

        ButtonGroup gang = new ButtonGroup();
        gang.add(button1);
        gang.add(button2);
        gang.add(button3);
        
        bg.add(button1);
        bg.add(button2);
        bg.add(button3);
        bg.add(checkBox);
        bg.setVisible(true);

    }
    
}
