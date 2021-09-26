import java.util.Scanner;

public class Question2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] numbers = new int[10];
    for(int i = 0; i < numbers.length; i++) {
      System.out.print("Enter a number: ");
      numbers[i] = input.nextInt();
    }
    printNums(numbers);
    int sum = sumArray(numbers);
    System.out.println("The sum of the 10 numbers is: " + sum);
    input.close();
  }
  public static int sumArray(int[] arr) {
    int sum = 0;
    for(int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }
  public static void printNums(int[] arr) {
    for (int i: arr) {
      System.out.println(i);
    }
  }
}
