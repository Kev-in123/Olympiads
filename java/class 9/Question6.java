import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Question6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int oddCount = 0;
    int sumEven = 0;
    int number;
    List<Integer> numbers = new ArrayList<Integer>();
    while (true) {
      number = input.nextInt();
      if (number == -1){
        break;
      }
      numbers.add(number);
    }
    System.out.print("The number of the odd numbers are: ");
    for (int i=0; i < numbers.size(); ++i){
      if (numbers.get(i) % 2 != 0) {
        oddCount += 1;
      }
    }
    System.out.println(oddCount);
    System.out.print("The sum of the even numbers are: ");
    for (int i=0; i < numbers.size(); ++i){
      if (numbers.get(i) % 2 != 0) {
        sumEven += i;
      }
    }
    System.out.println(sumEven);
    input.close();
  }
}
