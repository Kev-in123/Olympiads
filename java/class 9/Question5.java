public class Question5 {
  public static void main(String[] args) {
    int[] numbers = new int[10];
    for (int i = 0; i < 10; i++) {
      numbers[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.println("Reversed numbers are: ");
    for (int i = 9; i >= 0; i--) {
      System.out.println(numbers[i]);
    }
    System.out.println("Odd numbers are: ");
    for (int i: numbers) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }
    System.out.println("Even numbers are: ");
    for (int i: numbers) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
  }
}
