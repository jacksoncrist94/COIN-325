package Lab7;

import javax.swing.JFrame;

public class PushRandom{
	
	public static void main(String[] args){
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PushRandomPanel panel = new PushRandomPanel();
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
		
	}
}