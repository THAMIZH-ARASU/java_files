import javax.swing.*;
import java.awt.event.*;
import java.lang.Math;

public class AreYouDumb extends JFrame implements ActionListener {
    static JFrame f;
    static JLabel l;
    static JButton b1;
    static JButton b2;

    public static void main(String args[]) {
        AreYouDumb c = new AreYouDumb();

        f = new JFrame("Feeling Lucky?");
        f.setSize(500, 500);
        l = new JLabel("Are You Dumb ?");
        l.setBounds(110, 30, 200, 100);
        b1 = new JButton("No");
        b1.setBounds(200, 200, 100, 30);
        b2 = new JButton("Yes");
        b2.setBounds(50, 200, 100, 30);
        f.add(l);
        f.add(b1);
        f.add(b2);

        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(c);
        b2.addActionListener(c);
    }

    public void actionPerformed(ActionEvent e) {
        String s = "I Knew It";
        try {
            if (e.getSource() == b2) {

                JOptionPane.showMessageDialog(this, s);

            }
            if (e.getSource() == b1) {
                int x = (int) (Math.random() * 100) + 200;
                int y = (int) (Math.random() * 100) + 200;
                b1.setBounds(x, y, 100, 30);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}