import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class myinterface {
    public static void main(String args[]) {
        JLabel l = new JLabel("Nothing");
        JFrame f = new JFrame("Something");

        f.add(l);
        f.setSize(400, 500);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}