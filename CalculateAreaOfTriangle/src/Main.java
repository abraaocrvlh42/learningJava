import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    // Declaring the Triangle variable
    Triangle x, y;
    x = new Triangle();
    y = new Triangle();

    // Declaring the Triangle variable X\
    System.out.println("Enter the measures of triangle X: ");
    x.a = sc.nextDouble();
    x.b = sc.nextDouble();
    x.c = sc.nextDouble();

    // Declaring the Triangle variable Y
    System.out.println("Enter the measure of triangle Y: ");
    y.a = sc.nextDouble();
    y.b = sc.nextDouble();
    y.c = sc.nextDouble();

    // Calculation of area X
    double areaX = x.area();

    // Calculation of area Y
    double areaY = y.area();

    // Printing AreaX and AreaY values
    System.out.printf("Triangle X area: %.4f%n", areaX);
    System.out.printf("Triangle Y area: %.4f%n", areaY);

    if(areaX > areaY) {
      System.out.println("Large area X: ");
    }
    else {
      System.out.println("Large area Y: ");
    }

    sc.close();
  }
}