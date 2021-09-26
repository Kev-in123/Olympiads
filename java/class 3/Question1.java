import java.util.Scanner;
import java.lang.Math;

public class Question1{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    double base = input.nextDouble();
    System.out.print("Enter another number: ");
    double exponent = input.nextDouble();
    input.close();
    System.out.println(base + " to the power of " + exponent + " is " + Math.pow(base,exponent));
    

  }
}