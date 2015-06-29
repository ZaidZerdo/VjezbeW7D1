package tasks;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Class that describes a frame with a diagonal line on it.
 * The line will be redrawn every time the window
 * gets resized, because the <code>paintComponent</code> method
 * is overridden to do so. 
 * @author Zaid
 *
 */
public class Task2 extends JFrame {
	private static final long serialVersionUID = -5992039197816109077L;

	private JPanel panel;
	
	/**
	 * Creates a simple frame with a diagonal line starting
	 * from (0, 0) to (width, height) of the frame.
	 */
	public Task2() {
		panel = new JPanel() {
			private static final long serialVersionUID = -1775501073136976923L;

			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;
				g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				g2d.setStroke(new BasicStroke(10));
				g2d.drawLine(0, 0, getWidth(), getHeight());
				g2d.drawLine(0, getHeight(), getWidth(), 0);
			}
		};
		
		add(panel);
		
		setTitle("Task 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Task2();
	}

}
