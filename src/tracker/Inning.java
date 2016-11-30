package tracker;

import teams.Team;

import java.util.ArrayList;

public class Inning {
    private Team teamBatting;
    private int runs;
    private int outs;
    private final int maxOuts = 3;
    private ArrayList <Integer> bases = new ArrayList <Integer>();

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

    public void addRun() { runs++; }

    public void addRuns(Integer runs){
        this.runs+=runs;
    }

    //Team batting starts to bat until the inning is over
    //outs are reset at the end of the team's turn
    public void batInning(){
        do{
            advanceRunners(teamBatting.bats());
        }while(outs <= maxOuts);
        outs = 0;
    }

    //when player hits a triple,
    //runs are counted for those still on base
    public void tripple(){
        for (Integer i: bases) {
            addRuns(i);
        }
        bases.clear();
        bases.add(3);
    }
    public void homeRun(){
        for (Integer i: bases) {
            addRuns(i);
        }
        bases.clear();
        addRun();
    }

    //returns the sum of the base count
    public int totalOnBase(){
        int sum = 0;
        for (Integer b : bases) {
            sum+=b;
        }
        return sum;
    }

    //advances runners if hit is made and adds runs to the team if granted
    //@param: int # of bases to advance runner
    public void advanceRunners(int adv){
        if(adv == 0){
            addOuts();
            return;
        }
        if(totalOnBase() != 0){
            int onBase = totalOnBase();
            if(adv == 3){
                tripple();
            }else if(adv == 2 && onBase >= 2){
                if (bases.size() == 1){
                    addRun();
                    bases.clear();
                }else if (bases.size() >= 2){
                    addRuns(2);
                    bases.remove(0);
                    bases.remove(1);
                }
                bases.add(adv);
            }else if(adv == 1 && onBase >= 3) {
                addRun();
                bases.remove(0);
                bases.add(adv);
            }
        }else if(adv != 4){
            bases.add(adv);
        }else{
                homeRun();
        }

    }

}
