public class Question4 {
  public static void main(String[] args) { 
    int[] numbers = new int[5];
    for(int i = 0; i < numbers.length; i++){
      System.out.print("Enter a number: ");
      numbers[i] = Integer.parseInt(System.console().readLine());
    }   
    smallest(numbers);
  }
  public static void smallest(int[] arr){
    int min = Integer.MAX_VALUE;
    for (int i: arr) {
      min = Math.min(min, i);
    }
    System.out.println("Min: " + min);
  }
}
