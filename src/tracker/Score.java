package tracker;

import java.util.ArrayList;

/**
 * Description: this class wraps the home and visitor score in a container
 * to add to the scoreboard
 */
public class Score {
    private int homeScore = 0;
    private int visitorScore = 0;

    public void setHomeScore(int score) {
        this.homeScore = score;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public void setVisitorScore(int score){
        this.visitorScore = score;
    }

    public int getVisitorScore(){
        return visitorScore;
    }
}
