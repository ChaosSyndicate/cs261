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

    public String toString(int itemsPerLine) {
        StringBuilder deckString = new StringBuilder();
        int itemsPrinted = 1;
        for (Card c : DeckCards) {
            deckString.append(c.toString());
            if (DeckCards.indexOf(c) < (DeckCards.size() - 1) ) {
                deckString.append(", ");
            }
            if (itemsPrinted % itemsPerLine == 0) {
                deckString.append("\n");
            }
            itemsPrinted++;
        }
        deckString.append("\n");
        return deckString.toString();
    }

    public void shuffle() {
        Collections.shuffle(DeckCards);
    }

    public Card remove() {
        return DeckCards.remove(0);
    }



}
