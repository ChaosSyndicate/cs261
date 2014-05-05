public class Dealer
{
    private Deck cardDeck;

    Dealer() {
        Deck cardDeck = new Deck();
    }

    public Card dealCard() {
        return cardDeck.remove();
    }

    public void shuffleDeck() {
    }

    public void printDeck(int itemsPerLine) {
        cardDeck.print(itemsPerLine);
    }

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

            for (int j = 0; j < playersNum; j++) {
                System.out.println("--- Hand" + (j+1) + "---" );
                for (int k = 0; k < cardNum; k++) {
                    playerHand[j].print(itemsPerLine);
                    System.out.println(playerHand[j].score());
                }
            }


        }
        System.out.println("=== Games Complete ===");

    }

}
