import java.util.Scanner;

public class Question4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of hours worked: ");
    double hours = input.nextDouble();
    System.out.print("Enter the cost of parts: ");
    double parts = input.nextDouble();
    double total = hours * 100 + parts;
    if (total < 150) {
        System.out.println("The total is $150");
      } else {
          System.out.println("The total cost is: " + total);
      }
    input.close();
  }
}
