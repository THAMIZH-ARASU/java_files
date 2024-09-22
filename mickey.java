import java.applet.*;
import java.awt.*;
/*<applet CODE="mickey" width=1000 height=750>
</applet>*/
public class mickey extends Applet{
	public void paint(Graphics g){
		g.setColor(Color.PINK);
		g.fillArc(450,300,120,150,-30,240);
		
		g.fillArc(430,370,165,87,0,360);
		
		//ear
		g.fillArc(460,250,40,80,0,360);
		g.fillArc(520,250,40,80,0,360);
		
		
		//eyes
		g.setColor(Color.BLACK);
		g.drawOval(470,330,30,50);
		g.drawOval(520,330,30,50);
		g.fillOval(480,340,20,40);
		g.fillOval(530,340,20,40);
		
		//nose
		g.fillOval(495,385,30,20);
		
		//mouth
		
		g.drawArc(430,340,165,87,230,80);
	}
}

