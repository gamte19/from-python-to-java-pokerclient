import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by mbeothy on 2016. 12. 08..
 */
public class PokerClient {
    private List<Integer> clientCards = new ArrayList();

    public PokerClient(String p1, String p2, String p3, String p4, String p5) {
        clientCards.addAll(Arrays.asList(new Card(p1).getValue(), new Card(p2).getValue(), new Card(p3).getValue(),
                new Card(p4).getValue(), new Card(p5).getValue()));
    }

    public boolean highestCardIsMine(String p1, String p2, String p3, String p4, String p5) {
        List<Integer> myCard = new ArrayList();
        myCard.addAll(Arrays.asList(new Card(p1).getValue(), new Card(p2).getValue(), new Card(p3).getValue(),
                new Card(p4).getValue(), new Card(p5).getValue()));
        return Collections.max(clientCards) > Collections.max(myCard);
    }


}