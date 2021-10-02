import java.util.Scanner;

public class Question5{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a 3 digit number: ");
    int num = input.nextInt();
    input.close();
    int sum = 0;
    while(num > 0){
      sum += num % 10;
      num /= 10;
    }
    System.out.println("The sum of the digits is: " + sum);
  }
}
