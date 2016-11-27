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

    public boolean playBall(){
        Field ballField = new Field();
        this.start = true;
        this.startTime = LocalDateTime.now();


        return true;
    }

    public boolean endGame(){
        //TODO: check if game is tied - IF TIED add an inning and continue playing
        this.start = false;
        this.endTime = LocalDateTime.now();
        return true;
    }



}