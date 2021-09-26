import java.util.Scanner;

public class Question3{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    double num1 = input.nextDouble();
    System.out.print("Enter the second number: ");
    double num2 = input.nextDouble();
    input.close();

    if (num2 == 0){
      throw new ArithmeticException("Cannot divide by zero");
    }

    Integer integer_result = (int) (num1/num2);
    System.out.println(num1 + " divided by " + num2 + " is " + (num1 / num2));
    System.out.println(num1 + " goes into " + num2 + integer_result + " times with a remander of " + (num1 % num2));
    
  }
}