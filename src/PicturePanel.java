import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PicturePanel extends JPanel {


	
	public static BufferedImage backgroundImg;
	public static BufferedImage backgroundImg2;
	Emojis emoji = new Emojis();

	PicturePanel() {

	

			
		
		//try {
		//	backgroundImg = ImageIO.read(this.getClass().getResourceAsStream("Umbrellas.jpg"));
		
		//} catch (IOException e) {

			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
		try {
			backgroundImg2 = ImageIO.read(this.getClass().getResourceAsStream("tokyo2.jpg"));
		
		} catch (IOException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
			
	
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub

		//g.drawImage(backgroundImg, 0, 0, null);
		g.drawImage(backgroundImg2, 0, 0, null);
	
		emoji.draw(g);
	}
	
	

}