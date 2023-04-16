package kor_eng;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class KorToEng extends JFrame {

	JTextArea jta1;
	JTextArea jta2;
	HashMap<String, String> map;
	
	public KorToEng () {
		map = new HashMap<String, String>();
		map.put("텍스트", "Text");
		map.put("영어", "English");
		
		jta1 = new JTextArea();
		jta2 = new JTextArea();
		JScrollPane jsp1 = new JScrollPane(jta1);
		JScrollPane jsp2 = new JScrollPane(jta2);
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		setLayout(new BorderLayout());
		p1.setLayout(new GridLayout(1,2,10,10));
		p1.add(jsp1);
		p1.add(jsp2);
		
		JButton btn1 = new JButton("변환");
		JButton btn2 = new JButton("취소");
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String data = jta1.getText();
				Iterator<String> iter = map.keySet().iterator();
				while(iter.hasNext()) {
					String key = iter.next();
					String value = map.get(key);
					data = data.replaceAll(key, value);//???
				}
				jta2.setText(data);
			}
		});
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jta2.setText("");
			}
		});
		
		p2.add(btn1);
		p2.add(new JLabel("   "));
		p2.add(btn2);
		
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new KorToEng();
	}
}
