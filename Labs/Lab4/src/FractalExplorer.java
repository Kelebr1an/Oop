import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;

public class FractalExplorer extends JFrame {
    private int screenSize; // Размер экрана
    private JImageDisplay image; // Отображение фрактала
    private FractalGenerator generator; // Создание фрактала
    private Rectangle2D.Double range; // Диапозон плоскости

    public static void main(String args[]){
        FractalExplorer explorer = new FractalExplorer(800); // Инициализируем объект класса FractalExplorer
        explorer.createAndShowGUI(); // Отображаем интерфейс
        explorer.drawFractal(); // Рисуем фрактал
    }

    // Конструктор инициализирующий поля класса
    public FractalExplorer(int size){
        screenSize = size;
        image = new JImageDisplay(size, size);
        generator = new Mandelbrot();
        range = new Rectangle2D.Double();
        generator.getInitialRange(range);
    }

    // Метод инициализирующий пользовательский интерфейс
    public void createAndShowGUI(){
        image.setLayout(new BorderLayout());
        JFrame jframe = new JFrame("Fractal Explorer");
        JButton resetButton = new JButton("Reset image");
        // Listener
        ResetButtonListener listener = new ResetButtonListener();
        resetButton.addActionListener(listener);
        MouseEventListener mousebuttonpress = new MouseEventListener();
        image.addMouseListener(mousebuttonpress);
        // Настройка окна приложения
        jframe.add(image, BorderLayout.CENTER);
        jframe.add(resetButton, BorderLayout.SOUTH);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setBounds(0, 0, 800, 800);
        jframe.pack();
        jframe.setVisible(true);
        jframe.setResizable(false);
    }

    // Отрисовка фрактала
    private void drawFractal() {
        for (int x = 0; x < screenSize; x++)
            for (int y = 0; y < screenSize; y++) {
                double xCoord = generator.getCoord(range.x, range.x + range.width, screenSize, x);
                double yCoord = generator.getCoord(range.y, range.y + range.height, screenSize, y);
                int iterations = generator.numIterations(xCoord, yCoord);
                if (iterations == -1) {
                    image.drawPixel(x, y, 0);
                }
                else {
                    float hue = 0.7f + (float) iterations / 200f;
                    int rgbColor = Color.HSBtoRGB(hue, 1f, 1f);
                    image.drawPixel(x, y, rgbColor);
                }
            }
        image.repaint();
    }

    // Перерисовка фрактала
    private class ResetButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            generator.getInitialRange(range);
            drawFractal();
        }
    }

    // Увеличение изображения
    private class MouseEventListener extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e){
            int x = e.getX();
            int y = e.getY();
            double xCoord = generator.getCoord(range.x, range.x + range.width, screenSize, x);
            double yCoord = generator.getCoord(range.y, range.y + range.height, screenSize, y);
            generator.recenterAndZoomRange(range, xCoord, yCoord, 0.5);
            drawFractal();
        }
    }
}
