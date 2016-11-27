package tracker;

import teams.Team;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class Innings {
    Team team;
    int inning;
    int outs;
    int maxInnings = 9;

    public int getInning() {
        return inning;
    }


    public void setInning(int inning) //throws Exception
    {
        if(inning < maxInnings)
            this.inning = inning;
        else{
            maxInnings++;
            //throw new Exception();
        }
    }


    public void batInning(Team team){
        do{
            team.startBatting();
        }while(outs >= 3);
        //reset outs for next inning
        outs = 0;
    }

}
