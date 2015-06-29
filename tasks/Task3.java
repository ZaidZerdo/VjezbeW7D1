package tasks;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Class that describes a frame that checks
 * which mouse click is clicked when in the frame.
 * @author Zaid
 *
 */
public class Task3 extends JFrame {
	private static final long serialVersionUID = -2397236295139999750L;

	private JPanel panel;
	private String buttonPressed;
	
	/**
	 * Constructs a frame with a panel inside it
	 * that contains a mouse listener.
	 */
	public Task3() {
		panel = new JPanel() {
			private static final long serialVersionUID = -6319339072263572174L;

			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.setFont(new Font("Sans Serif", Font.PLAIN, 35));
				g.drawString("Last pressed: " + buttonPressed, 20, 40);
			}
		};
		
		panel.addMouseListener(new Mouse());
		add(panel);
		
		setTitle("Task 3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Task3();
	}
	
	private class Mouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getButton() == MouseEvent.BUTTON1) {
				buttonPressed = "Left";
			} else if (e.getButton() == MouseEvent.BUTTON2) {
				buttonPressed = "Middle";
			} else if (e.getButton() == MouseEvent.BUTTON3) {
				buttonPressed = "Right";
			}
			panel.repaint();
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			
		}
		
	}

}
