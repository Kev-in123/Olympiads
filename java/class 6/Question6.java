import java.util.Scanner;

public class Question6 {
  public static void main(String[] args){
    int positiveNumbers = 0;
    int negativeNumbers = 0;
    int input;
    Scanner s = new Scanner(System.in);
    for(int i = 1; i <= 6; i++){
      input = s.nextInt();
      if (input>0) {
        positiveNumbers++;
      } else if (input<0){
        negativeNumbers+=input;
      }
    }
    System.out.println("The number of positive numbers is " + positiveNumbers + " and the sum of the negative numbers is " + negativeNumbers);
    
    s.close();
  }
}

