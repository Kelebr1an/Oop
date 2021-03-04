import java.math.BigDecimal;

public class Point3d extends Point2d{
  // Координата Z
  private double zCoord;

  // Конструктор инициализации
  public Point3d(double x, double y, double z) {
    xCoord = x;
    yCoord = y;
    zCoord = z;
  }

  // Конструктор по умолчанию
  public Point3d() {
    //Вызовите конструктор с двумя параметрами и определите источник.
    this(0, 0, 0);
  }

  // Возвращение координаты Z
  public double getZ() {
    return zCoord;
  }

  // Установка значения координаты Z
  public void setZ(double val) {
    zCoord = val;
  }

  // Сравнение двух точек
  public boolean equal(Point3d secondPoint){
    boolean x = xCoord == secondPoint.xCoord;
    boolean y = yCoord == secondPoint.yCoord;
    boolean z = zCoord == secondPoint.zCoord;
    return (x && y && z);
  }

  public BigDecimal distanceTo(Point3d point){
    double x = Math.pow(point.xCoord - xCoord, 2);
    double y = Math.pow(point.yCoord - yCoord, 2);
    double z = Math.pow(point.zCoord - zCoord, 2);
    double result = Math.sqrt(x + y + z);
    return  BigDecimal.valueOf(result).setScale(2,BigDecimal.ROUND_HALF_UP);
  }
}
