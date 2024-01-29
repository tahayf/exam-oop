package tuten;

import java.util.*;
import java.io.Serializable;
import java.security.SecureRandom;

public class Exam implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
        private String examName;
	private int N; // number of questions
	private int lower;
	private int upper;
	private ArrayList<Question> questions = new ArrayList<Question>();
        private ArrayList<Score> scores = new ArrayList<Score>();
	
	public Exam(String examName, int n, int lower, int upper) {
            this.examName = examName;
            this.N = n;
            this.lower = lower;
            this.upper = upper;
		
            for(int i = 0; i < N; i++) { // we're creating questions here
		SecureRandom rand = new SecureRandom();
		int random1 = rand.nextInt(upper - lower + 1) + lower;
		int random2 = rand.nextInt(upper - lower + 1) + lower;
			
		Question q = new Question(random1,random2);
			
		questions.add(q);
            }
	}	
	
        public String getExamName(){
                return examName;
        }
	
	public int getN() {
		return N;
	}

	public int getLower() {
		return lower;
	}

	public int getUpper() {
		return upper;
	}

	public ArrayList<Question> getQuestions() {
		return questions;
	}

        public ArrayList<Score> getScores() {
            if (scores == null) {
                scores = new ArrayList<Score>();
            }
            return scores;
        }

        public void setScores(ArrayList<Score> scores) {
            this.scores = scores;
        }
        
        public void delScores(){
            this.scores = null;
        }
        

	@Override
	public String toString() {
		return "Exam [N=" + N + ", lower=" + lower + ", upper=" + upper + ", questions=" + questions + "]";
	}
	
	
	
}
