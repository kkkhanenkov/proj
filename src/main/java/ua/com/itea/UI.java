package ua.com.itea;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class UI extends JFrame{
private JPanel panel = null;
 private JLabel deString = new JLabel("DE");
 private JLabel enString = new JLabel("EN");
 private JLabel esString = new JLabel("ES");
 private JRadioButton deButton = new JRadioButton();
 private JRadioButton enButton = new JRadioButton();
 private JRadioButton esButton = new JRadioButton();
 List<Translation> phrases;
 UI() {
	 	phrases = new Connect().getAllPhrases();
		panel = getPanel(null,null,null);
		add(panel);
		setSize(800, 600);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initListeners();
	}
private void initListeners() {
	deButton.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setVisible(false);
			panel = getPanel(phrases.get(0).getGermanTranslation(), phrases.get(1).getGermanTranslation(), phrases.get(2).getGermanTranslation());
			panel.repaint();
			add(panel);
		}
	});
	esButton.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setVisible(false);
			panel = getPanel(phrases.get(0).getSpanishTranslation(), phrases.get(1).getSpanishTranslation(), phrases.get(2).getSpanishTranslation());
			panel.repaint();
			add(panel);
		}	
	});
	enButton.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setVisible(false);
			panel = getPanel(phrases.get(0).getEnglishTranslation(), phrases.get(1).getEnglishTranslation(), phrases.get(2).getEnglishTranslation());
			panel.repaint();
			add(panel);
		}
	});
}
private JPanel getPanel(String fr1, String fr2, String fr3) {
	JPanel panel = new JPanel();
	panel.setLayout(new GridLayout(4, 3));
	panel.add(deString);
	panel.add(enString);
	panel.add(esString);
	panel.add(deButton);
	panel.add(enButton);
	panel.add(esButton);
	panel.add(new JLabel(""));
	panel.add(new JLabel(new ImageIcon("resources/pudge.jpg")));
	panel.add(new JLabel(""));
	if (fr1!= null && fr2!= null && fr3 != null) {
		panel.add(new JLabel(fr1));
		panel.add(new JLabel(fr2));
		panel.add(new JLabel(fr3));
		return panel;
	}
	return panel;
}

 
 
 
	
			

}
