import java.util.*;

/**
 * Created by mbeothy on 2016. 12. 08..
 */
public class Card {
    private static final List<String> possibleCardColors = Arrays.asList("S", "C", "H", "D");
    private static final Map<String, Integer> alphabeticCardValue = new HashMap<String, Integer>() {{
        put("J", 11);
        put("Q", 12);
        put("K", 13);
        put("A", 14);
    }};
    private String cardColor;
    private int cardNumber;


    public Card(String cardValue) throws IllegalArgumentException {
        String firstValue = cardValue.substring(0, 1).toUpperCase();
        String secondValue = cardValue.substring(1, cardValue.length()).toUpperCase();
        if (!(possibleCardColors.contains(firstValue))) {
            throw new IllegalArgumentException("Not a valid color" + firstValue);
        }
        this.cardColor = firstValue;

        if (alphabeticCardValue.containsKey(secondValue)) {
            this.cardNumber = alphabeticCardValue.get(secondValue);
        } else if (Integer.parseInt(secondValue) >= 2 && Integer.parseInt(secondValue) <= 10) {
            this.cardNumber = Integer.parseInt(secondValue);
        } else {
            throw new IllegalArgumentException("Not a valid number" + secondValue);
        }
    }

    public int getValue() {
        return cardNumber;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardColor='" + cardColor + '\'' +
                ", cardNumber=" + cardNumber +
                '}';
    }
}
