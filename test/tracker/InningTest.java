package tracker;

import org.junit.Before;
import org.junit.Test;
import teams.Team;

import static org.junit.Assert.*;

/**
 * Created by Brittany on 11/30/2016.
 */
public class InningTest {
    public Inning inningTest = new Inning();
    //setting team, team batting and starting inning
    @Before
    public void setTestReds(){
        Team testReds = new Team("Reds");
        inningTest.setTeamBatting(testReds);
    }

    @Test
    public void batInning() throws Exception {

    }

    @Test
    public void tripple() throws Exception {

    }

    @Test
    public void homeRun_True() throws Exception {
        inningTest.advanceRunners(1);
        inningTest.homeRun();
        assertEquals(2,2);
    }

    @Test
    public void homeRun_False() throws Exception {
        inningTest.advanceRunners(1);
        inningTest.homeRun();
        assertNotEquals(2,3);
    }

    @Test
    public void totalOnBase() throws Exception {

    }

    @Test
    public void advanceRunners_True() throws Exception {
        inningTest.advanceRunners(3);
        int i = inningTest.totalOnBase();
        assertEquals(3,i);
    }

    @Test
    public void advanceRunners_False() throws Exception {
        inningTest.advanceRunners(2);
        int i = inningTest.totalOnBase();
        assertNotEquals(2,3);
    }

}