import java.util.Scanner;

public class Question7 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    System.out.print(number % 2 == 0 ? "even": "odd" );
    input.close();
  }
}
