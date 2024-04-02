import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{

    JFrame frame;
    JTextField field;
    JPanel panel, sPanel;
    JButton[] digits = new JButton[10];
    JButton[] ops = new JButton[10];
    JButton add, sub, mul, div, equ, del, clr, dec, squ, roo;
    Font font = new Font("helvetica", Font.PLAIN, 25);
    double n1 = 0, n2 = 0, eq=0;
    char operator;

    Color bColor = new Color(20,47,68);
    Color pColor = new Color(29,56,73);
    Color dColor = new Color(162,187,207);
    Color oColor = new Color(100, 104, 129);

    Calculator() {
        frame = new JFrame("Calc..");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 480);
        frame.getContentPane().setBackground(bColor);
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
        squ = new JButton("x\u00B2");
        roo = new JButton("\u221A");


        ops[0] = add;
        ops[1] = sub;
        ops[2] = mul;
        ops[3] = div;
        ops[4] = equ;
        ops[5] = del;
        ops[6] = clr;
        ops[7] = dec;
        ops[8] = squ;
        ops[9] = roo;

        for (int i = 0; i <10; i++) {
            digits[i] = new JButton(String.valueOf(i));
            digits[i].addActionListener(this);
            digits[i].setFocusable(false);
            digits[i].setFont(font);
            digits[i].setBackground(dColor);

        }

        for (int i = 0; i <10; i++) {
            ops[i].addActionListener(this);
            ops[i].setFocusable(false);
            ops[i].setFont(font);
            ops[i].setBackground(oColor);

        }

        equ.setBackground(Color.ORANGE);

        panel = new JPanel();
        panel.setBounds(15, 90, 280, 335);
        panel.setBackground(pColor);
        panel.setLayout(new GridLayout(5, 4, 8, 8));

        panel.add(add);
        panel.add(sub);
        panel.add(mul);
        panel.add(div);
        panel.add(digits[7]);
        panel.add(digits[8]);
        panel.add(digits[9]);
        panel.add(squ);
        panel.add(digits[4]);
        panel.add(digits[5]);
        panel.add(digits[6]);
        panel.add(roo);
        panel.add(digits[1]);
        panel.add(digits[2]);
        panel.add(digits[3]);
        panel.add(del);
        panel.add(clr);
        panel.add(digits[0]);
        panel.add(dec);
        panel.add(equ);
        
        
        frame.add(panel);
        frame.add(field);
        frame.setVisible(true);     // Keep it at last
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        for (int i = 0; i<10; i++) {
            if (e.getSource() == digits[i])
            field.setText(field.getText().concat(String.valueOf(i)));
        }
        if (e.getSource() == dec) {
            field.setText(field.getText().concat("."));
        }
        if (e.getSource() == add) {
            n1 = Double.parseDouble(field.getText());
            operator = '+';
            field.setText("");
        }
        if (e.getSource() == sub) {
            n1 = Double.parseDouble(field.getText());
            operator = '-';
            field.setText("");
        }
        if (e.getSource() == mul) {
            n1 = Double.parseDouble(field.getText());
            operator = 'x';
            field.setText("");
        }
        if (e.getSource() == div) {
            n1 = Double.parseDouble(field.getText());
            operator = '/';
            field.setText("");
        }
        if (e.getSource() == squ) {
            n1 = Double.parseDouble(field.getText());
            eq = n1*n1;
            field.setText(String.valueOf(eq));
            n1=eq;
        }
        if (e.getSource() == roo) {
            n1 = Double.parseDouble(field.getText());
            eq = Math.sqrt(n1);
            field.setText(String.valueOf(eq));
            n1=eq;
        }

        if (e.getSource() == clr) {
            
            field.setText("");
        }

        if (e.getSource() == del) {
            String numOnField = field.getText();
            field.setText("");
            for (int i =0; i< numOnField.length()-1; i++) {
                field.setText(field.getText() + numOnField.charAt(i));

            }
        }

        if (e.getSource() == equ) {
            n2 = Double.parseDouble(field.getText());

            switch (operator) {
                case '+':
                eq = n1 + n2;
                break;
                case '-':
                eq = n1 - n2;
                break;
                case 'x':
                eq = n1 * n2;
                break;
                case '/':
                eq = n1 / n2;
                break;
            }
            field.setText(String.valueOf(eq));
            n1=eq;
        }

    }

    
}
