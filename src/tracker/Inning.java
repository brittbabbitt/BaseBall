package tracker;

import teams.Team;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class Inning {
    private Team teamBatting;
    private int runs;
    private int outs;
    private final int maxOuts = 3;

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

    public void batInning(Team team){
        do{
            team.bats();
        }while(outs >= maxOuts);
        //reset outs for next inning
        outs = 0;
    }

}
