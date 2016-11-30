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
    Team home;
    Team visitors;

    //chooses who is home and who is visitors
    //param: 2 teams
    public void flipCoin(Team team1, Team team2){
        int rand = (int)(Math.random()*100);
        if(rand > 50){
            team1.setHome(true);
            team2.setHome(false);
            home = team1;
            visitors = team2;
        }else{
            team1.setHome(false);
            team2.setHome(true);
            home = team2;
            visitors = team1;
        }
    }

    public boolean playBall(){
        Team team1 = new Team("Reds");
        Team team2 = new Team("Soxs");
        flipCoin(team1, team2);
        scoreboard = new Scoreboard();
        scoreboard.startGame(visitors, home);
        announceWinner(scoreboard);
        return true;
    }

    public boolean endGame(){
        //TODO: check if game is tied - IF TIED add an inning and continue playing
        this.start = false;
        this.endTime = LocalDateTime.now();
        return true;
    }

    public void announceWinner(Scoreboard scoreboard){
        System.out.println(home.getTeamName()+" : "+ scoreboard.getTotalHome());
        System.out.println(visitors.getTeamName()+" : "+ scoreboard.getTotalVisitors());

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