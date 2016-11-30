package games;

import org.junit.Before;
import org.junit.Test;
import teams.Team;

import static org.junit.Assert.*;

/**
 * Created by Brittany on 11/30/2016.
 */
public class GameTest {
    public Game g = new Game();
    Team testReds = new Team("Reds");
    Team testSoxs = new Team("Soxs");

    @Test
    public void flipCoin_AssignHomeTeam() throws Exception {
        g.flipCoin(testReds, testSoxs);
        boolean redsHome = testReds.checkHome();
        boolean soxsHome = testSoxs.checkHome();
        assertNotEquals(redsHome,soxsHome);
    }

}