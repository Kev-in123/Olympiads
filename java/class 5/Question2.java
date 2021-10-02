import java.util.Scanner;

public class Question2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = input.nextInt();
    System.out.println(age >= 18? "Access granted": "You are too young to go beyond this point" );
    input.close();
  }
}
