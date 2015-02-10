package Lab5;

import java.util.Scanner;

public class PairOfDice{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
				
		Die die1 = new Die();
		Die die2 = new Die();
		
		int sum;
		
		System.out.println("Enter 2 values between 1 and 6 for the dice; enter -1 for a randomized value");
		
		System.out.println("Value of the first die: ");
		int input1 = scan.nextInt();
		
		System.out.println("Value of the second die: ");
		int input2 = scan.nextInt();
		
		if (input1 == -1){
			die1.roll();
		}
		else{
			die1.setFaceValue(input1);
		}
		
		if (input2 == -1){
			die2.roll();
		}
		else{
			die2.setFaceValue(input2);
		}
		
		sum = die1.getFaceValue() + die2.getFaceValue();
		
		System.out.println("The sum of the dice is: " + sum);
		
		scan.close();
	}
	
	
}