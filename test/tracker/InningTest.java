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
    public void triple() throws Exception {

    }

    @Test
    public void homeRun_True() throws Exception {
        inningTest.advanceRunners(1);//single
        inningTest.homeRun();
        assertEquals(2,2);
    }

    @Test
    public void homeRun_False() throws Exception {
        inningTest.advanceRunners(1);//single
        inningTest.homeRun();
        assertNotEquals(2,3);
    }

    @Test
    public void totalOnBase_basesLoaded() throws Exception {
        inningTest.advanceRunners(1);
        inningTest.advanceRunners(1);
        inningTest.advanceRunners(1);
        int onBase = inningTest.totalOnBase();
        assertEquals(3, onBase);
    }
    @Test
    public void totalOnBase_TwoOnBase1_3() throws Exception {

    }
    @Test
    public void totalOnBase_TwoOnBase3_1() throws Exception {

    }
    @Test
    public void totalOnBase_TwoOnBase1_2() throws Exception {

    }
    @Test
    public void totalOnBase_OneOnBase() throws Exception {

    }

    @Test
    public void advanceRunners_True() throws Exception {
        inningTest.advanceRunners(3); //triple
        int i = inningTest.totalOnBase();
        assertEquals(3,i);
    }

    @Test
    public void advanceRunners_False() throws Exception {
        inningTest.advanceRunners(2); //double
        int i = inningTest.totalOnBase();
        assertNotEquals(2,3);
    }

    @Test
    public void advanceRunners_Double() throws Exception {
        inningTest.advanceRunners(1);
        inningTest.advanceRunners(2);
        inningTest.advanceRunners(2);
        int i = inningTest.totalOnBase();

        assertEquals(2,i);//totalOnBase
        int runs = inningTest.getRuns();
        assertEquals(2,runs);
    }

}