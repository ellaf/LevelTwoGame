import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PicturePanel extends JPanel implements ActionListener, KeyListener{


	
	public static BufferedImage backgroundImg;
	public static BufferedImage backgroundImg2;
	final int PUZZLE1_STATE = 0;
	final int PUZZLE2_STATE = 1;
	int currentState = PUZZLE1_STATE;
	
	Emojis emoji = new Emojis();

	PicturePanel() {

	

	
		try {
			backgroundImg = ImageIO.read(this.getClass().getResourceAsStream("Umbrellas.jpg"));
			backgroundImg2 = ImageIO.read(this.getClass().getResourceAsStream("tokyo2.jpg"));
		
		} catch (IOException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
		void nextLevelPicture(){
			
			currentState += 1;
			if(currentState > PUZZLE2_STATE){
				currentState = PUZZLE1_STATE;
				
			}
			repaint();
			
		}
	
	

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		if(currentState == PUZZLE1_STATE){
		g.drawImage(backgroundImg, 0, 0, null);
		}else if(currentState == PUZZLE2_STATE){
		g.drawImage(backgroundImg2, 0, 0, null);
		}
	
		emoji.draw(g);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
//		if (e.getKeyCode() == KeyEvent.VK_SPACE && currentState == PUZZLE1_STATE) {
//			System.out.println("HELLO");
//
//			currentState += 1;
//
//		} else if (e.getKeyCode() == KeyEvent.VK_SPACE && currentState == PUZZLE2_STATE) {
//
//			currentState += 1;
//	}
//	
//		if (currentState > PUZZLE2_STATE){
//		currentState = PUZZLE1_STATE;
//		}
	
		}
		
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
//		repaint();
//		// susan.update();
//		if (currentState == PUZZLE1_STATE) {
//			updatePuzzle1State();
//		} else if (currentState == PUZZLE2_STATE) {
//			updatePuzzle2State();
//		}
		
		
	}
	
	

}