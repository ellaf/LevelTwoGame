import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PicturePanel extends JPanel {

	public static BufferedImage backgroundImg;

	PicturePanel() {
		try {
			backgroundImg = ImageIO.read(this.getClass().getResourceAsStream("Umbrellas.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void paint(Graphics g) {

		g.drawImage(backgroundImg, 0, 0, null);

	}

}
