package tasks;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Class that describes a frame that contains
 * a single panel on it. The panel draws
 * two diagonal lines if the mouse is hovering
 * over the panel.
 * @author Zaid
 *
 */
public class Task5 extends JFrame {
	private static final long serialVersionUID = 2582034378739982019L;

	private MyPanel panel;
	private boolean toDraw = false;
	
	/**
	 * Constructs a frame with a panel on it that has
	 * a mouse listener attached to it.
	 */
	public Task5() {		
		panel = new MyPanel();
		panel.addMouseListener(new Mouse());
		add(panel);		
		
		setTitle("Task 5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Task5();
	}
	
	/**
	 * <p>Class that represents a custom <code>JPanel</code>.
	 * The unique thing about it is the fact that it
	 * only draws two diagonal lines when the <code>toDraw</code>
	 * variable is <code>true</code>
	 * <p><b>Note</b>: This could have put in an anonymous class,
	 * but I opted to do it this way.
	 * @author Zaid
	 *
	 */
	private class MyPanel extends JPanel {
		private static final long serialVersionUID = 7313237643102486156L;
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			if (toDraw) {
				g.drawLine(0, 0, getWidth(), getHeight());
				g.drawLine(0, getHeight(), getWidth(), 0);
			}
		}
	}
	
	private class Mouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			toDraw = true;
			panel.repaint();
		}

		@Override
		public void mouseExited(MouseEvent e) {
			toDraw = false;
			panel.repaint();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
		}
		
	}

}
