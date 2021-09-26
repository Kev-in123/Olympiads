import java.util.Scanner;

public class Question4{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("How many toonies do you have? ");
    Integer toonies_amount = input.nextInt();
    System.out.print("How many loonies do you have? ");
    Integer loonies_amount = input.nextInt();
    System.out.print("How many quaters do you have? ");
    Integer quarters_amount = input.nextInt();
    System.out.print("How many dimes do you have? ");
    Integer dimes_amount = input.nextInt();
    System.out.print("How many nickles do you have? ");
    Integer nickles_amount = input.nextInt();
    input.close();

    Integer toonies = 2 * toonies_amount;
    Integer loonies = 1 * loonies_amount;
    double quarters = 0.25 * quarters_amount;
    double dimes = 0.1 * dimes_amount;
    double nickles = 0.05 * nickles_amount;
    
    double total_cents = quarters + dimes + nickles;
    Integer total_dollars = toonies + loonies;
    double total = total_cents + total_dollars;
    

    System.out.println("The total value of your coins comes out to: $" + String.format("%.2f", total));


  }

}