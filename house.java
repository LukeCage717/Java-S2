import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class house extends Applet implements MouseListener
	{
	Color doorColor=Color.BLUE;
	public void init()
		{
		addMouseListener(this);
		setSize(400,400);
		}
	public void paint(Graphics g)
		{
		g.setColor(Color.GRAY);
		g.fillRect(100,150,200,150);
		g.setColor(Color.DARK_GRAY);
		int[] xPoints={100,200,300};
		int[] yPoints={150,50,150};
		g.fillPolygon(xPoints,yPoints,3);
		g.setColor(doorColor);
		g.fillRect(180,220,40,80);
		g.setColor(Color.WHITE);
		g.fillRect(120,180,40,40);
		g.fillRect(240,180,40,40);
		}
		public void mouseClicked(MouseEvent e)
			{
			if(doorColor==Color.BLUE)
				doorColor=Color.RED;
			else
				doorColor=Color.BLUE;
			repaint();
			}
		public void mousePressed(MouseEvent e){}
		public void mouseReleased(MouseEvent e){}
		public void mouseEntered(MouseEvent e){}
		public void mouseExited(MouseEvent e){}
	}
