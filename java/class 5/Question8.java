import java.util.Scanner;

public class Question8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an amount in kilograms: ");
    double weight1kg=input.nextDouble();
    System.out.print("Enter an amount in grams: ");
    double weight1g=input.nextDouble();
    double weight2kg=input.nextDouble();
    System.out.print("Enter an amount in kilograms: ");
    double weight2g=input.nextDouble();
    System.out.print("Enter an amount in grams: ");
    double weightkg = weight1kg + weight2kg;
    double weightg = weight1g + weight2g;
    if (weightg>1000) {
      double extrag = weightg%1000;
      weightkg += extrag;
    }
    System.out.println("The total weight is: " + weightkg + " kg and " + weightg + " g");
    input.close();
  }
}
