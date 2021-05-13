import java.awt.geom.Rectangle2D;

public class BurningShip extends FractalGenerator {
    public static final int MAX_ITERATIONS = 2000; // Максимальное количество итераций

    // Устанавливаем область
    public void getInitialRange(Rectangle2D.Double rectangle) {
        rectangle.x = -2;
        rectangle.y = -2.5;
        rectangle.width = 4;
        rectangle.height = 4;
    }

    // Определяем количество итераций
    public int numIterations(double x, double y) {
        int iterations = 0;
        double num = 0;
        double num_imaginary = 0;

        while (iterations < MAX_ITERATIONS && num * num + num_imaginary * num_imaginary < 4) {
            double new_num = num * num - num_imaginary * num_imaginary + x;
            double new_num_imaginary = 2 * Math.abs(num) * Math.abs(num_imaginary) + y;
            num = new_num;
            num_imaginary = new_num_imaginary;
            iterations += 1;
        }

        if (iterations == MAX_ITERATIONS)
            return -1;
        return iterations;
    }

    @Override
    public String toString() {
        return "Burning Ship";
    }
}
