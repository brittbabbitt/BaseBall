package games;

import teams.Team;

import java.util.ArrayList;

public class Innings {
    Team home;
    Team visitor;
    int inning;
    int outs;

    public Innings(Team home, Team visitor, int inning){
        this.home = home;
        this.visitor = visitor;
        this.inning = inning;
    }

    public int getInning() {
        return inning;
    }

    public Team getHome() {
        return home;
    }

    public Team getVisitor() {
        return visitor;
    }

    public void setHome(Team home) {
        this.home = home;
    }

    public void setInning(int inning) {
        this.inning = inning;
    }

    public void setVisitor(Team visitor) {
        this.visitor = visitor;
    }

    public void playInning(){
        do{
            visitor.startBatting();
            if(outs > 3){
                home.startBatting();
            }
        }while(outs >= 6);
        //reset inning
        outs = 0;
    }

}
