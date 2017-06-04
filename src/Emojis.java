import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Emojis {

	public static BufferedImage snake;
	public static BufferedImage ring;
	public static BufferedImage backpack;
	public static BufferedImage sparkles;
	public static BufferedImage pawprints;

	Emojis() {
		try {
			snake = ImageIO.read(this.getClass().getResourceAsStream("Snake.png"));
			ring = ImageIO.read(this.getClass().getResourceAsStream("WeddingRing.png"));
			backpack = ImageIO.read(this.getClass().getResourceAsStream("backpack.png"));
			sparkles = ImageIO.read(this.getClass().getResourceAsStream("sparkles.png"));
			pawprints = ImageIO.read(this.getClass().getResourceAsStream("pawprints.png"));

		} catch (IOException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void draw(Graphics g) {

		g.drawImage(snake, 1100, 420, 30, 30, null);
		g.drawImage(ring, 1460, 500, 30, 30, null);
		g.drawImage(backpack, 840, 770, 30, 30, null);
		g.drawImage(sparkles, 680, 756, 30, 30, null);
		g.drawImage(pawprints, 1079, 782, 30, 30, null);

	}

}
