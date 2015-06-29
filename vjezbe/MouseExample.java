package vjezbe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseExample extends JFrame {
	private static final long serialVersionUID = -3037227350838747481L;

	private JLabel label = new JLabel("GITHub");
	private Font font1 = new Font("Monospaced", Font.PLAIN, 35);
	private Font font2 = new Font("Monospaced", Font.BOLD, 35);
	
	public MouseExample() {
		setLayout(new BorderLayout());
		add(label);
		
		label.setFont(font1);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.addMouseListener(new Mouse());
		label.addMouseMotionListener(new MouseMotion());
		label.setText("Fuj");
		
		
		setSize(400, 300);
		setLocationRelativeTo(null);
		setTitle("Fuj");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseExample();
	}
	
	private class MouseMotion implements MouseMotionListener {

		private int counter = 0;
		
		@Override
		public void mouseDragged(MouseEvent arg0) {
			
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			System.out.println(counter);
			counter++;
		}
		
	}
	
	private class Mouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent arg0) {
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			if (e.getSource() == label) {
				label.setForeground(Color.RED);
			}
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (e.getSource() == label) {
				label.setForeground(Color.BLACK);
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			if (e.getSource() == label) {
				label.setFont(font2);
				label.setForeground(Color.BLACK);
			}
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			if (e.getSource() == label) {
				label.setFont(font1);
				label.setForeground(Color.RED);
			}
		}
		
	}

}
