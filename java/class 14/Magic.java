import java.util.Scanner;

public class Magic{
  public static void main(String[] args){
    Deck d = new Deck();
    for (int i = 0; i < 7; i++){
      d.shuffle();
    }
    Scanner in = new Scanner(System.in);
    int card_num = in.nextInt();
    System.out.println(d.cards.get(card_num).getName());
    Card c = d.cards.get(card_num);
    c.setMarked(true);
    for (int i = 0; i < 7; i++){
      d.shuffle();
    }
    System.out.println("abradacadabra");
    for (int i = 0; i < d.cards.size(); i++){
      if (d.cards.get(i).isMarked()){
        System.out.println(d.cards.get(i).getName());
        c.setMarked(false);
      }
    }
    in.close();
  } 
}



