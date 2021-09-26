import java.util.Scanner;

public class Question5{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    if(number < 0){
      System.out.println("The number is negative.");
    } else if(number > 0){
      System.out.println("The number is positive.");
    }
    input.close();
  }
}