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
    public void play(int NumGames, int playersNum, int cardNum, int itemsPerLine, boolean shuffle) {
        for (int i = 0; i < NumGames; i ++) {
            if (shuffle) {
                cardDeck.shuffle();
            }

            Hand playerHand[] = new Hand[playersNum];
            for (int j = 0; j < playersNum; j++) {
                playerHand[j] = new Hand();
            }

            //Deal Cards for each player
            for (int j = 0; j < cardNum; j++) {
                for (int k = 0; k < playersNum; k++) {
                    playerHand[j].add(dealCard());
                }
            }

            for (int j = 0; j < )




        }
        System.out.println("=== Games Complete ===");

    }

}
