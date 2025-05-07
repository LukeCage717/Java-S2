import java.awt.*;
import java.awt.event.*;
public class events extends Frame implements MouseListener, KeyListener, WindowListener
	{
	String message= "";
	int x=100, y=100;
	public events()
		{
		setTitle("Event Handling");
		setSize(400,300);
		setLayout(null);
		setVisible(true);
		addMouseListener(this);
		addKeyListener(this);
		addWindowListener(this);
		setFocusable(true);
		requestFocus();
		}
		public void paint(Graphics g)
			{
			g.drawString(message,x,y);
			}
		public void mouseClicked(MouseEvent e)
			{
			message="Mouse Clicked at ("+e.getX()+e.getY()+")";
			x=e.getX();
			y=e.getY();
			repaint();
			}
		public void mousePressed(MouseEvent e)
			{
			message="Mouse Pressed";
			repaint();
			}
		public void mouseReleased(MouseEvent e)
			{
			message="Mouse Released";
			repaint();
			}
		public void mouseEntered(MouseEvent e)
			{
			message="Mouse Entered";
			repaint();
			}
		public void mouseExited(MouseEvent e)
			{
			message="Mouse Exited";
			repaint();
			}
		public void keyPressed(KeyEvent e)
			{
			message="Key Pressed: "+e.getKeyChar();
			repaint();
			}
		public void keyReleased(KeyEvent e)
			{
			message="Key Released: "+e.getKeyChar();
			repaint();
			}
		public void keyTyped(KeyEvent e)
			{
			message="Key Typed: "+e.getKeyChar();
			repaint();
			}
		public void windowOpened(WindowEvent e)
			{
			System.out.println("Window opened");
			}
		public void windowClosing(WindowEvent e)
			{
			System.out.println("Window closing");
			dispose();
			}
		public void windowClosed(WindowEvent e)
			{
			System.out.println("Window closed");
			}
		public void windowActivated(WindowEvent e)
			{
			System.out.println("Window activated");
			}
		public void windowDeactivated(WindowEvent e)
			{
			System.out.println("Window deactivated");
			}
		public void windowIconified(WindowEvent e)
			{
			System.out.println("Window minimized");
			}
		public void windowDeiconified(WindowEvent e)
			{
			System.out.println("Window restored");
			}
		public static void main(String[] args)
			{
			new events();
			}
	}
