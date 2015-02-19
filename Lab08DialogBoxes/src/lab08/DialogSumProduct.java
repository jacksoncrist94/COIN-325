package lab08;

import javax.swing.JOptionPane;

public class DialogSumProduct{
	
	public static void main(String[] args){
		int first, second, sum, product, repeat;
		String input;
		
		do
		{
			input = JOptionPane.showInputDialog("Please enter your first integer.");
			
			first = Integer.parseInt(input);
			
			input = JOptionPane.showInputDialog("Please enter your second integer.");
			
			second = Integer.parseInt(input);
			
			sum = first + second;
			
			product = first * second;
			
			JOptionPane.showMessageDialog(null, "The sum is: " + sum + "\nThe product is: " + product);
			
			repeat = JOptionPane.showConfirmDialog(null, "Do you wish to process another?");
		}while(repeat == JOptionPane.YES_OPTION);
		
	}
	
}