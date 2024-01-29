package tuten;

import junit.framework.TestCase;
import java.util.ArrayList;

public class JUnit extends TestCase {
	
	private Exam examTest;
	private Parent parentTest;
	private Question questionTest;
	private Score scoreTest;
	
	protected void setUp() {
		examTest = new Exam("exam1",5,1,10);
		parentTest = new Parent("taha","ceyda");
		questionTest = new Question(6,9);
		scoreTest = new Score("ayşegül",5,15);
	}
	
	public void testGetExam() {
		String expected = "exam1";
		String result = examTest.getExamName();
		assertEquals(expected,result);
	}
	
	public void testGetParent() {
		String expected = "ceyda";
		String result = parentTest.getPassword();
		assertEquals(expected,result);
	}
	
	public void testGetQuestion() {
		int expected = 54;
		int result = questionTest.getResult();
		assertEquals(expected,result);
	}
	
	public void testGetScore() {
		String expected = "ayşegül";
		String result = scoreTest.getWhoSolved();
		assertEquals(expected,result);
	}
	
	public void testGetParentFromFile() {
		ArrayList<Parent> p = Files.readArrayListFromFile("deneme.ser");
		String expected = "taha";
		for(Parent pa: p) {
			if(parentTest.getUsername().equals(pa.getUsername())) {
				assertEquals(expected,pa.getUsername());
			}
		}
	}
	
}
