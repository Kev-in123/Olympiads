import java.util.LinkedHashSet;
import java.util.Set;

public class Deck {
  public static void main(String[] args) {
    
    Set<String> deck = new LinkedHashSet<String>();

    for (int i = 1; i <= 13; ++i) {
      String card;
      switch (i) {
      case 1:
        card = "A";
        break;
      case 11:
        card = "J";
        break;
      case 12:
        card = "Q";
        break;
      case 13:
        card = "K";
        break;
      default:
        card = String.valueOf(i);
      }

      deck.add("Spade " + card); 
      deck.add("Heart " + card);
      deck.add("Club " + card);
      deck.add("Diamond " + card);
    }
    
    for (int i = 0; i < 7; ++i) {
      shuffle(deck);
    }

    for (String card : deck) {
      System.out.println(card);
    }

	}

  public static void shuffle(Set<String> deck) {
    Set<String> pile1 = new LinkedHashSet<String>();
    Set<String> pile2 = new LinkedHashSet<String>();
    for (String card: deck) {
      if (Math.random() < 0.5) {
        pile1.add(card);
      } else {
        pile2.add(card);
      }
    }

    for (String card: pile1) {
       deck.add(card);
    }

    for (String card: pile2) {
      deck.add(card);
    }
  }
}
