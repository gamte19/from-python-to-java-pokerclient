import org.junit.Test;
import static org.junit.Assert.*;

public class TestCard {


    @Test(expected = IllegalArgumentException.class)
    public void invalidColor() {
        Card card = new Card("x2");
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidColor2() {
        Card card = new Card("!2");
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidCardNumber() {
        Card card = new Card("s11");
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidCardNumber2() {
        Card card = new Card("s1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidCardNumber3() {
        Card card = new Card("sS");
    }

    @Test
    public void validCard() {
        Card card = new Card("S2");
        assertEquals(card.getValue(),2);
    }

    @Test
    public void validCard2() {
        Card card = new Card("SK");
        assertEquals(card.getValue(),13);
    }
}
