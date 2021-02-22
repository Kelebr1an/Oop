import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    while (true) {
      System.out.println("\nПервая точка");
      double[] input = coordinates(); // Массив для хранения координат
      Point3d firstPoint = new Point3d(input[0], input[1], input[2]); // Создаём первую точку

      System.out.println("\nВторая точка");
      input = coordinates();
      Point3d secondPoint = new Point3d(input[0], input[1], input[2]); // Создаём вторую точку

      System.out.println("\nТретья точка");
      input = coordinates();
      Point3d thirdPoint = new Point3d(input[0], input[1], input[2]); // Создаём третью точку

      if (firstPoint.equal(secondPoint) || firstPoint.equal(thirdPoint) || secondPoint
          .equal(thirdPoint)) {
        System.out.println("Введенные точки совпадают. Задайте новые!");
      } else {
        System.out.println("Площадь = " + computeArea(firstPoint, secondPoint, thirdPoint));
      }
    }
  }

  // Метод для заполнения массива double
  private static double[] coordinates() {
    Scanner in = new Scanner(System.in);
    double[] points = null; // Создаём массив

    System.out.println("Введите координаты точки в следующем виде:\nX Y Z");
    String tmp = in.nextLine();
    points = Arrays.stream(tmp.split(" ")).mapToDouble(Double::parseDouble).toArray();

    return points;
  }
  // Метод вычисления площади треугольника
  public static double computeArea(Point3d firstPoint, Point3d secondPoint, Point3d thirdPoint) {
    double sideA = firstPoint.distanceTo(secondPoint).doubleValue();
    double sideB = secondPoint.distanceTo(thirdPoint).doubleValue();
    double sideC = thirdPoint.distanceTo(firstPoint).doubleValue();
    double halfPerimeter = 0.5 * (sideA + sideB + sideC);
    double result = Math.sqrt(
        halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter
            - sideC));
    return BigDecimal.valueOf(result).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
  }
}
