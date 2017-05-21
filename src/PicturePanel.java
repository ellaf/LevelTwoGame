import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PicturePanel extends JPanel {

	public static BufferedImage backgroundImg;
	public static BufferedImage snake;
	public static BufferedImage ring;

	PicturePanel() {
		try {
			backgroundImg = ImageIO.read(this.getClass().getResourceAsStream("Umbrellas.jpg"));
			snake = ImageIO.read(this.getClass().getResourceAsStream("Snake.png"));
			ring = ImageIO.read(this.getClass().getResourceAsStream("WeddingRing.png"));
		} catch (IOException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void paint(Graphics g) {

		g.drawImage(backgroundImg, 0, 0, null);
		g.drawImage(snake, 1100, 420, 30, 30, null);
		g.drawImage(ring, 1460, 500, 30, 30, null);

	}
}