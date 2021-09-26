import java.util.Scanner;

public class Question2{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an amount in kilograms: ");
    double kilograms = input.nextDouble();
    input.close();
    double pounds = kilograms*2.20462;
    System.out.println("The equivalent amount in pounds is " + pounds + "lb");
    
  }
}