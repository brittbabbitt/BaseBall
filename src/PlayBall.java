/**
 * Main class to start the BaseBall game
 */
import games.Game;
import teams.Team;
public class PlayBall {

    public static void main(String[] args) {

        Team t = new Team("Red Sox");
        Team t2 = new Team("White Sox");
        Game game = new Game(t, t2);
        game.playBall();
    }
}
