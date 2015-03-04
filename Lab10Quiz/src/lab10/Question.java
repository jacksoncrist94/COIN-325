package lab10;

public class Question{
	
	private String que;
	private String ans;
	private String res;
	public Question(String question, String answer){
		que = question;
		ans = answer;
	}
	
	public String getQuestion(){
		return que;
	}
	
	public String getAnswer(){
		return ans;
	}

	public void setResponse(String input){
		res = input;
	}
	
	public String getResponse(){
		return res;
	}

	public static void main(String[] args){
		
		Quiz quiz2 = new Quiz();
		quiz2.add(new Question("Who shot first?", "Han")); //1
		quiz2.add(new Question("1+1?", "2")); //2
		quiz2.add(new Question("Best Starfleet captain?", "Picard")); //3
		quiz2.add(new Question("Best Daft Punk album?", "Discovery")); //4
		quiz2.add(new Question("Best Pokemon?", "Quagsire")); //5
		quiz2.add(new Question("When was the Declaration of Independence signed?", "1776")); //6
		quiz2.add(new Question("What language is this program in?", "Java")); //7
		quiz2.add(new Question("What class is this for?", "COIN 325")); //8
		quiz2.add(new Question("Who is the professor?", "Paul West")); //9
		quiz2.add(new Question("What is your major?", "Computer Science")); //10
		quiz2.add(new Question("How many questions are in this quiz?", "25")); //11
		quiz2.add(new Question("What color is the sky?", "Blue")); //12
		quiz2.add(new Question("Best tv show?", "Neon Genesis Evangelion")); //13
		quiz2.add(new Question("True or False: 5 - 3 = 2", "True")); //14
		quiz2.add(new Question("What kind of bear is best?", "Black bear")); //15
		quiz2.add(new Question("How many states are in the US?", "50")); //16
		quiz2.add(new Question("How many colonies were in the US at its inception?", "13")); //17
		quiz2.add(new Question("Write down a number.", "Suck it Trebek")); //18
		quiz2.add(new Question("What state do you live in?", "SC")); //19
		quiz2.add(new Question("What university are you in?", "CSU")); //20
		quiz2.add(new Question("Freshman, Sophomore, Junior, or Senior?", "Junior")); //21
		quiz2.add(new Question("Favorite color?", "Blue")); //22
		quiz2.add(new Question("Favorite video game?", "Super Smash Bros.")); //23
		quiz2.add(new Question("'A penny saved is a penny _____'?", "Earned")); //24
		quiz2.add(new Question("Is this the last question?", "YES")); //25
		quiz2.add(new Question("Will this question be left out?", "I hope so.")); 
		//26 to test if it will be excluded in order to prevent an out of bounds exception
		
		
		quiz2.giveQuiz();
		
	}
	
	
	
	
}