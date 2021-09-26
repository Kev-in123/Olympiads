import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Question7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number;
    List<Integer> numbers = new ArrayList<Integer>();
    while (true) {
      number = input.nextInt();
      if (number == -1){
        break;
      }
      numbers.add(number);
    }
    Integer[] newNumbers = new Integer[numbers.size()];
    numbers.toArray(newNumbers);
    printNums(newNumbers);
    System.out.println("Total numbers entered: " + newNumbers.length);
    printSmallestLargest(newNumbers);
    input.close();

  }
  public static void printSmallestLargest(Integer[] arr){
    int max = Integer.MAX_VALUE;
    int min = Integer.MIN_VALUE;
    for (int i: arr){
      if (i < min){
        min = i;
      } 
      if (i > max) {
        max = i;
      } 
    }
    System.out.println("Min: " + min);
    System.out.println("Max: " + max);
  }
  public static void printNums(Integer[] arr) {
    for (int i: arr){
      System.out.println(i);
    }
  }
}
