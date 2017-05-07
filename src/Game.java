import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game {

	JFrame frame = new JFrame();
	PicturePanel panel = new PicturePanel();
	SideBar bar = new SideBar();
	JPanel mainPanel = new JPanel();
	JLabel barTitle = new JLabel("FIND:");

	public static void main(String[] args) {

		Game potato = new Game();

	}

	Game() {

		setup();

	}

	void setup() {

		frame.setSize(1800, 1000);
		// mainPanel.setPreferredSize(new Dimension(500, 500));
		frame.setLayout(new BorderLayout());
		mainPanel.add(panel, BorderLayout.WEST);
		mainPanel.add(bar, BorderLayout.EAST);
		frame.add(mainPanel);
		panel.setPreferredSize(new Dimension(1500, 1000));
		// bar.setSize(400, 1000);
		bar.setPreferredSize(new Dimension(285, 1000));
		// bar.setBounds(1800, 900, 500, 500);
		bar.setBackground(Color.PINK);
		bar.add(barTitle);
		barTitle.setFont(new Font("Serif", Font.PLAIN, 45));
		bar.setOpaque(true);
		// frame.add(bar, BorderLayout.EAST);
		frame.setVisible(true);

	}

}
