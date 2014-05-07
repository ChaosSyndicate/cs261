import java.util.LinkedList;
import java.util.List;

public class Hand
{
    private List<Card> playerHand;

    Hand() {
        playerHand = new LinkedList<Card>();
    }

    public int score() {
        int score = 0;
        for (Card c : playerHand) {
            score += c.rank().getValue() * c.suit().getValue();
        }
        return score;
    }

    public void add(Card newCard) {
        playerHand.add(newCard);
    }

    public String toString(int itemsPerLine) {
        StringBuilder handString = new StringBuilder();
        int itemsPrinted = 1;
        for (Card c : playerHand) {
            handString.append(c.toString());
            if ((playerHand.indexOf(c) < playerHand.size() - 1)) {
                handString.append(", ");
            }
            if (itemsPrinted % itemsPerLine == 0) {
                handString.append("\n");
            }
            itemsPrinted++;
        }
        handString.append("\n");
        return handString.toString();
    }

}
