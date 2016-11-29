package tracker;

import java.util.ArrayList;

/**
 * Description: this class keeps track of the game time and score
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

    public void addRunsToHome(int score){
        homeScore = score;
    }

    public void addRunsToVisitor(int score){
        visitorScore = score;
    }
}
