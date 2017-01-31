package chp03gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MainPage extends JPanel implements ActionListener {

	JButton button;
	
	public MainPage() {
		button = new JButton("Hello");
		this.add(button);
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println("Hello World");
		}
	}

}
