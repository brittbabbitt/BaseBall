package games;

import teams.Team;
import tracker.Scoreboard;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Description: this class starts a game and prints the summary of the game
 */
public class Game {
    private boolean start = false;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    Scoreboard scoreboard;



    //chooses who is home and who is visitors
    //param: 2 teams
    public void flipCoin(Team team1, Team team2){
        int rand = (int)(Math.random()*100);
        if(rand > 50){
            team1.setHome(true);
        }else{
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
    //getters: scoreboard
    //setters: scoreboard

    public Scoreboard getScoreboard() {
        return scoreboard;
    }

    public void setScoreboard(Scoreboard scoreboard) {
        this.scoreboard = scoreboard;
    }
}