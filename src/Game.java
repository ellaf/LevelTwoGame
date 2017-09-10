import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Game implements MouseListener, ActionListener {

	Timer timer = new Timer(1000, this);
	int time = 0;
	JFrame frame = new JFrame();
	PicturePanel panel = new PicturePanel();
	SideBar bar = new SideBar();
	JPanel mainPanel = new JPanel();
	Emojis emoji = new Emojis();
	int gameNumber = 0;
	// int sparklesX = 699;
	// int sparklesY = 799;
	// int backpackX = 861;
	// int backpackY = 816;
	// int pawprintX = 1104;
	// int pawprintY = 827;
	// int ringX = 1480;
	// int ringY = 546;
	// int snakeX = 1121;
	// int snakeY = 466;
	// int diamondX = 335;
	// int diamondY = 930;
	boolean checkMe = false;
	boolean checkMe2 = false;
	boolean checkMe3 = false;
	boolean checkMe4 = false;
	boolean checkMe5 = false;
	boolean checkMe6 = false;
	boolean checkMe7 = false;
	boolean checkMeL2 = false;
	boolean checkMeL22 = false;
	boolean checkMeL23 = false;
	boolean checkMeL24 = false;
	boolean checkMeL25 = false;
	boolean checkMeL26 = false;
	boolean checkMeL27 = false;
	JButton balloonButton;
	JButton sparklesButton;
	JButton backpackButton;
	JButton diamondButton;
	JButton pawprintsButton;
	JButton snakeButton;
	JButton ringButton;
	JButton appleButton;
	JButton bowButton;
	JButton keyButton;
	JButton cloudButton;
	JButton chickenButton;
	JButton roseButton;
	JButton earthButton;
	JButton cactusButton;

	public static void main(String[] args) {

		Game potato = new Game();

	}

	Game() {

		setup();
		timer.start();

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
		levelOneButtons();

	}

	void levelOneButtons() {
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
		try {
			Image pawprints = ImageIO.read(getClass().getResource("pawprints.png"));
			pawprintsButton = new JButton(new ImageIcon(pawprints));
			panel.setLayout(null);
			panel.add(pawprintsButton);
			pawprintsButton.addMouseListener(this);
			pawprintsButton.setBorder(null);
			pawprintsButton.setBounds(1079, 782, 30, 30);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		try {
			Image ring = ImageIO.read(getClass().getResource("WeddingRing.png"));
			ringButton = new JButton(new ImageIcon(ring));
			panel.setLayout(null);
			panel.add(ringButton);
			ringButton.addMouseListener(this);
			ringButton.setBorder(null);
			ringButton.setBounds(1460, 500, 30, 30);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		try {
			Image snake = ImageIO.read(getClass().getResource("Snake.png"));
			snakeButton = new JButton(new ImageIcon(snake));
			panel.setLayout(null);
			panel.add(snakeButton);
			snakeButton.addMouseListener(this);
			snakeButton.setBorder(null);
			snakeButton.setBounds(1100, 420, 30, 30);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		try {
			Image backpack = ImageIO.read(getClass().getResource("backpack.png"));
			backpackButton = new JButton(new ImageIcon(backpack));
			panel.setLayout(null);
			panel.add(backpackButton);
			backpackButton.addMouseListener(this);
			backpackButton.setBorder(null);
			backpackButton.setBounds(840, 770, 30, 30);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		try {
			Image sparkles = ImageIO.read(getClass().getResource("sparkles.png"));
			sparklesButton = new JButton(new ImageIcon(sparkles));
			panel.setLayout(null);
			panel.add(sparklesButton);
			sparklesButton.addMouseListener(this);
			sparklesButton.setBorder(null);
			sparklesButton.setBounds(680, 756, 30, 30);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		try {
			Image diamond = ImageIO.read(getClass().getResource("diamond.png"));
			diamondButton = new JButton(new ImageIcon(diamond));
			panel.setLayout(null);
			panel.add(diamondButton);
			diamondButton.addMouseListener(this);
			diamondButton.setBorder(null);
			diamondButton.setBounds(315, 900, 30, 30);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	void levelTwoButtons() {

		try {
			Image apple = ImageIO.read(getClass().getResource("apple.png"));
			appleButton = new JButton(new ImageIcon(apple));
			panel.setLayout(null);
			panel.add(appleButton);
			appleButton.addMouseListener(this);
			appleButton.setBorder(null);
			appleButton.setBounds(503, 931, 30, 30);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		try {
			Image bow = ImageIO.read(getClass().getResource("bow.png"));
			bowButton = new JButton(new ImageIcon(bow));
			panel.setLayout(null);
			panel.add(bowButton);
			bowButton.addMouseListener(this);
			bowButton.setBorder(null);
			bowButton.setBounds(953, 903, 30, 30);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		try {
			Image cloud = ImageIO.read(getClass().getResource("cloud.png"));
			cloudButton = new JButton(new ImageIcon(cloud));
			panel.setLayout(null);
			panel.add(cloudButton);
			cloudButton.addMouseListener(this);
			cloudButton.setBorder(null);
			cloudButton.setBounds(460, 529, 30, 30);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		try {
			Image rose = ImageIO.read(getClass().getResource("rose.png"));
			roseButton = new JButton(new ImageIcon(rose));
			panel.setLayout(null);
			panel.add(roseButton);
			roseButton.addMouseListener(this);
			roseButton.setBorder(null);
			roseButton.setBounds(719, 664, 30, 30);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		try {
			Image chicken = ImageIO.read(getClass().getResource("chicken.png"));
			chickenButton = new JButton(new ImageIcon(chicken));
			panel.setLayout(null);
			panel.add(chickenButton);
			chickenButton.addMouseListener(this);
			chickenButton.setBorder(null);
			chickenButton.setBounds(351, 575, 30, 30);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		try {
			Image key = ImageIO.read(getClass().getResource("key.png"));
			keyButton = new JButton(new ImageIcon(key));
			panel.setLayout(null);
			panel.add(keyButton);
			keyButton.addMouseListener(this);
			keyButton.setBorder(null);
			keyButton.setBounds(953, 903, 30, 30);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		try {
			Image earth = ImageIO.read(getClass().getResource("earth.png"));
			earthButton = new JButton(new ImageIcon(earth));
			panel.setLayout(null);
			panel.add(earthButton);
			earthButton.addMouseListener(this);
			earthButton.setBorder(null);
			earthButton.setBounds(1224, 879, 30, 30);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		try {
			Image cactus = ImageIO.read(getClass().getResource("cactus.png"));
			cactusButton = new JButton(new ImageIcon(cactus));
			panel.setLayout(null);
			panel.add(cactusButton);
			cactusButton.addMouseListener(this);
			cactusButton.setBorder(null);
			cactusButton.setBounds(578, 588, 30, 30);
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
		// ringName.setBounds(foundMeX, findMeY + 40, foundMeWidth,
		// foundMeHeight);

		// }
		// if (e.getX() >= sparklesX - 15 && e.getX() <= sparklesX + 15 &&
		// e.getY() <= sparklesY + 15 && e.getY() >= sparklesY - 15) {
		// bar.foundSparkles();
		// checkMe4 = true;
		// } else if (e.getX() >= ringX - 15 && e.getX() <= ringX + 15 &&
		// e.getY() <= ringY + 15 && e.getY() >= ringY - 15) {
		// bar.foundRing();
		// checkMe2 = true;
		// } else if (e.getX() >= backpackX - 15 && e.getX() <= backpackX + 15
		// && e.getY() <= backpackY + 15 && e.getY() >= backpackY - 15) {
		// bar.foundBackpack();
		// checkMe3 = true;
		// } else if (e.getX() >= pawprintX - 15 && e.getX() <= pawprintX + 15
		// && e.getY() <= pawprintY + 15 && e.getY() >= pawprintY - 15) {
		// bar.foundPawprint();
		// checkMe5 = true;
		// } else if (e.getX() >= diamondX - 15 && e.getX() <= diamondX + 15 &&
		// e.getY() <= diamondY + 15 && e.getY() >= diamondY - 15) {
		// bar.foundDiamond();
		// checkMe6 = true;
		// } else if (e.getX() >= snakeX - 15 && e.getX() <= snakeX + 15 &&
		// e.getY() <= snakeY + 15 && e.getY() >= snakeY - 15) {
		// bar.foundSnake();
		// checkMe = true;
		// }
		// if (checkMe == true && checkMe2 == true && checkMe3 == true &&
		// checkMe4 == true && checkMe5 == true && checkMe6 == true) {
		// JOptionPane.showMessageDialog(null, "Congratulations! You found all
		// the pictures! \n Ready for level 2?");
		// panel.nextLevelPicture();
		// bar.nextLevelBar();
		// gameNumber += 1;
		// }

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == (balloonButton)) {
			balloonButton.setVisible(false);
			bar.foundBalloon();
			checkMe = true;
		}
		if (e.getSource() == (pawprintsButton)) {
			pawprintsButton.setVisible(false);
			bar.foundPawprint();
			checkMe2 = true;
		}
		if (e.getSource() == (ringButton)) {
			ringButton.setVisible(false);
			bar.foundRing();
			checkMe3 = true;
		}
		if (e.getSource() == (snakeButton)) {
			snakeButton.setVisible(false);
			bar.foundSnake();
			checkMe4 = true;
		}
		if (e.getSource() == (backpackButton)) {
			backpackButton.setVisible(false);
			bar.foundBackpack();
			checkMe5 = true;
		}
		if (e.getSource() == (sparklesButton)) {
			sparklesButton.setVisible(false);
			bar.foundSparkles();
			checkMe6 = true;
		}
		if (e.getSource() == (diamondButton)) {
			diamondButton.setVisible(false);
			bar.foundDiamond();
			checkMe7 = true;
		}

		if (checkMe == true && checkMe2 == true && checkMe3 == true && checkMe4 == true && checkMe5 == true
				&& checkMe6 == true && checkMe7 == true) {
			timer.stop();
			JOptionPane.showMessageDialog(null, "Congratulations! You found all the pictures! \n You finished the puzzle in: " + time + " seconds. \n Ready for level 2?");
			panel.nextLevelPicture();
			bar.nextLevelBar();
			gameNumber += 1;
			checkMe = false;
			checkMe2 = false;
			checkMe3 = false;
			checkMe4 = false;
			checkMe5 = false;
			checkMe6 = false;
			checkMe7 = false;
			levelTwoButtons();
			time = 0;
			timer.restart();

		}

		if (e.getSource() == (appleButton)) {
			appleButton.setVisible(false);
			bar.foundApple();
			checkMeL2 = true;
		}
		if (e.getSource() == (bowButton)) {
			bowButton.setVisible(false);
			bar.foundBow();
			checkMeL22 = true;
		}
		if (e.getSource() == (roseButton)) {
			roseButton.setVisible(false);
			bar.foundRose();
			checkMeL23 = true;
		}
		if (e.getSource() == (cloudButton)) {
			cloudButton.setVisible(false);
			bar.foundCloud();
			checkMeL24 = true;
		}
		if (e.getSource() == (chickenButton)) {
			chickenButton.setVisible(false);
			bar.foundChicken();
			checkMeL25 = true;
		}
		if (e.getSource() == (earthButton)) {
			earthButton.setVisible(false);
			bar.foundEarth();
			checkMeL26 = true;
		}
		if (e.getSource() == (cactusButton)) {
			cactusButton.setVisible(false);
			bar.foundCactus();
			checkMeL27 = true;
		}
		
		if (checkMeL2 == true && checkMeL22 == true && checkMeL23 == true && checkMeL24 == true && checkMeL25 == true
				&& checkMeL26 == true && checkMeL27 == true) {
			timer.stop();
			JOptionPane.showMessageDialog(null, "Congratulations! You found all the pictures! \n You finished the puzzle in: " + time + " seconds.");
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		time += 1;
		bar.showTime(time);
	}

}