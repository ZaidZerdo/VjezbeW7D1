package tasks;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Class that describes a frame that displays
 * the exact coordinates of the mouse relative
 * to the window.
 * @author Zaid
 *
 */
public class Task6 extends JFrame {
	private static final long serialVersionUID = 4169434337274934457L;
	
	private MyPanel panel;
	private Integer coordX = 0;
	private Integer coordY = 0;
	
	/**
	 * Constructs a frame with a panel on it
	 * that contains a mouse motion listener.
	 */
	public Task6() {		
		panel = new MyPanel();
		panel.addMouseMotionListener(new Mouse());
		add(panel);		
		
		setTitle("Task 6");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Task6();
	}
	
	private class MyPanel extends JPanel {
		private static final long serialVersionUID = 7313237643102486156L;
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setFont(new Font("Serif", Font.PLAIN, 20));
			g.drawString("X: " + coordX + ", Y: " + coordY, 100, 100);
		}
	}
	
	private class Mouse implements MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent arg0) {
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			coordX = e.getX();
			coordY = e.getY();
			panel.repaint();
		}

		
	}
}
