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
	JLabel diamondName = new JLabel("diamond");
	//JLabel congrats = new JLabel("Congratulations!");
	int foundMeX = 76;
	int foundMeWidth = 275;
	int foundMeHeight = 75;
	int findMeY = 90;
	int findMeY2 = findMeY + 40;
	int findMeY3 = findMeY + 80;
	int findMeY4 = findMeY + 120;
	int findMeY5 = findMeY + 160;
	int findMeY6 = findMeY + 200;
	//ArrayList<Integer> xList = new ArrayList<Integer>();
	//ArrayList<Integer> yList = new ArrayList<Integer>();
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
	int diamondX = 337;
	int diamondY = 974;
	boolean checkMe = false;
	boolean checkMe2 = false;
	boolean checkMe3 = false;
	boolean checkMe4 = false;
	boolean checkMe5 = false;
	boolean checkMe6 = false;
	
	

	public static void main(String[] args) {

		Game potato = new Game();

	}

	Game() {

		setup();

	}

	void add(int x, int y) {

		//xList.add(x);
	//	yList.add(y);

	}

	void setup() {

	//	System.out.println(xList);
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
		ringName.setBounds(113, findMeY2, 100, 75);
		bar.add(backpackName);
		backpackName.setFont(new Font("Serif", Font.PLAIN, 30));
		backpackName.setBounds(83, findMeY3, 275, 75);
		bar.add(sparkleName);
		sparkleName.setFont(new Font("Serif", Font.PLAIN, 30));
		sparkleName.setBounds(90, findMeY4, 250, 75);
		bar.add(pawprintName);
		pawprintName.setFont(new Font("Serif", Font.PLAIN, 30));
		pawprintName.setBounds(83, findMeY5, 275, 75);
		bar.add(diamondName);
		diamondName.setFont(new Font("Serif", Font.PLAIN, 30));
		diamondName.setBounds(87, findMeY6, 250, 75);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getX());
		System.out.println(e.getY());
	//	if(e.getX() <= 10){
	//	ringName.setText("Found me!");
	//	ringName.setBounds(foundMeX, findMeY + 40, foundMeWidth, foundMeHeight);
			
	//	}
		if(e.getX() >= sparklesX - 15 && e.getX() <= sparklesX + 15 && e.getY() <= sparklesY + 15 && e.getY() >= sparklesY - 15){
		sparkleName.setText("Found Me!");
		sparkleName.setBounds(foundMeX, findMeY4, foundMeWidth, foundMeHeight);
		checkMe4 = true;
		}else if(e.getX() >= ringX - 15 && e.getX() <= ringX + 15 && e.getY() <= ringY + 15 && e.getY() >= ringY - 15){
		ringName.setText("Found Me!");
		ringName.setBounds(foundMeX, findMeY2, foundMeWidth, foundMeHeight);
		checkMe2 = true;
		}else if(e.getX() >= backpackX - 15 && e.getX() <= backpackX + 15 && e.getY() <= backpackY + 15 && e.getY() >= backpackY - 15){
		backpackName.setText("Found Me!");
		backpackName.setBounds(foundMeX, findMeY3, foundMeWidth, foundMeHeight);
		checkMe3 = true;
		}else if(e.getX() >= pawprintX - 15 && e.getX() <= pawprintX + 15 && e.getY() <= pawprintY + 15 && e.getY() >= pawprintY - 15){
		pawprintName.setText("Found Me!");
		pawprintName.setBounds(foundMeX, findMeY5, foundMeWidth, foundMeHeight);
		checkMe5 = true;
		}else if(e.getX() >= diamondX - 15 && e.getX() <= diamondX + 15 && e.getY() <= diamondY + 15 && e.getY() >= diamondY - 15){
		diamondName.setText("Found Me!");
		diamondName.setBounds(foundMeX, findMeY6, foundMeWidth, foundMeHeight);
		checkMe6 = true;
		}else if(e.getX() >= snakeX - 15 && e.getX() <= snakeX + 15 && e.getY() <= snakeY + 15 && e.getY() >= snakeY - 15){
		snakeName.setText("Found Me!");
		snakeName.setBounds(foundMeX, findMeY, foundMeWidth, foundMeHeight);
		checkMe = true;
		}
		//if(checkMe == true && checkMe2 == true && checkMe3 == true && checkMe4 == true && checkMe5 == true){
		//bar.add(congrats);
		//congrats.setFont(new Font("Serif", Font.PLAIN, 30));
		//congrats.setBounds(70, findMeY5 + 80, 275, 75);
		//}
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