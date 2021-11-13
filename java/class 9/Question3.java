import java.util.Scanner;

public class Question3 {
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    int[] numbers = new int[5];
    for(int i = 0; i < 5; i++) {
      System.out.print("Enter a number: ");
      numbers[i] = s.nextInt();
    }   
    printNums(numbers);
    smallest(numbers);
    s.close();
  }
  public static void printNums(int[] arr) {
    for (int i: arr) {
      System.out.println(i);
    }
  }
  public static void smallest(int[] arr){
    int min = Integer.MAX_VALUE;
    for (int i: arr) {
      min = Math.min(min, i);
    }
    System.out.println("Min: " + min);
  }
}
