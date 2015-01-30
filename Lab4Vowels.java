import java.util.Scanner;

public class Lab4Vowels
{
	public static void main (String[] args)
	{
		int aNum = 0;
		int eNum = 0;
		int iNum = 0;
		int oNum = 0;
		int uNum = 0;
		int otherNum = 0;
		
		String userInput;
		Scanner scan = new Scanner(System.in);
		
		System.out.println ("This program counts the number of each vowel in your sentence, and sums up all other characters.");
		System.out.println ("Please enter your sentence.");
		
		userInput = scan.nextLine();
		userInput.toLowerCase();
		
		Scanner stringscan = new Scanner(userInput);
		stringscan.useDelimiter("");
		
		while (stringscan.hasNext())
		{
				switch (stringscan.next())
				{
					case "a" :
						aNum++;
						break;
					case "e" :
						eNum++;
						break;
					case "i" :
						iNum++;
						break;
					case "o" :
						oNum++;
						break;
					case "u" :
						uNum++;
						break;
					default:
						otherNum++;
						break;
				}
				
		}

		System.out.println ("Number of a's: " + aNum);
		System.out.println ("Number of e's: " + eNum);
		System.out.println ("Number of i's: " + iNum);
		System.out.println ("Number of o's: " + oNum);
		System.out.println ("Number of u's: " + uNum);
		System.out.println ("Number of non-vowels: " + otherNum);
		
		scan.close();
		stringscan.close();
	}
}