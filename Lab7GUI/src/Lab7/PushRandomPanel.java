package Lab7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PushRandomPanel extends JPanel{
	
	public JButton button;
	private JLabel label;
	public int randNum;
	private String labelText;
	
	public PushRandomPanel(){
		randNum = 100;
		
		button = new JButton();
		button.addActionListener(new ButtonListener());
		
		labelText = "The number is: " + randNum;
		
		label = new JLabel(labelText);
		
		this.add(button);
		this.add(label);
	}
	
	private class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			label.setText(randGenerate());
		}
		
	}
	private String randGenerate(){
	
		randNum = (int) ((Math.random()*100) + 1);
		labelText = "The number is: " + randNum;
		return labelText;
	}
}