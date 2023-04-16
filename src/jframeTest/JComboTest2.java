package jframeTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class JComboTest2 extends JFrame {

	Color []mycolor = {Color.red, Color.blue, Color.green};
	JComboBox<String> jcb;
	Vector<String> data;
	
	public JComboTest2() {
		JPanel p = new JPanel();
		data = new Vector<String>();
		data.add("red");
		data.add("blue");
		data.add("green");
		jcb = new JComboBox<String>(data);
		
		jcb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = jcb.getSelectedIndex();
				p.setBackground(mycolor[i]);
			}
		});
		
		setLayout(new BorderLayout());
		add(jcb, BorderLayout.NORTH);
		add(p, BorderLayout.CENTER);
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JComboTest2();
	}

}
