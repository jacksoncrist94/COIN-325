package lab09;

public class IntegerCount{
	
	private int[] numbers = new int[5];
	private int index1 = 0;
	
	public void receiveInteger(int num){
		numbers[index1] = num;
		index1++;
	}
	
	public int receiveCount(int num){
		if (num >= 0 && num <= 100){
		int occurrenceCount = 0;
		for(int i = 0; i < 5; i++){
			if (numbers[i] == num){
				occurrenceCount++;
			}
		}
		return occurrenceCount;}
		else{
			return 0;
		}
	}
	
	public void printout(int testNum, int occurrence){
		System.out.println(testNum + ": " + occurrence);
	}
	
}