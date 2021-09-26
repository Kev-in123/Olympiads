import java.util.Scanner;

public class Question8 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int[] numbers = new int[5];
    for(int i = 0; i < numbers.length; i++){
      numbers[i] = input.nextInt();
    }

    int min = numbers[0];
    int max = numbers[0];
    for(int i = 1; i < numbers.length; i++){
      if(numbers[i] < min){
        min = numbers[i];
      }
      if(numbers[i] > min){
        max = numbers[i];
      }
    }
    System.out.println("The smallest number is " + min);
    System.out.println("The largest number is " + max);
    input.close();
  }
}


