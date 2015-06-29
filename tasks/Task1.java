package tasks;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Shows a label on the window which is clickable.
 * If the label gets clicked it will change its text.
 * @author Zaid
 *
 */
public class Task1 extends JFrame {
	private static final long serialVersionUID = 5571880606589445790L;

	private JLabel label = new JLabel("Not clicked...");
	private Font font1 = new Font("Serif", Font.PLAIN, 25);
	private Font font2 = new Font("Serif", Font.BOLD, 30);
	
	/**
	 * Constructs a window that has a single label on it.
	 * The label contains a mouse listener object, which
	 * will trigger if the label is clicked.
	 */
	public Task1() {
		add(label);
		label.setFont(font1);
		label.addMouseListener(new Mouse());
		label.setHorizontalAlignment(JLabel.CENTER);
		
		setTitle("Task 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Task1();
	}

	/**
	 * Handles all mouse events.
	 * @author Zaid
	 *
	 */
	private class Mouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent arg0) {
			
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
		public void mouseReleased(MouseEvent e) {
			if (e.getSource() == label) {
				label.setFont(font2);
				label.setText("It is clicked!");
			}
		}
		
	}
}
