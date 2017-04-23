import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class Game {

	JFrame frame = new JFrame();
	PicturePanel panel = new PicturePanel();
	SideBar bar = new SideBar();

	public static void main(String[] args) {

		Game potato = new Game();

	}

	Game() {

		this.frame = frame;
		setup();

	}

	void setup() {

		frame.setSize(2000, 1000);
		frame.add(panel);
		bar.setSize(100, 1000);
		bar.setBackground(Color.CYAN);
		bar.setOpaque(true);
		frame.add(bar, BorderLayout.EAST);
		frame.setVisible(true);
		bar.setBounds(500, 500, 500, 500);

	}

}
