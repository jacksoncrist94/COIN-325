package lab14;

public class DivisorCalc{
	
	public static int gcd (int num1, int num2){
		if(num2 <= num1 && (num1 % num2 == 0)){
			return num2;
		}
		
		else{
			if(num1 < num2){
				int i;
				i = gcd(num2, num1);
				return i;
			}
			else{
				int i;
				i = gcd(num2, (num1 % num2));
				return i;
			}
			
		}
		
	}
	
}