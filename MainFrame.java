import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;



public class MainFrame extends JFrame
{
	
	private MainComponent scene ;
	public Lucky lucky;
	public MainFrame() throws InterruptedException
	{
		scene= new MainComponent();
		scene.getLucky();
		this.setSize(300,600);
		this.setTitle("Catching Egg by vNmB version 1.0");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.add(scene);
		this.setVisible(true);
		
		KeyListener listener = new MainActivity(); 
		scene.addKeyListener(listener);
		scene.setFocusable(true);
		
		while (true)
		{
			scene.repaint();
			Thread.sleep(2);
		}
		
	
	}	
	class MainActivity implements KeyListener, MouseListener
	{

		public MainActivity(){
			
		}
		
		@Override
		public void keyPressed(KeyEvent arg0) 
		{
			KeyEvent key = arg0;
			if (key.getKeyCode()==key.VK_LEFT)
					{
						scene.moveLuckyLeft();
					}
			else if (key.getKeyCode()==key.VK_RIGHT)
					{
						scene.moveLuckyRight();
					}
		}
		
		@Override
		public void mousePressed(MouseEvent arg0) 
		{
		}

		//DONOTHING METHODS
		public void keyReleased(KeyEvent arg0) {
		}
		public void keyTyped(KeyEvent arg0) {
		}
		public void mouseClicked(MouseEvent arg0) {
		}
		public void mouseEntered(MouseEvent arg0) {
		}
		public void mouseExited(MouseEvent arg0) {		
		}
		public void mouseReleased(MouseEvent arg0) {
		}
	}
	
}