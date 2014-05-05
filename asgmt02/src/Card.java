public class Card
{
	public enum Rank
	{
		ACE(11), KING(10), QUEEN(10), JACK(10), TEN(10), NINE(9), EIGHT(8),
		SEVEN(7), SIX(6), FIVE(5), FOUR(4), THREE(3), DEUCE(2);

        private final int value;

        Rank(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
	}
	
	public enum Suit
	{
	    HEARTS(4), DIAMONDS(3), CLUBS(2), SPADES(1);
        private final int value;

        Suit(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

	}
	
	private final Rank	rank;
	private final Suit	suit;
	
	Card(Rank rank, Suit suit)
	{
	    this.rank = rank;
	    this.suit = suit;
	}

	public Rank rank()          { return rank; }
	public Suit suit()          { return suit; }
	public String toString()    { return rank + " of " + suit; }
    public int cardValue()      { return rank.getValue() * suit.getValue(); }
}
