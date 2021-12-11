import java.util.*;

public class Deck {

	List<Card> cards = new ArrayList<Card>(52);
	
	public Deck() {
		for (String s: Card.SUITS) {
			for (String r: Card.RANKS) {
				cards.add(new Card(s, r));
			}
		}
	}
	
	public void shuffle() {
		List<Card> pile1 = new ArrayList<Card>(52);
		List<Card> pile2 = new ArrayList<Card>(52);
		
		for (Card c: cards) {
			if (Math.random() < 0.5) {
				pile1.add(c);
			} else {
				pile2.add(c);
			}
		}
		
		this.cards.clear();
		this.cards.addAll(pile1);
		this.cards.addAll(pile2);
	}
	
	public void print() {
		for (Card c: cards) {
			System.out.println(c.getName());
		}
	}
}

