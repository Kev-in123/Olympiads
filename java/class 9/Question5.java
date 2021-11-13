import java.util.Scanner;

public class Question5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] numbers = new int[10];
    for (int i = 0; i < 10; i++) {
      numbers[i] = s.nextInt();
    }
    System.out.println("Reversed numbers are: ");
    for (int i = 9; i >= 0; i--) {
      System.out.println(numbers[i]);
    }
    System.out.println("Odd numbers are: ");
    for (int i: numbers) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }
    System.out.println("Even numbers are: ");
    for (int i: numbers) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
    s.close();
  }
}
