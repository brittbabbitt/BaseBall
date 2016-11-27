package games;

import teams.Team;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Description: this class starts a game and prints the summary of the winners
 */
public class Game {
    private boolean start = false;
    int inning = 1;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int maxInnings = 9;
    private Team home;
    private Team visitor;
    private Team batting;

    public Game(Team home, Team visitor){
        this.home = home;
        this.visitor = visitor;
    }

    public boolean playBall(){
        Field ballField = new Field();
        this.start = true;
        this.startTime = LocalDateTime.now();

        do{

        }while(inning <= maxInnings);

        return true;
    }

    public void switchSides(Team batting){
        this.batting = batting;
    }

    public boolean endGame(){
        //TODO: check if game is tied - IF TIED add an inning and continue playing
        this.start = false;
        this.endTime = LocalDateTime.now();
        return true;
    }



}