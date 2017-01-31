package chp03gui;

import javax.swing.JFrame;

public class RunProgram {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(new MainPage());
		frame.setVisible(true);
	}

}
