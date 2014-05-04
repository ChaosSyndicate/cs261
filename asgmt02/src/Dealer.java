public class Dealer
{
    private Deck CardDeck;

    Dealer() {
        Deck CardDeck = new Deck();
    }

    public int sumOfHand() {
        int sum = 0;
        return sum;
    }

    public Card dealCard() {
        return CardDeck.remove();
    }

    public void shuffleDeck() {
    }

    public void Play(int playersNum, int cardNum, int printLines, boolean shuffle) {
        if (shuffle) {
            CardDeck.Shuffle();
        }

        Hand playerHand[] = new Hand[playersNum];


    }
}
