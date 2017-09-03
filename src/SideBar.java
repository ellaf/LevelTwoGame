import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SideBar extends JPanel implements ActionListener, KeyListener {

	JLabel barTitle = new JLabel("FIND:");
	JLabel snakeName = new JLabel("snake");
	JLabel ringName = new JLabel("ring");
	JLabel backpackName = new JLabel("backpack");
	JLabel sparkleName = new JLabel("sparkles");
	JLabel pawprintName = new JLabel("pawprints");
	JLabel diamondName = new JLabel("diamond");
	JLabel balloonName = new JLabel("balloon");
	JLabel appleName = new JLabel("apple");
	JLabel bowName = new JLabel("bow");
	JLabel roseName = new JLabel("rose");
	JLabel cloudName = new JLabel("cloud");

	int time = 0;
	int foundMeX = 76;
	int foundMeWidth = 275;
	int foundMeHeight = 75;
	int findMeY = 90;
	int findMeY2 = findMeY + 40;
	int findMeY3 = findMeY + 80;
	int findMeY4 = findMeY + 120;
	int findMeY5 = findMeY + 160;
	int findMeY6 = findMeY + 200;
	int findMeY7 = findMeY + 240;
	final int BAR1 = 0;
	final int BAR2 = 1;
	int currentBar = BAR1;

	SideBar() {
		setPreferredSize(new Dimension(285, 1000));
		// bar.setBounds(1800, 900, 500, 500);
		add(barTitle);
		barTitle.setFont(new Font("Serif", Font.PLAIN, 45));
		setLayout(null);
		barTitle.setBounds(84, 20, 200, 100);
		objectNames();
		setOpaque(true);
		setBackground(Color.PINK);
		repaint();

	}

	void objectNames() {

		add(snakeName);
		snakeName.setFont(new Font("Serif", Font.PLAIN, 30));
		snakeName.setBounds(102, findMeY, 100, 75);
		add(ringName);
		ringName.setFont(new Font("Serif", Font.PLAIN, 30));
		ringName.setBounds(113, findMeY2, 100, 75);
		add(backpackName);
		backpackName.setFont(new Font("Serif", Font.PLAIN, 30));
		backpackName.setBounds(83, findMeY3, 275, 75);
		add(sparkleName);
		sparkleName.setFont(new Font("Serif", Font.PLAIN, 30));
		sparkleName.setBounds(90, findMeY4, 250, 75);
		add(pawprintName);
		pawprintName.setFont(new Font("Serif", Font.PLAIN, 30));
		pawprintName.setBounds(83, findMeY5, 275, 75);
		add(diamondName);
		diamondName.setFont(new Font("Serif", Font.PLAIN, 30));
		diamondName.setBounds(87, findMeY6, 250, 75);
		add(balloonName);
		balloonName.setFont(new Font("Serif", Font.PLAIN, 30));
		balloonName.setBounds(95, findMeY7, 250, 75);

	}

	void objectNamesLevelTwo() {

		add(appleName);
		appleName.setFont(new Font("Serif", Font.PLAIN, 30));
		appleName.setBounds(102, findMeY, 100, 75);
		add(bowName);
		bowName.setFont(new Font("Serif", Font.PLAIN, 30));
		bowName.setBounds(109, findMeY2, 90, 75);
		add(roseName);
		roseName.setFont(new Font("Serif", Font.PLAIN, 30));
		roseName.setBounds(110, findMeY3, 100, 75);
		add(cloudName);
		cloudName.setFont(new Font("Serif", Font.PLAIN, 30));
		cloudName.setBounds(106, findMeY3, 100, 75);

	}

	void nextLevelBar() {
		currentBar += 1;
		if (currentBar > BAR2) {
			currentBar = BAR1;
		}
		if (currentBar == BAR1) {
			setBackground(Color.PINK);

		}
		System.out.println(currentBar);
		if (currentBar == 1) {
			setBackground(Color.BLUE);
			objectNamesLevelTwo();
		}
		repaint();

	}

	void foundSparkles() {

		sparkleName.setVisible(false);

	}

	void foundRing() {

		ringName.setVisible(false);

	}

	void foundBackpack() {

		backpackName.setVisible(false);

	}

	void foundPawprint() {

		pawprintName.setVisible(false);

	}

	void foundDiamond() {

		diamondName.setVisible(false);

	}

	void foundSnake() {

		snakeName.setVisible(false);

	}

	void foundBalloon() {

		balloonName.setVisible(false);

	}

	void foundApple() {

		appleName.setVisible(false);

	}

	void foundBow() {

		bowName.setVisible(false);

	}

	void foundRose() {

		roseName.setVisible(false);

	}

	void foundCloud() {

		cloudName.setVisible(false);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
