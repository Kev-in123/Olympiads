import java.util.Scanner;

public class Question1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] numbers = new int[10];
    int sum = 0;
    for(int i = 0; i < 10; i++) {
      System.out.print("Enter a number: ");
      numbers[i] = s.nextInt();
      sum += numbers[i];
    }
    System.out.println("The sum of the 10 numbers is: " + sum);
    for (int i: numbers) {
      System.out.println(i);
    }
    s.close();
  }
}
