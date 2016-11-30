package games;

import teams.Team;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Description: this class starts a game and prints the summary of the game
 */
public class Game {
    private boolean start = false;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    Team team1; // home team
    Team team2; // visitors team




    public void flipCoin(Team team1, Team team2){
        int rand = (int)(Math.random()*100);
        if(rand > 50){
            setHome(team1);
            team1.setHome(true);
        }else{
            setVisitors(team2);
            team2.setHome(false);
        }
    }

    public boolean playBall(){

        return true;
    }

    public boolean endGame(){
        //TODO: check if game is tied - IF TIED add an inning and continue playing
        this.start = false;
        this.endTime = LocalDateTime.now();
        return true;
    }

    //getters and setters
    //getters: visitors team, home team
    //setters: visitors team, home team
    public Team getVisitors() {
        return team2;
    }

    public void setVisitors(Team visitors) {
        this.team2 = visitors;
    }

    public Team getHome() {
        return team1;
    }

    public void setHome(Team home) {
        this.team1 = home;
    }

}