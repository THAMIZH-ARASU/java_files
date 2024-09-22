import javax.swing.*;  
import java.awt.event.*;  
import java.net.*;  
public class IPFinder extends JFrame implements ActionListener{  
    static JFrame f;
	static JLabel l;  
    static JTextField tf;  
    static JButton b;
	
	public void actionPerformed(ActionEvent e){  
		String url=tf.getText();  
		try {  
			InetAddress ia=InetAddress.getByName(url);  
			String ip=ia.getHostAddress();  
			JOptionPane.showMessageDialog(this,ip);  
		} 	
		catch (UnknownHostException e1) {  
			JOptionPane.showMessageDialog(this,e1.toString());  
		}  
	}
	public static void main(String[] args) {  
		IPFinder c=new IPFinder();
		f=new JFrame("URL FINDER");
		l=new JLabel("Enter URL:");  
		l.setBounds(50,70,150,20);;  
		tf=new JTextField();  
		tf.setBounds(50,100,200,20);  
      
		b=new JButton("Find IP");  
		b.setBounds(50,150,80,30);  
		b.addActionListener(c);  
		f.add(l);  
		f.add(tf);  
		f.add(b);  
		f.setSize(300,300);  
		f.setLayout(null);  
		f.setVisible(true);
	}  
}