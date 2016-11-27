package teams;

import names.NameGen;

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

    public String getPlayerName(){
        return playerName;
    }

    //if user wishes to set the name of their players
    public void setPlayerName(String name){ this.playerName = name; }

    public int getPlayerID() { return playerID; }

    public int hit(int i){
        i = 0;
        //TODO: logic for hitting Math.random()
        return i;
    }
}
