package tracker;

import teams.Team;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class Innings {
    private boolean topInning = true;
    private Team teamBatting;
    private int runs;
    private int inning;
    private int outs;


    public int getInning() {
        return inning;
    }

    public void setTeamBatting(Team teamBatting) {
        this.teamBatting = teamBatting;
    }

    public Team getTeamBatting() {
        return teamBatting;
    }

    public void setOuts(int outs) {
        this.outs = outs;
    }

    public int getOuts() {
        return outs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getRuns() {
        return runs;
    }

    public void setInning(int inning) {
        this.inning = inning;
    }

    public void batInning(Team team){
        do{
            team.startBatting();
        }while(outs >= 3);
        //reset outs for next inning
        outs = 0;
    }

    public void setTopInning(boolean b){
        this.topInning = b;
    }

    public boolean isTopInning() {
        return topInning;
    }

}
