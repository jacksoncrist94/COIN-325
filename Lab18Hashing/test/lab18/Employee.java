package lab18;

public class Employee {
	@SuppressWarnings("unused")
	private String mName, mSSN, mBDay, mDiversity;
	
	Employee(String name, String SSN, String BDay, String Diversity) {
		mName = name;
		mSSN = SSN;
		mBDay = BDay;
		mDiversity = Diversity;
	}
	
	public String getKey(){
		return mSSN + mDiversity;
	}
	
	public String getBDay(){
		return mBDay;
	}
}