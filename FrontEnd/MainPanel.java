package FrontEnd;

import java.awt.*;
import javax.swing.*;

import BackEnd.ColorStack;
import BackEnd.Myevents;
import MyComponets.*;


public class MainPanel extends JPanel {


	private static MyButton redAddBtn = new MyButton("Add", new Color(250, 50, 50));
	private static MyButton redRemoveBtn = new MyButton("Remove", new Color(250, 50, 50));
	private static MyButton blueAddBtn = new MyButton("Add", new Color(60, 60, 250));
	private static MyButton blueRemoveBtn = new MyButton("Remove", new Color(60, 60, 250));
	private JLabel backGroundLab = new JLabel();
	private static JTextField enterTex = new JTextField();
	private static JLabel exeptionLab = new JLabel("* Enter a number :");
	private Myevents event = new Myevents();
	private JPanel wightPanel = new JPanel();
	private static JLabel msgLab = new JLabel(ColorStack.getMsg());
	private JLabel logoLab1 = new JLabel("DOUBLE");
	private JLabel logoLab2 = new JLabel("STACK");
	private JLabel logoLab3 = new JLabel("SYSTEM");
	private static DisplayLab  displayLab = new DisplayLab();
	private static MyButton returnValuesBtn = new MyButton("Return" , Color.white);



	public MainPanel() {
		this.setLayout(null);

		redAddBtn.setBounds(410, 50, 90, 30);
		redAddBtn.addActionListener(event);
		this.add(redAddBtn);

		redRemoveBtn.setBounds(410, 90, 90, 30);
		redRemoveBtn.addActionListener(event);
		this.add(redRemoveBtn);

		blueAddBtn.setBounds(100, 50, 90, 30);
		blueAddBtn.addActionListener(event);
		this.add(blueAddBtn);

		blueRemoveBtn.setBounds(100, 90, 90, 30);
		blueRemoveBtn.addActionListener(event);
		this.add(blueRemoveBtn);

		logoLab1.setBounds(250, 50, 100, 25);
		logoLab1.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,16));
		logoLab1.setHorizontalAlignment(JLabel.CENTER);
		this.add(logoLab1);

		logoLab2.setBounds(250, 75, 100, 25);
		logoLab2.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,16));
		logoLab2.setHorizontalAlignment(JLabel.CENTER);
		this.add(logoLab2);

		logoLab3.setBounds(250, 100, 100, 25);
		logoLab3.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,16));
		logoLab3.setHorizontalAlignment(JLabel.CENTER);
		this.add(logoLab3);

		exeptionLab.setBounds(100, 120, 400, 30);
		exeptionLab.setHorizontalAlignment(JLabel.LEFT);
		exeptionLab.setForeground(new Color(255, 0, 0));
		exeptionLab.setVisible(false);
		this.add(exeptionLab);

		enterTex.setBounds(100, 150, 400, 30);
		enterTex.setHorizontalAlignment(JTextField.CENTER);
		enterTex.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		this.add(enterTex);

		returnValuesBtn.setBounds(250,185,100,30);
		returnValuesBtn.addActionListener(event);
		this.add(returnValuesBtn);


		msgLab.setBounds(100,215,400,30);
		msgLab.setHorizontalAlignment(JLabel.CENTER);
		this.add(msgLab);
		
		
		displayLab.setBounds(100, 250, 400, 35);
		this.add(displayLab);


		try {
			backGroundLab.setIcon(new ImageIcon(getClass().getResource("/Imeges/b.jpg")));
		} catch (Exception e) {
			System.out.println("the image is not find");
		}

		wightPanel.setBounds(80, 30, 440, 270);
	 	wightPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		wightPanel.setBackground(new Color(255,255,255));
		this.add(wightPanel);


		backGroundLab.setBounds(0, 0, 600, 350);
		this.add(backGroundLab);
		this.setVisible(true);
		}

		public static DisplayLab getDisplayLab() {
			return displayLab;
		}

		public static MyButton getRedAddBtn() {
			return redAddBtn;
		}

		public static MyButton getRedRemoveBtn() {
			return redRemoveBtn;
		}

		public static MyButton getBlueAddBtn() {
			return blueAddBtn;
		}

		public static MyButton getBlueRemoveBtn() {
			return blueRemoveBtn;
		}

		public static JTextField getEnterTex() {
			return enterTex;
		}

		public static JLabel getExeptionLab() {
			return exeptionLab;
		}
		public static JLabel getMsgLab() {
			return msgLab;
		}

		public static MyButton getReturnValuesBtn() {
			return returnValuesBtn;
		}
		
}
