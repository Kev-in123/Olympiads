import java.util.Scanner;

public class Question7 {
  public static void main(String[] args){

    int oddNumbers = 0;
    int oddCount = 0;
    int input;
    Scanner s = new Scanner(System.in);
    for(int i = 1; i <= 6; i++){
      input = s.nextInt();
      if (input % 2 == 1) {
        oddNumbers+=input;
        oddCount++;
      }
    }
    System.out.println("The average of the odd numbers is " + oddNumbers/oddCount);
    s.close();
  }
}

