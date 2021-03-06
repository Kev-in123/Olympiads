public class Homework {
  public static double circle_area(double radius) {
    return radius * radius * Math.PI;
  }

  public static double sphere_volume(double radius) {
    return radius * radius * radius * 4/3 * Math.PI;
  }

  public static void main(String[] args) {
    System.out.println("The area of a circle with a radius of 4.8 is "
    + circle_area(4.8));

    System.out.println("The volume of a sphere with a radius of 3.2 is "
    + sphere_volume(3.2));
  }
}



