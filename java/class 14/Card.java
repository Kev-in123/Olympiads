
public class Card {

	final static String SPADE = "Spade";
	final static String HEART = "Heart";
	final static String CLUB = "Club";
	final static String DIAMOND = "Diamond";

	final static String[] SUITS = { SPADE, HEART, CLUB, DIAMOND };
	final static String[] RANKS = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

	String suit;
	String rank;
	boolean marked = false;
	
	public Card(String suit, String rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public String getRank() {
		return this.rank;
	}
	
	public String getSuit() {
		return this.suit;
	}

	public String getName() {
		return this.suit + " " + this.rank;
	}
	
	public boolean isMarked() {
		return this.marked;
	}
	
	public void setMarked(boolean marked) {
		this.marked = marked;
	}
}
