public class Question3 {
  public static void main(String[] args) { 
    int[] numbers = new int[5];
    for(int i = 0; i < 5; i++) {
      System.out.print("Enter a number: ");
      numbers[i] = Integer.parseInt(System.console().readLine());
    }   
    printNums(numbers);
    smallest(numbers);
  }
  public static void printNums(int[] arr) {
    for (int i: arr) {
      System.out.println(i);
    }
  }
  public static void smallest(int[] arr){
    int min = Integer.MAX_VALUE;
    for (int i: arr) {
      min = Math.min(min, i);
    }
    System.out.println("Min: " + min);
  }
}
