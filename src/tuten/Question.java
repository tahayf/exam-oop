package tuten;

import java.io.Serializable;

public class Question implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int num1;
	private int num2;
	private final int result;
	private int answer;
	private boolean isTrue;
        private int timePassed;
	

	public Question(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		this.result = num1*num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getResult() {
		return result;
	}


	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}
	
	public void setTrue(boolean isTrue) {
		this.isTrue = isTrue;
	}

	public boolean isTrue() {
		return isTrue;
	}

        public int getTimePassed() {
            return timePassed;
        }

        public void setTimePassed(int timePassed) {
            this.timePassed = timePassed;
        }
        
        

	@Override
	public String toString() {
		return "Question [num1=" + num1 + ", num2=" + num2 + ", result=" + result + ", answer=" + answer + ", isTrue="
				+ isTrue + "]";
	}

	
	
}
