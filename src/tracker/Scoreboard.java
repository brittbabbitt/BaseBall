package tracker;

import teams.Team;

import java.util.ArrayList;

public class Scoreboard {
    private ArrayList <Score> scoreboard = new ArrayList<>();
    private int maxInnings = 9;
    private int inning = 0;
    private boolean top = true;
    private int totalHome;
    private int totalVisitors;

    public void startGame(Team visitors, Team home){
        while (inning < maxInnings){
            Score scoreblock = new Score();
            nextInning();
            printInningNumber(inning);

            //visitors batting
            visitors.printTeamName();
            int runs = startBattingInning(visitors);
            scoreblock.setVisitorScore(runs);
            System.out.println("Runs: "+ runs);
            totalVisitors+=runs;

            //home batting
            home.printTeamName();
            runs = startBattingInning(home);
            scoreblock.setHomeScore(runs);
            System.out.println("Runs: "+ runs + "\n");
            addScore(scoreblock);

            totalHome+=runs;
            if(inning >= maxInnings && totalVisitors == totalHome ){
                maxInnings++;
            }
        }

        printScoreboard();
    }

    public int startBattingInning(Team batting){
        Inning inning = new Inning();
        inning.setTeamBatting(batting);
        inning.batInning();

        int runs = inning.getRuns();
        return runs;
    }

    public void addScore(Score score){
            this.scoreboard.add(score);
    }

    public void lightUp(){
        this.inning = 0;
        this.top = true;
    }

    //adding next inning
    public void nextInning() { inning ++; }

    //resetting innings for a new game
    public void resetInnings() { this.inning = 0; }

    //printing

    //-inning-
    public void printInningNumber(int i){
        System.out.println("Inning: "+ i);
    }
    //-scoreboard-
    public void printScoreboard(){

        System.out.print(" | Innning | \t| ");
        for (int i = 0; i < scoreboard.size(); i++) {
            System.out.print( i+1 +" | ");
        }
        System.out.print("R |");

        System.out.print("\n | Home | \t\t| ");
        for (Score s: scoreboard) {
            System.out.print(s.getHomeScore() +" | ");
        }
        System.out.print(totalHome + " |");

        System.out.print("\n | Visitors | \t| ");
        for (Score s: scoreboard) {
            System.out.print(s.getVisitorScore() +" | ");
        }
        System.out.println(totalVisitors + " |");

    }



    //getters and setters
    //getters: scoreboard, inning, totalHome, totalVisitors
    public ArrayList<Score> getScoreboard(){ return scoreboard; }

    public Score getInning(int i) {
        return scoreboard.get(i);
    }

    public int getTotalHome() {
        return totalHome;
    }
    public int getTotalVisitors(){
        return totalVisitors;
    }
}
