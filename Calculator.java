import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{

    JFrame frame;
    JTextField field;
    JPanel panel, sPanel;
    JButton[] digits = new JButton[10];
    JButton[] ops = new JButton[8];
    JButton add, sub, mul, div, equ, del, clr, dec;
    Font font = new Font("helvetica", Font.PLAIN, 25);
    double n1 = 0, n2 = 0, eq=0;
    char operator;
    Color pColor = new Color(125, 125, 125);

    Calculator() {
        frame = new JFrame("Calc..");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 480);
        frame.getContentPane().setBackground(Color.lightGray);
        frame.setLayout(null);
        frame.setResizable(false);

        field = new JTextField();
        field.setBounds(15, 25, 280, 50);
        field.setFont(font);
        field.setEditable(false);       // so that I cannot edit it by clicking manully but can do it via setting up buttons

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("x");
        div = new JButton("\u00F7");
        equ = new JButton("=");
        del = new JButton("\u2190");
        clr = new JButton("C");
        dec = new JButton(".");


        ops[0] = add;
        ops[1] = sub;
        ops[2] = mul;
        ops[3] = div;
        ops[4] = equ;
        ops[5] = del;
        ops[6] = clr;
        ops[7] = dec;

        for (int i = 0; i <=9; i++) {
            digits[i] = new JButton(String.valueOf(i));
            digits[i].addActionListener(this);
            digits[i].setFocusable(false);
            digits[i].setFont(font);
        }

        for (int i = 0; i <=7; i++) {
            ops[i].addActionListener(this);
            ops[i].setFocusable(false);
            ops[i].setFont(font);

        }

        panel = new JPanel();
        panel.setBounds(15, 90, 220, 335);
        panel.setBackground(pColor);
        panel.setLayout(new GridLayout(5, 3, 8, 8));
        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        panel.add(add);
        panel.add(sub);
        panel.add(mul);
        panel.add(digits[7]);
        panel.add(digits[8]);
        panel.add(digits[9]);
        panel.add(digits[4]);
        panel.add(digits[5]);
        panel.add(digits[6]);
        panel.add(digits[1]);
        panel.add(digits[2]);
        panel.add(digits[3]);
        panel.add(clr);
        panel.add(digits[0]);
        panel.add(dec);

        sPanel = new JPanel();
        sPanel.setBounds(235, 90, 60, 335);
        sPanel.setBackground(pColor);
        sPanel.setLayout(new FlowLayout());
        // sPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        sPanel.add(div);
        sPanel.add(del);
        sPanel.add(equ);
        
        
        frame.add(panel);
        frame.add(sPanel);
        frame.add(field);
        frame.setVisible(true);     // Keep it at last
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    
}
