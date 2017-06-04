import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game implements MouseListener {

	JFrame frame = new JFrame();
	PicturePanel panel = new PicturePanel();
	SideBar bar = new SideBar();
	JPanel mainPanel = new JPanel();
	JLabel barTitle = new JLabel("FIND:");
	JLabel snakeName = new JLabel("snake");
	JLabel ringName = new JLabel("ring");
	JLabel backpackName = new JLabel("backpack");
	JLabel sparkleName = new JLabel("sparkles");
	JLabel pawprintName = new JLabel("pawprints");
	int findMeY = 90;
	int findMeSecondY = 130;
	int findMeThirdY = 170;
	int findMeFourthY = 210;
	int findMeFifthY = 250;
	ArrayList<Integer> xList = new ArrayList<Integer>();
	ArrayList<Integer> yList = new ArrayList<Integer>();

	public static void main(String[] args) {

		Game potato = new Game();

	}

	Game() {

		setup();

	}

	void add(int x, int y) {

		xList.add(x);
		yList.add(y);

	}

	void setup() {

		System.out.println(xList);
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
		bar.setLayout(null);
		barTitle.setBounds(84, 20, 200, 100);
		objectNames();
		bar.setOpaque(true);
		// frame.add(bar, BorderLayout.EAST);
		frame.setVisible(true);
		frame.addMouseListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	void objectNames() {

		bar.add(snakeName);
		snakeName.setFont(new Font("Serif", Font.PLAIN, 30));
		snakeName.setBounds(102, findMeY, 100, 75);
		bar.add(ringName);
		ringName.setFont(new Font("Serif", Font.PLAIN, 30));
		ringName.setBounds(113, findMeSecondY, 100, 75);
		bar.add(backpackName);
		backpackName.setFont(new Font("Serif", Font.PLAIN, 30));
		backpackName.setBounds(83, findMeThirdY, 275, 75);
		bar.add(sparkleName);
		sparkleName.setFont(new Font("Serif", Font.PLAIN, 30));
		sparkleName.setBounds(90, findMeFourthY, 250, 75);
		bar.add(pawprintName);
		pawprintName.setFont(new Font("Serif", Font.PLAIN, 30));
		pawprintName.setBounds(83, findMeFifthY, 275, 75);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getX());
		System.out.println(e.getY());

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

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