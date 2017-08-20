import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Game implements MouseListener {

	JFrame frame = new JFrame();
	PicturePanel panel = new PicturePanel();
	SideBar bar = new SideBar();
	JPanel mainPanel = new JPanel();
	Emojis emoji = new Emojis();
	int gameNumber = 0;
	int sparklesX = 699;
	int sparklesY = 799;
	int backpackX = 861;
	int backpackY = 816;
	int pawprintX = 1104;
	int pawprintY = 827;
	int ringX = 1480;
	int ringY = 546;
	int snakeX = 1121;
	int snakeY = 466;
	int diamondX = 335;
	int diamondY = 930;
	boolean checkMe = false;
	boolean checkMe2 = false;
	boolean checkMe3 = false;
	boolean checkMe4 = false;
	boolean checkMe5 = false;
	boolean checkMe6 = false;
	JButton balloonButton;

	public static void main(String[] args) {

		Game potato = new Game();

	}

	Game() {

		setup();

	}

	void add(int x, int y) {

		// xList.add(x);
		// yList.add(y);

	}

	void setup() {

		// System.out.println(xList);
		frame.setSize(1800, 1000);
		// mainPanel.setPreferredSize(new Dimension(500, 500));
		frame.setLayout(new BorderLayout());
		mainPanel.add(panel, BorderLayout.WEST);
		mainPanel.add(bar, BorderLayout.EAST);
		frame.add(mainPanel);
		panel.setPreferredSize(new Dimension(1500, 1000));
		frame.setVisible(true);
		frame.addMouseListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			Image balloon = ImageIO.read(getClass().getResource("balloon.png"));
			balloonButton = new JButton(new ImageIcon(balloon));
			panel.setLayout(null);
			panel.add(balloonButton);
			balloonButton.addMouseListener(this);
			balloonButton.setBorder(null);
			balloonButton.setBounds(698, 336, 30, 30);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getX());
		System.out.println(e.getY());
		// if(e.getX() <= 10){
		// ringName.setText("Found me!");
		// ringName.setBounds(foundMeX, findMeY + 40, foundMeWidth, foundMeHeight);

		// }
		if (e.getX() >= sparklesX - 15 && e.getX() <= sparklesX + 15 && e.getY() <= sparklesY + 15 && e.getY() >= sparklesY - 15) {
			bar.foundSparkles();
			checkMe4 = true;
		} else if (e.getX() >= ringX - 15 && e.getX() <= ringX + 15 && e.getY() <= ringY + 15 && e.getY() >= ringY - 15) {
			bar.foundRing();
			checkMe2 = true;
		} else if (e.getX() >= backpackX - 15 && e.getX() <= backpackX + 15 && e.getY() <= backpackY + 15 && e.getY() >= backpackY - 15) {
			bar.foundBackpack();
			checkMe3 = true;
		} else if (e.getX() >= pawprintX - 15 && e.getX() <= pawprintX + 15 && e.getY() <= pawprintY + 15 && e.getY() >= pawprintY - 15) {
			bar.foundPawprint();
			checkMe5 = true;
		} else if (e.getX() >= diamondX - 15 && e.getX() <= diamondX + 15 && e.getY() <= diamondY + 15 && e.getY() >= diamondY - 15) {
			bar.foundDiamond();
			checkMe6 = true;
		} else if (e.getX() >= snakeX - 15 && e.getX() <= snakeX + 15 && e.getY() <= snakeY + 15 && e.getY() >= snakeY - 15) {
			bar.foundSnake();
			checkMe = true;
		}
		if (checkMe == true && checkMe2 == true && checkMe3 == true && checkMe4 == true && checkMe5 == true && checkMe6 == true) {
			JOptionPane.showMessageDialog(null, "Congratulations! You found all the pictures! \n Ready for level 2?");
			panel.nextLevelPicture();
			bar.nextLevelBar();
			gameNumber += 1;

		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(balloonButton)) {
			balloonButton.setVisible(false);
			bar.foundBalloon();
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}

}