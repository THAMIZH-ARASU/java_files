import java.io.*;
import java.lang.*;
import java.util.*;
import java.awt.*;
import java.applet.*;
/*<applet code="Applet1" width=400 height=300>
</applet>*/
public class Applet1 extends Applet{
	public void paint(Graphics g){
		Color new1=new Color(34,67,89);
		setBackground(Color.blue);
		g.setColor(new1);
		g.fillOval(10,10,60,60);
		g.drawString("Hi",150,150); 
	}
}