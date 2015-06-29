package tasks;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Class that describes a frame that draws a
 * chart graph based on the <code>values</code> array.
 * @author Zaid
 *
 */
public class Task7 extends JFrame {
	private static final long serialVersionUID = -6740819111740200797L;

	private MyPanel panel; 
	private int[] values = {10, 20, 50, 30, 50, 40, 20, 0, 10, 40};
	
	/**
	 * Constructs a frame with a panel on it.
	 * The panel draws the graph.
	 */
	public Task7() {		
		panel = new MyPanel();
		add(panel);		
		
		setTitle("Task 7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Task7();
	}
	
	/**
	 * Class that describes a panel that draws
	 * the chart graph.
	 * @author Zaid
	 *
	 */
	private class MyPanel extends JPanel {
		private static final long serialVersionUID = 7313237643102486156L;
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			Graphics2D g2d = (Graphics2D) g;
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			g2d.setStroke(new BasicStroke(10));
			
			for (int i = 0; i < values.length; i++) {
				g2d.fill3DRect(i * 50 + 10, 100 - values[i], 50, values[i], true);
			}
		}
	}

}
