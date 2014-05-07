public class Dealer
{
    private Deck cardDeck;

    Dealer() {
        cardDeck = new Deck();
    }

    public Card dealCard() {
        return cardDeck.remove();
    }

    public void deal(Hand[] playerHand, int numPlayer, int numCard) {
        for (int i = 0; i < numCard; i++) {
            for (int j = 0; j < numPlayer; j++) {
                playerHand[j].add(dealCard());
            }
        }
    }

    public void printScores(Hand[] playerHand, int numPlayer, int numCard, int itemsPerLine) {
        for (int j = 0; j < numPlayer; j++) {
            System.out.println("--- Hand " + (j + 1) + " ---");
            System.out.println();
            System.out.print(playerHand[j].toString(itemsPerLine));
            System.out.println("score = " + playerHand[j].score());
            System.out.println();
        }
    }

    public void printDeck(int itemsPerLine) {
        System.out.println("deck:");
        System.out.print(cardDeck.toString(itemsPerLine));
        System.out.println();
    }

    public void play(int numGames, int numPlayer, int numCard, int itemsPerLine, boolean shuffle) {
        for (int i = 0; i < numGames; i++) {
            System.out.println("=== Game " + (i+1) + " ===");
            System.out.println();
            if (shuffle) {
                cardDeck.shuffle();
            }

            Hand playerHand[] = new Hand[numPlayer];

            for (int j = 0; j < numPlayer; j++) {
                playerHand[j] = new Hand();
            }

            deal(playerHand, numPlayer, numCard);
            printScores(playerHand, numPlayer, numCard, itemsPerLine);
        }
        System.out.println("=== Games Complete ===");
        System.out.println();
    }

}
