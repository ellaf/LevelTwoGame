import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SideBar extends JPanel implements ActionListener, KeyListener{

	JLabel barTitle = new JLabel("FIND:");
	JLabel snakeName = new JLabel("snake");
	JLabel ringName = new JLabel("ring");
	JLabel backpackName = new JLabel("backpack");
	JLabel sparkleName = new JLabel("sparkles");
	JLabel pawprintName = new JLabel("pawprints");
	JLabel diamondName = new JLabel("diamond");
	int foundMeX = 76;
	int foundMeWidth = 275;
	int foundMeHeight = 75;
	int findMeY = 90;
	int findMeY2 = findMeY + 40;
	int findMeY3 = findMeY + 80;
	int findMeY4 = findMeY + 120;
	int findMeY5 = findMeY + 160;
	int findMeY6 = findMeY + 200;
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
		
	}
	void objectNames() {

		if(currentBar == BAR1){
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
		}else if(currentBar == BAR2){
			
		}

	}
	
	void nextLevelBar(){
		currentBar += 1;
		if(currentBar > BAR2){
		currentBar = BAR1;
		}
		if(currentBar == BAR1){
			setBackground(Color.PINK);
		
		}
		System.out.println(currentBar);
		if(currentBar == 1){
			setBackground(Color.BLUE);
		}
		repaint();
		
	}
	
	void foundSparkles(){
		
		sparkleName.setVisible(false);
		sparkleName.setText("Found Me!");
		sparkleName.setBounds(foundMeX, findMeY4, foundMeWidth, foundMeHeight);
		
	}
	
	void foundRing(){
		
		ringName.setVisible(false);
		ringName.setText("Found Me!");
		ringName.setBounds(foundMeX, findMeY2, foundMeWidth, foundMeHeight);
		
	}
	
	void foundBackpack(){
		
		backpackName.setVisible(false);
		backpackName.setText("Found Me!");
		backpackName.setBounds(foundMeX, findMeY3, foundMeWidth, foundMeHeight);
		
	}

	void foundPawprint(){
		
		pawprintName.setVisible(false);
		pawprintName.setText("Found Me!");
		pawprintName.setBounds(foundMeX, findMeY5, foundMeWidth, foundMeHeight);
		
	}
	
	void foundDiamond(){
		
		diamondName.setVisible(false);
		diamondName.setText("Found Me!");
		diamondName.setBounds(foundMeX, findMeY6, foundMeWidth, foundMeHeight);
		
	}
	
	void foundSnake(){
		
		snakeName.setVisible(false);
		snakeName.setText("Found Me!");
		snakeName.setBounds(foundMeX, findMeY, foundMeWidth, foundMeHeight);
		
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
