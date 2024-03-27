// Day 27 of 100
// ComboBoxes
// Slider

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

import Inherit.MyFrame;

public class DayTwentySeven {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        String [] countriesArray = {" -- select -- ", "India", " Japan", "SriLanka", "China", "Pakistan", "Afghanistan"};
        MyFrame home = new MyFrame();
        @SuppressWarnings("rawtypes")
        JComboBox nations = new JComboBox<>(countriesArray);
        nations.addItem("Uzbekistan");
        nations.setSelectedIndex(0);
        // nations.setEditable(true);
        nations.removeItem("SriLanka");
        // nations.removeAllItems();

        JSlider slider = new JSlider(0, 100, 50);       // min, max, start value
        JPanel panel = new JPanel();
        JLabel label = new JLabel();

        slider.setFocusable(false);
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTrack(true);
        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(25);
        slider.setOrientation(SwingConstants.VERTICAL);
        panel.add(slider);
        panel.add(label);
        label.setText("Score");


        home.add(nations);
        home.add(panel);
        home.setVisible(true);
    }
}
