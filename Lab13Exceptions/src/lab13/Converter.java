package lab13;

public class Converter{
	
	public static Integer utoi (String str) {
		try{
		return Integer.parseInt(str);
		}catch(NumberFormatException e){
			return null;
		}
		
	}
}