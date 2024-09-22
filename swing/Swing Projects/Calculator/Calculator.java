import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    static JFrame f;

    static JTextField t;
    static JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdiv, bmul, bsub, badd, bdec, beq, bdel, bclr;

    static double a = 0, b = 0, result = 0;
    static int operator = 0;

    /**
     * @param args
     */
    public static void main(String args[]) {

        Calculator c = new Calculator();

        f = new JFrame("CALCULATOR");

        t = new JTextField();
        t.setBackground(Color.CYAN);
        t.setForeground(Color.RED);
        b1 = new JButton("1");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b2 = new JButton("2");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b3 = new JButton("3");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b4 = new JButton("4");
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b5 = new JButton("5");
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b6 = new JButton("6");
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b7 = new JButton("7");
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        b8 = new JButton("8");
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.WHITE);
        b9 = new JButton("9");
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.WHITE);
        b0 = new JButton("0");
        b0.setBackground(Color.BLACK);
        b0.setForeground(Color.WHITE);
        bdec = new JButton(".");
        bdec.setBackground(Color.BLACK);
        bdec.setForeground(Color.WHITE);

        bdiv = new JButton("/");
        bdiv.setBackground(Color.GRAY);
        bdiv.setForeground(Color.WHITE);
        bmul = new JButton("x");
        bmul.setBackground(Color.GRAY);
        bmul.setForeground(Color.WHITE);
        bsub = new JButton("-");
        bsub.setBackground(Color.GRAY);
        bsub.setForeground(Color.WHITE);
        badd = new JButton("+");
        badd.setBackground(Color.GRAY);
        badd.setForeground(Color.WHITE);

        beq = new JButton("=");
        bdel = new JButton("del");
        bclr = new JButton("C");

        t.setBounds(30, 40, 280, 30);
        b7.setBounds(40, 100, 50, 40);
        b8.setBounds(110, 100, 50, 40);
        b9.setBounds(180, 100, 50, 40);
        bdiv.setBounds(250, 100, 50, 40);
        b4.setBounds(40, 170, 50, 40);
        b5.setBounds(110, 170, 50, 40);
        b6.setBounds(180, 170, 50, 40);
        bmul.setBounds(250, 170, 50, 40);
        b1.setBounds(40, 240, 50, 40);
        b2.setBounds(110, 240, 50, 40);
        b3.setBounds(180, 240, 50, 40);
        bsub.setBounds(250, 240, 50, 40);
        bdec.setBounds(40, 310, 50, 40);
        b0.setBounds(110, 310, 50, 40);
        beq.setBounds(180, 310, 50, 40);
        badd.setBounds(250, 310, 50, 40);
        bdel.setBounds(60, 380, 100, 40);
        bclr.setBounds(180, 380, 100, 40);

        f.add(t);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(bdiv);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(bmul);
        f.add(b1);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(bsub);
        f.add(bdec);
        f.add(b0);
        f.add(beq);
        f.add(badd);
        f.add(bdel);
        f.add(bclr);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(355, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(c);
        b2.addActionListener(c);
        b3.addActionListener(c);
        b4.addActionListener(c);
        b5.addActionListener(c);
        b6.addActionListener(c);
        b7.addActionListener(c);
        b8.addActionListener(c);
        b9.addActionListener(c);
        b0.addActionListener(c);
        badd.addActionListener(c);
        bdiv.addActionListener(c);
        bmul.addActionListener(c);
        bsub.addActionListener(c);
        bdec.addActionListener(c);
        beq.addActionListener(c);
        bdel.addActionListener(c);
        bclr.addActionListener(c);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            t.setText(t.getText().concat("1"));
        }
        if (e.getSource() == b2) {
            t.setText(t.getText().concat("2"));
        }
        if (e.getSource() == b3) {
            t.setText(t.getText().concat("3"));
        }
        if (e.getSource() == b4) {
            t.setText(t.getText().concat("4"));
        }
        if (e.getSource() == b5) {
            t.setText(t.getText().concat("5"));
        }
        if (e.getSource() == b6) {
            t.setText(t.getText().concat("6"));
        }
        if (e.getSource() == b7) {
            t.setText(t.getText().concat("7"));
        }
        if (e.getSource() == b8) {
            t.setText(t.getText().concat("8"));
        }
        if (e.getSource() == b9) {
            t.setText(t.getText().concat("9"));
        }
        if (e.getSource() == b0) {
            t.setText(t.getText().concat("0"));
        }
        if (e.getSource() == bdec) {
            t.setText(t.getText().concat("."));
        }
        if (e.getSource() == badd) {
            a = Double.parseDouble(t.getText());
            operator = 1;
            t.setText("");
        }
        if (e.getSource() == bsub) {
            a = Double.parseDouble(t.getText());
            operator = 2;
            t.setText("");
        }
        if (e.getSource() == bmul) {
            a = Double.parseDouble(t.getText());
            operator = 3;
            t.setText("");
        }
        if (e.getSource() == bdiv) {
            a = Double.parseDouble(t.getText());
            operator = 4;
            t.setText("");
        }
        if (e.getSource() == beq) {
            b = Double.parseDouble(t.getText());
            switch (operator) {
                case 1: {
                    result = a + b;
                    break;
                }
                case 2: {
                    result = a - b;
                    break;
                }
                case 3: {
                    result = a * b;
                    break;
                }
                case 4: {
                    result = a / b;
                    break;
                }
                default: {
                    result = 0;
                }
            }
            t.setText("" + result);
        }
        if (e.getSource() == bclr) {
            t.setText("");
        }
        if (e.getSource() == bdel) {
            String s = t.getText();
            String n = "";
            for (int i = 0; i < s.length() - 1; i++) {
                n += s.charAt(i);
            }
            t.setText(n);
        }
    }
}