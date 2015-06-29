package tasks;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Class that describes a frame that contains a single
 * label that reacts to the actions of a mouse.
 * @author Zaid
 *
 */
public class Task4 extends JFrame {
	private static final long serialVersionUID = -389339897723323535L;

	private JLabel label = new JLabel("Click Me");
	private Font font1 = new Font("Monospaced", Font.PLAIN, 35);
	private Font font2 = new Font("Monospaced", Font.BOLD, 35);
	
	/**
	 * Creates a frame that behaves differently to
	 * different inputs of the mouse, ex. entering
	 * the label's proximity changes its color
	 * to black, while leaving the label's proximity
	 * changes the color to light gray.
	 */
	public Task4() {
		add(label);
		label.setFont(font1);
		label.setForeground(Color.LIGHT_GRAY);
		label.addMouseListener(new Mouse());
		label.setHorizontalAlignment(JLabel.CENTER);
		
		setTitle("Task 4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 100);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Task4();
	}
	
	private class Mouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent arg0) {
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			if (e.getSource() == label) {
				label.setForeground(Color.BLACK);
			}
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (e.getSource() == label) {
				label.setForeground(Color.LIGHT_GRAY);
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			if (e.getSource() == label) {
				label.setFont(font2);
			}
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			if (e.getSource() == label) {
				label.setFont(font1);
			}
		}
		
	}

}