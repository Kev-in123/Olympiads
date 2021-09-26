import java.util.Scanner;

public class Question3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double firstNumber = input.nextDouble();
    System.out.println("Enter the first number: ");
    double secondNumber = input.nextDouble();
    System.out.println("Enter the second number: ");
    if (secondNumber != 0) {
      System.out.println("The quotient of the two numbers is: " + firstNumber / secondNumber);      
    } else { 
      System.out.println("The second number cannot be zero.");
    }
    input.close();

  }
}
