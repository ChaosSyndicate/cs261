import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Deck
{
    private static final List<Card> protoDeck = new ArrayList<Card>();
    private LinkedList<Card> DeckCards;

    // initialize prototype deck
    static {
        for (Card.Suit suit : Card.Suit.values())
            for (Card.Rank rank : Card.Rank.values())
                protoDeck.add(new Card(rank, suit));
    }

    public Deck() {
        DeckCards = new LinkedList<Card>(protoDeck);
    }

    public void print(int itemsPerLine) {
        int itemsPrinted = 0;
        for (Card c : DeckCards) {
            if (itemsPrinted < itemsPerLine) {
                System.out.print(c.toString() + c.cardValue());
                itemsPrinted++;
            }
            else {
                itemsPrinted = 0;
                System.out.println();
            }
        }
        System.out.println();
    }


    public void shuffle() {
        Collections.shuffle(DeckCards);
    }

    public Card remove() {
        return DeckCards.remove(0);
    }



}
