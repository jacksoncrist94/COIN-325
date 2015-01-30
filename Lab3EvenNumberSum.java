import java.util.Scanner;

public class Lab3EvenNumberSum
{
	public static void main (String[] args)
	{
		int userNum;
		int outputNum;
		int count;
		userNum = 0;
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("This program prints the sum of all even numbers between 2 and your input.");
		
		while (userNum < 2)
		{
		System.out.println ("Please enter a number greater than 1.");
		userNum = scan.nextInt();
		}
		
		if (userNum % 2 != 0)
		{
			userNum -= 1;
		}
		
		outputNum = 0;
		count = 2;
		
		if (userNum > 3)
		{
			while (count <= userNum)
			{
				outputNum += count;
				count += 2;
			}
		}
		
		System.out.println ("Sum = " + outputNum);
		
		scan.close();
	}
}
