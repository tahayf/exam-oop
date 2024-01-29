
package tuten;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author yusuf
 */
public class Diary implements Serializable{
    private String whoSolved;
    private Exam exam;
    private LocalDateTime whenStarted;
    private Score score;
    
    
    public Diary(String whoSolved, Exam exam, LocalDateTime whenStarted, Score score) {
        this.whoSolved = whoSolved;
        this.exam = exam;
        this.whenStarted = whenStarted;
        this.score = score;
    }
    
    
    public String getWhoSolved() {
        return whoSolved;
    }

    public void setWhoSolved(String whoSolved) {
        this.whoSolved = whoSolved;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public LocalDateTime getWhenStarted() {
        return whenStarted;
    }

    public void setWhenStarted(LocalDateTime whenStarted) {
        this.whenStarted = whenStarted;
    }
    
    public Score getScore() {
		return score;
	}


	public void setScore(Score score) {
		this.score = score;
	}


	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Diary{whoSolved=").append(whoSolved).append(", exam={\n");
        sb.append("N=").append(exam.getN()).append(", lower=").append(exam.getLower()).append(", upper=").append(exam.getUpper()).append(",\n");
        sb.append("]}}");
        return sb.toString();
    }   
    
    
}
