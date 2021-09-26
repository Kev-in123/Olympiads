import java.util.Scanner;

public class Question6{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your first mark: ");
    int mark1 = input.nextInt();
    System.out.print("Enter your second mark: ");
    int mark2 = input.nextInt();
    System.out.print("Enter your third mark: ");
    int mark3 = input.nextInt();
    int grade = (mark1+mark2+mark3)/3;

    if (0 > grade || grade > 100) {
      System.out.println("Invalid");
    } else {
        if (50 <= grade && grade <= 100){
          System.out.println("pass");
        } else{
          System.out.println("fail");
        } 
      }
    input.close();
  }
}
