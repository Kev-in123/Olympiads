import java.util.Scanner;

public class Question2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] numbers = new int[10];
    for (int i = 0; i < 10; i++) {
      System.out.print("Enter a number: ");
      numbers[i] = s.nextInt();
    }
    printNums(numbers);
    System.out.println("The sum of the 10 numbers is: " + sumArray(numbers));
    s.close();
  }
  public static int sumArray(int[] arr) {
    int sum = 0;
    for(int i: arr) {
      sum += i;
    }
    return sum;
  }
  public static void printNums(int[] arr) {
    for (int i: arr) {
      System.out.println(i);
    }
  }
}
