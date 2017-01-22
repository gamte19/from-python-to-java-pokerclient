import org.junit.Test;
import static org.junit.Assert.*;

public class TestCard {


    @Test(expected = IllegalArgumentException.class)
    public void cardColorIsInvalid() {
        Card card = new Card("x2");
    }

    @Test(expected = IllegalArgumentException.class)
    public void cardValueIsGreaterThan10() {
        Card card = new Card("s11");
    }

    @Test(expected = IllegalArgumentException.class)
    public void cardValueIsSmallerThan2() {
        Card card = new Card("s1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void cardNumberIsInvalid() {
        Card card = new Card("sS");
    }

    @Test
    public void cardColorIsLowercase() {
        Card card = new Card("s2");
        assertEquals(card.getValue(), 2);
    }

    @Test
    public void cardValueIsLowercase() {
        Card card = new Card("Sk");
        assertEquals(card.getValue(), 13);
    }

    @Test
    public void validCardWithNumber() {
        Card card = new Card("S2");
        assertEquals(card.getValue(),2);
    }

    @Test
    public void validCardLetter() {
        Card card = new Card("SK");
        assertEquals(card.getValue(),13);
    }
}
