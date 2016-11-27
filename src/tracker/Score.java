package tracker;

import java.util.ArrayList;

/**
 * Description: this class keeps track of the game time and score
 */
public class Score {
    private int maxInnings = 9;
    private ArrayList <Innings> score = new ArrayList<Innings>();

    public void setScore(Innings inning) {
        this.score.add(inning);
    }

    public ArrayList<Innings> getScore() {
        return score;
    }
}
