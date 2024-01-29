
package tuten;

import java.io.Serializable;
import java.time.LocalTime;

/**
 *
 * @author yusuf
 */
public class Score implements Serializable{
    /**
    * 
    */
    private static final long serialVersionUID = 1L;
    private String whoSolved;
    private int trueCount;
    private int allTimePassed;

    public Score(String whoSolved, int trueCount, int allTimePassed) {
        this.whoSolved = whoSolved;
        this.trueCount = trueCount;
        this.allTimePassed = allTimePassed;
    }

    public Score() {
    }
      
    
    public String getWhoSolved() {
        return whoSolved;
    }

    public void setWhoSolved(String whoSolved) {
        this.whoSolved = whoSolved;
    }

    public int getTrueCount() {
        return trueCount;
    }

    public void setTrueCount(int trueCount) {
        this.trueCount = trueCount;
    }

    public int getAllTimePassed() {
        return allTimePassed;
    }

    public void setAllTimePassed(int allTimePassed) {
        this.allTimePassed = allTimePassed;
    }
    
    
 
}
