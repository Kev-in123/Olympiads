import java.util.Scanner;

public class Question3 {
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
    int[] numbers = new int[5];
    for(int i = 0; i < numbers.length; i++) {
      System.out.print("Enter a number: ");
      numbers[i] = input.nextInt();
    }   
    printNums(numbers);
    smallest(numbers);
    input.close();

  }
  public static void printNums(int[] arr) {
    for (int i: arr){
      System.out.println(i);
    }
  }
  public static void smallest(int[] arr) {
    int min = Integer.MAX_VALUE;
    for (int i: arr) {
      if (i < min) {
        min = i;
      } 
    }
    System.out.println("Min: " + min);
  }
 
}
