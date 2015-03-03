package lab10;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuizTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		Quiz quiz = new Quiz();
		Question q = new Question("Who shot first?", "Han");
		
		quiz.add(q);
		
		assertTrue(q.getQuestion().equals("Who shot first?"));
		assertTrue(q.getAnswer().equals("Han"));
	}

	@Test
	public void test2() {
		Quiz quiz2 = new Quiz();
		Question q1 = new Question("Who shot first?", "Han");
		Question q2 = new Question("1+1?", "2");
		Question q3 = new Question("Best Starfleet captain?", "Picard");
		Question q4 = new Question("Best Daft Punk album?", "Discovery");
		Question q5 = new Question("Best Pokemon?", "Quagsire");
		Question q6 = new Question("When was the Declaration of Independence signed?", "1776");
		Question q7 = new Question("What language is this program in?", "Java");
		Question q8 = new Question("What class is this for?", "COIN 325");
		Question q9 = new Question("Who is the professor?", "Paul West");
		Question q10 = new Question("What is your major?", "Computer Science");
		Question q11 = new Question("How many questions are in this quiz?", "25");
		Question q12 = new Question("What color is the sky?", "Blue");
		Question q13 = new Question("Best tv show?", "Neon Genesis Evangelion");
		Question q14 = new Question("True or False: 5 - 3 = 2", "True");
		Question q15 = new Question("What kind of bear is best?", "Black bear");
		Question q16 = new Question("How many states are in the US?", "50");
		Question q17 = new Question("How many colonies were in the US at its inception?", "13");
		Question q18 = new Question("Write down a number.", "Suck it Trebek");
		Question q19 = new Question("What state do you live in?", "SC");
		Question q20 = new Question("What university are you in?", "CSU");
		Question q21 = new Question("Freshman, Sophomore, Junior, or Senior?", "Junior");
		Question q22 = new Question("Favorite color?", "Blue");
		Question q23 = new Question("Favorite video game?", "Super Smash Bros.");
		Question q24 = new Question("'A penny saved is a penny _____'?", "Earned");
		Question q25 = new Question("Is this the last question?", "YES");
		Question q26 = new Question("Will this question be left out?", "I hope so.");
		
		quiz2.add(q1);
		quiz2.add(q2);
		quiz2.add(q3);
		quiz2.add(q4);
		quiz2.add(q5);
		quiz2.add(q6);
		quiz2.add(q7);
		quiz2.add(q8);
		quiz2.add(q9);
		quiz2.add(q10);
		quiz2.add(q11);
		quiz2.add(q12);
		quiz2.add(q13);
		quiz2.add(q14);
		quiz2.add(q15);
		quiz2.add(q16);
		quiz2.add(q17);
		quiz2.add(q18);
		quiz2.add(q19);
		quiz2.add(q20);
		quiz2.add(q21);
		quiz2.add(q22);
		quiz2.add(q23);
		quiz2.add(q24);
		quiz2.add(q25);
		quiz2.add(q26);
		
		quiz2.setTestMode(true);
		
		quiz2.giveQuiz();
		
		assertTrue(quiz2.points == 25);
	}
}
