package teams;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Description: This class is used to keep records of teams
 */
public class Team {
    //--Team Data--
    private String teamName;
    private boolean home = true;
    private int teamRuns = 0;
    private int outs = 0;

    //--Player Lists--
    private ArrayList<Player> players = new ArrayList<Player>();
    private int maxPlayers = 9;

    //--Batting Data--
    private int rosterCount = 0;

    private Player batting;
    private Player thirdAtBat;
    private Player nextAtBat;

    //creates a team with a name and a batting line up
    //@param team name
    public Team(String teamName){
        this.teamName = teamName;
        createTeam();
        setBattingLineUp();
    }

    //--TEAM NAME
    //get Team name
    public String getTeamName() {
        return teamName;
    }

    //set Team name
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    //--PLAYERS ON A TEAM
    //get a list of all players on the team
    public ArrayList<Player> getTeamPlayers() {
        if(players.isEmpty()){
            createTeam();
        }
        return players;
    }

    //create a list of players for a team
    //@limit maxPlayers are 9 on the field
    private void createTeam(){
        for(int i = 0; i < maxPlayers; i++){
            players.add(addPlayer(i));
        }
    }

    //adding a player
    //@params Player needs an id
    //@return Player Object to be added to a team
    private Player addPlayer(int i){
        Player p = new Player(i);
        return p;
    }

    //printing a list of Players
    public void printTeam(){
        if(!players.isEmpty()){
            for (Player p: players) {
                System.out.println("Player Name:" + p.getPlayerName());
                System.out.println("Player ID:" + p.getPlayerID() + '\n');
            }
            System.out.println("Players Total: " + players.size());
        }
    }

    //---GAME ACTIONS---

    //--Batting

    //--Tracking Runs---
    //gets team runs
    public int getTeamRuns() { return teamRuns; }
    //sets team runs
    public void setTeamRuns(int teamRuns) { this.teamRuns+=teamRuns; }

    //--Players on Base--

    //--Team Bats--
    public void bats(){
        //TODO: set while condition

           //System.out.println(p.hits());
    }


    //---The Line Up---
    //sets the batting line-up
    public void setBattingLineUp(){
        //check if Array out of bounds...reset roster count to 0
        batting(players.get(rosterCount));
        setNextAtBat(players.get(rosterCount+1));
        set3rdAtBat(players.get(rosterCount+2));
    }

    public void printLineUp(){
        System.out.println("Batting: " + getBatter().getPlayerName());
        System.out.println("Next Batter: " + getNextAtBat().getPlayerName());
        System.out.println("3rd at Bat: " + get3rdAtBat().getPlayerName() + "\n");
    }

    //keeps count of the line up for Players in the line up
    public void increaseLineUp(){
        if(this.rosterCount < maxPlayers){
            this.rosterCount++;
        }else{
            this.rosterCount=0;
        }
        setBattingLineUp();
    }

    //sets the player that is batting
    public void batting(Player batting){ this.batting = batting; }
    //set a player to 'next at bat' - next in line to bat
    public void setNextAtBat(Player nextAtBat) {
        this.nextAtBat = nextAtBat;
    }
    //set the next player to 3rd in line to bat
    public void set3rdAtBat(Player thirdAtBat){ this.thirdAtBat = thirdAtBat; }

    //getters for batting line up setters
    public Player getBatter(){ return batting; }
    public Player getNextAtBat(){ return nextAtBat; }
    public Player get3rdAtBat(){ return thirdAtBat; }
}
