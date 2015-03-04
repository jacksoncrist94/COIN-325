package lab10;

import java.util.Scanner;

public class Quiz{
	private Scanner scan = new Scanner(System.in);
	
	private Question[] questions = new Question[25];
	private int count = 0;
	private boolean testMode = false;
	int points = 0;
	
	public void add(Question question){
		if(count < questions.length){
			questions[count] = question;
			count++;
		}
	}
	
	public void giveQuiz(){
		
		
		for(int i = 0; i < questions.length; i++){
			System.out.println(questions[i].getQuestion());
			
			if(testMode == true){
				questions[i].setResponse(questions[i].getAnswer());
			}
			else{
				questions[i].setResponse(scan.nextLine());
			}
			
			if(questions[i].getResponse().equals(questions[i].getAnswer())){
				points++;
			}
		}
		
		for(int i = 0; i < questions.length; i++){
			System.out.println(questions[i].getQuestion() + " Student response: " + questions[i].getResponse() + "; Instructor's answer: " + questions[i].getAnswer());
		}
		
		System.out.println("Points received: " + points + " out of 25");
	}
	
	public void setTestMode(boolean bool){
		testMode = bool;
	}
}