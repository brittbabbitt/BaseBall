package tracker;

import teams.Team;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class Innings {
    Team teamBatting;
    int runs;
    int inning;
    int outs;


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

}
