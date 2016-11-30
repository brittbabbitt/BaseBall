package teams;

import util.NameGen;

/**
 * Description: This class is used to keep records of players
 */
public class Player {
    private String playerName;
    private int playerID;

    public Player(int num){
        NameGen genName = new NameGen();
        this.playerName = genName.getName();
        this.playerID = num;
    }

    public Player(String name){ this.playerName = name; }

    //randomizes a pitch and returns the type of hit
    //a player gets
    //@return:
    // 0 - out
    // 1 - single
    // 2 - double
    // 3 - triple
    public int hits(){
        float p = (float)Math.random()*100;
        int pitch = (int) p;

        if(pitch < 70){
            return 0;
        }else if(pitch >= 70 && pitch < 87){
            printPlayerAction("Single");
            return 1;
        }else if(pitch >= 87 && pitch < 94){
            printPlayerAction("Double");
            return 2;
        }else if(pitch >= 94 && pitch < 98){
            printPlayerAction("HOME RUN!!!");
            return 4;
        }else{
            printPlayerAction("Triple");
            return 3;
        }
    }

    //--print--
    public void printPlayerAction(String action){
        System.out.print("Player "+ getPlayerID() +" : " + getPlayerName()+", ");
        System.out.println("hits a " + action);
    }
    //getters and setters
    //getters: playerName, playerID
    //setters: playerName
    public String getPlayerName(){
        return playerName;
    }

    //if user wishes to set the name of their players
    public void setPlayerName(String name){ this.playerName = name; }

    public int getPlayerID() { return playerID; }
}
