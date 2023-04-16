package jframeTest;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ImageButtonTest extends JFrame {

	ImageIcon icon1;
	ImageIcon icon2;
	ImageIcon icon3;
	JButton btn;
	
	public ImageButtonTest() {
		icon1 = new ImageIcon("dog1.png");
		icon2 = new ImageIcon("dog2.jpg");
		icon3 = new ImageIcon("dog3.jpg");
		btn = new JButton(icon1);
		btn.setRolloverIcon(icon2);	//커서 댈 때 이미지 변환
		setLayout(new FlowLayout());
		add(btn);
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new ImageButtonTest();
	}

}
