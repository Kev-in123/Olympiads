import java.lang.Math;

public class Question3{
  public static void main(String[] args){
    System.out.println(Math.tan(Math.PI/4)); //Java: 0.9999999999999999
    System.out.println(Math.tan(Math.PI/2)); //Java: 1.633123935319537E16
    System.out.println(Math.tan(Math.PI));  //Java: -1.2246467991473532E-16
    //Java outputs these values because Math.PI is not an exact value
  }
}