import java.util.LinkedList;
import java.util.List;

public class Hand
{
    private List<Card> playerHand;

    Hand() {
        playerHand = new LinkedList<Card>();
    }

    Hand(List<Card> PlayerHand) {
        this.playerHand = PlayerHand;
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

    public void remove() {
        playerHand.remove(0);
    }

    public void print(int itemsPerLine) {
        int itemsPrinted = 0;
        for (Card c : playerHand) {
            if (itemsPrinted <= itemsPerLine) {
                System.out.println(c.toString() + "(" + c.cardValue() + ")");
                itemsPrinted++;
            } else {
                System.out.println();
                itemsPrinted = 0;
            }
        }
    }

}
