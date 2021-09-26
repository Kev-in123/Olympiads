import java.util.Scanner;

public class Question1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] numbers = new int[10];
    int sum = 0;
    for(int i = 0; i < numbers.length; i++) {
      System.out.print("Enter a number: ");
      numbers[i] = input.nextInt();
      sum += numbers[i];
    }
    System.out.println("The sum of the 10 numbers is: " + sum);
    for (int i: numbers) {
      System.out.println(i);
    }
    input.close();

  }
}
