package tracker;

import teams.Team;

import java.util.ArrayList;

public class Scoreboard {
    private ArrayList <Score> scoreboard;
    private int maxInnings = 9;
    private int inning = 0;
    private boolean top = true;
    Team home;
    Team visitors;


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

    //adding next inning
    public void nextInning() { inning ++; }

    //resetting innings for a new game
    public void resetInnings() { this.inning = 0; }

    //getters and setters
    //getters: scoreboard, inning, top, home, visitors
    //setters: top, home, visitors
    public ArrayList<Score> getScoreboard(){ return scoreboard; }

    public void setHomeTeam(Team home) {
        this.home = home;
    }

    public Team getHomeTeam() {
        return home;
    }

    public void setVisitorsTeam(Team visitors) {
        this.visitors = visitors;
    }

    public Team getVisitorsTeam() {
        return visitors;
    }

    public int getInning() {
        return inning;
    }

    public void setTopInning(boolean b){
        this.top = b;
    }

    public boolean isTopInning() {
        return top;
    }
}
