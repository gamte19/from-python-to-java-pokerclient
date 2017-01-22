import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mbeothy on 2016. 12. 08..
 */
public class PokerClient {
    private List<Card> myCards = new ArrayList();

    public PokerClient(String card1, String card2, String card3, String card4, String card5) {
        this.myCards.addAll(Arrays.asList(new Card(card1), new Card(card2), new Card(card3),
                new Card(card4), new Card(card5)));
    }

    public boolean highestCardIsMine(String card1, String card2, String card3, String card4, String card5) {
        List<Card> clientCards = new ArrayList();
        int myCardValue = 0;
        int clientCardValue = 0;
        clientCards.addAll(Arrays.asList(new Card(card1), new Card(card2), new Card(card3),
                new Card(card4), new Card(card5)));


        for (Card myCard : myCards) {
            myCardValue += myCard.getValue();
        }

        for (Card clientCard : clientCards){
            clientCardValue += clientCard.getValue();
        }

        return clientCardValue >= myCardValue;
    }

}