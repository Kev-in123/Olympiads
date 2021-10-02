import java.util.Scanner;

public class Question3 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num1 = s.nextInt();
    for(int i = 1; i <= 10; i++){
      System.out.println(i + " x " + num1 + " = " + i * num1);
    }
    s.close();
  }
}
