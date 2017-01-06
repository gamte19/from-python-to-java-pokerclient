import org.junit.Test;
import static org.junit.Assert.*;

public class TestPokerClient {

    @Test
    public void highestCardIsMine() {
        PokerClient pokerClient = new PokerClient("h3", "d2", "s3", "s4", "cq");
        assertEquals(pokerClient.highestCardIsMine("s3", "h4", "s5", "d6", "sk"), false);
    }

    @Test
    public void highestCardIsMine2() {
        PokerClient pokerClient = new PokerClient("h3", "d2", "s3", "s4", "cq");
        assertEquals(pokerClient.highestCardIsMine("s3", "h4", "s5", "d6", "sj"), true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidPokerClient(){
        PokerClient pokerClient = new PokerClient("cc", "sd", "nn", "mm", "qq");;
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidCard() {
        PokerClient pokerClient = new PokerClient("h3", "d2", "s3", "s4", "cq");
        assertEquals(pokerClient.highestCardIsMine("xx", "cc", "vv", "bb", "nn"), true);
    }

}
