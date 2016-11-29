package tracker;

import java.util.ArrayList;

public class Scoreboard {
    private ArrayList <Score> scoreboard;
    private int maxInnings = 9;
    private int inning = 0;
    private boolean top = true;


    public int getInning() {
        return inning;
    }

    public void nextInning() { inning ++; }

    public void resetInnings() { this.inning = 0; }

    public void setTopInning(boolean b){
        this.top = b;
    }

    public boolean isTopInning() {
        return top;
    }

    public void addScore(Score score){
        if(inning < maxInnings)
            this.scoreboard.add(score);
        else
            System.out.println("Error: innings went over max.");
    }

    public void lightUp(){
        this.inning = 0;
        this.top = true;
    }

    public ArrayList<Score> getScoreboard(){ return scoreboard; }

}
