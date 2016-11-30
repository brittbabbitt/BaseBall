package tracker;

import teams.Team;

import java.util.ArrayList;

public class Inning {
    private Team teamBatting;
    private int runs;
    private int outs=0;
    private final int maxOuts = 3;
    private ArrayList <Integer> bases = new ArrayList <Integer>();

    //Team batting starts to bat until the inning is over
    //outs are reset at the end of the team's turn
    public void batInning(){
        do{
            advanceRunners(teamBatting.bats());
        }while(outs < maxOuts);
        outs = 0;
    }

    //adding run(s)
    public void addRun() { runs++; }

    public void addRuns(int runs){
        this.runs+=runs;
    }

    //returns the sum of the base #'s from total on bases
    //used to compare if total on base will advance to a run
    //implementation example in advanceRunners()
    public int totalOnBase(){
        int sum = 0;
        for (Integer b : bases) {
            sum+=b;
        }
        return sum;
    }

    //when player hits a triple,
    //runs are counted for those still on base
    public void triple(){
        addRuns(bases.size());
        bases.clear();
        bases.add(3);
    }
    public void homeRun(){
        addRuns(bases.size()+1);
        bases.clear();
    }

    //advances runners if hit is made and adds runs to the team if granted
    //@param: # of bases to advance runner
    //int adv represents:
    // 1 - single
    // 2 - double
    // 3 - triple
    public void advanceRunners(int adv){
        if(adv == 0){
            addOuts();
            return;
        }
        if(totalOnBase() != 0){
            if(adv == 3){
                triple();

                //TODO: refactor double...write test
            }else if(adv == 2 && totalOnBase() >= 2){
                if (bases.size() == 1){
                    addRuns(1);
                    bases.clear();
                }else if (bases.size() >= 2){
                    addRuns(2);
                    bases.remove(0);
                    bases.remove(1);
                }
                bases.add(adv);
            }else if(adv == 1 && totalOnBase() == 3) {
                addRuns(1);
                bases.remove(0);
                bases.add(adv);
            }
        }else if(adv != 4){
            bases.add(adv);
        }else{
            homeRun();
        }

    }

    //getters and setters
    //getters: teamBatting, outs, runs
    //setters: teamBatting, outs, runs

    public void setTeamBatting(Team teamBatting) {
        this.teamBatting = teamBatting;
    }

    public Team getTeamBatting() {
        return teamBatting;
    }

    public void addOuts() {
        this.outs++;
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

}
