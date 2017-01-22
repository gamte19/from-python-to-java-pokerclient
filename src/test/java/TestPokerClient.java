import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class TestPokerClient {

    private PokerClient pokerClient;

    @Before
    public void setUp(){
        pokerClient = new PokerClient("h3", "d2", "s3", "s4", "cq");
    }

    @After
    public void tearDown() {
        pokerClient = null;
    }

    @Test
    public void highestCardIsMine() {
        assertTrue(pokerClient.highestCardIsMine("s3", "h4", "s5", "d6", "sk"));
    }

    @Test
    public void highestCardIsNotMine() {
        assertTrue(pokerClient.highestCardIsMine("s3", "h4", "s5", "d6", "s6"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidPokerClient(){
        PokerClient wrongPokerClient = new PokerClient("cc", "sd", "nn", "mm", "qq");;
    }

    @Test
    public void highestCardIsMineEquals(){
        assertTrue(pokerClient.highestCardIsMine("h3", "d2", "s3", "s4", "cq"));
    }

}
