import java.util.Scanner;

public class CircleFormulas {
  public static void main(String[] args) {
    double a = perimeter();
    double b = Area();
    System.out.println("Perimeter of Cicle is: " + a + " cm");
    System.out.println("Area of Cicle is: " + b + " cm.sq");
  }

  static double perimeter() {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter radius for calculating Perimeter = ");
      double r = sc.nextInt();
      double pie = 3.14;
      double peri = 2 * pie * r;
      return peri;
    }
  }

  static double Area() {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter radius for calculating Area = ");
      double r = sc.nextInt();
      double pie = 3.14;
      double area = pie * (r * r);
      return area;
    }
  }
}
