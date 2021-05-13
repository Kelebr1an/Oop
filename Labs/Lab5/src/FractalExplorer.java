import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import java.io.File;

public class FractalExplorer extends JFrame {
    private int screenSize; // Размер экрана
    private JImageDisplay image; // Отображение фрактала
    private FractalGenerator generator; // Создание фрактала
    private Rectangle2D.Double range; // Диапозон плоскости

    private FractalGenerator mandelbrot;
    private FractalGenerator tricorn;
    private FractalGenerator burningShip;

    public static void main(String args[]){
        FractalExplorer explorer = new FractalExplorer(800); // Инициализируем объект класса FractalExplorer
        explorer.createAndShowGUI(); // Отображаем интерфейс
        explorer.drawFractal(); // Рисуем фрактал
    }

    public FractalExplorer(int size){
        screenSize = size;
        image = new JImageDisplay(size, size);
        generator = new Mandelbrot();
        mandelbrot = new Mandelbrot();
        tricorn = new Tricorn();
        burningShip = new BurningShip();
        range = new Rectangle2D.Double();
        generator.getInitialRange(range);
    }

    public void createAndShowGUI(){
        image.setLayout(new BorderLayout());
        JFrame jframe = new JFrame("Fractal Explorer");
        // Панели
        JPanel topPanel = new JPanel();
        JPanel bottomPanel = new JPanel();
        // Элементы управления
        JButton resetButton = new JButton("Reset Image");
        JButton saveButton = new JButton("Save Image");
        JComboBox fractalChoice = new JComboBox();
        JLabel labelChoice = new JLabel();
        // Текст для Label
        labelChoice.setText("Fractal:");
        // ComboBox
        fractalChoice.addItem(mandelbrot);
        fractalChoice.addItem(tricorn);
        fractalChoice.addItem(burningShip);
        // Кнопки
        resetButton.setActionCommand("Reset");
        saveButton.setActionCommand("Save");
        // Listener
        ButtonListener listener = new ButtonListener();
        resetButton.addActionListener(listener);
        saveButton.addActionListener(listener);
        MouseEventListener mousebuttonpress = new MouseEventListener();
        image.addMouseListener(mousebuttonpress);
        ComboBoxListener listener2 = new ComboBoxListener();
        fractalChoice.addActionListener(listener2);
        // Добавление элементов в панели
        topPanel.add(labelChoice);
        topPanel.add(fractalChoice);
        bottomPanel.add(saveButton);
        bottomPanel.add(resetButton);
        // Настройка окна приложения
        jframe.add(image, BorderLayout.CENTER);
        jframe.add(topPanel, BorderLayout.NORTH);
        jframe.add(bottomPanel, BorderLayout.SOUTH);
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

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            String actionCommand = e.getActionCommand();
            // Перерисовка фрактала
            if (actionCommand.equals("Reset")) {
                generator.getInitialRange(range);
                drawFractal();
                // Сохранение изображения
            } else if (actionCommand.equals("Save")) {
                JFileChooser fileChooser = new JFileChooser();

                FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG-изображение", "png");
                fileChooser.setFileFilter(filter);
                fileChooser.setAcceptAllFileFilterUsed(false);

                int userChoice = fileChooser.showSaveDialog(image);
                if (userChoice == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try {
                        ImageIO.write(image.image, "png", file);
                    } catch (Exception exception)
                    {
                        JOptionPane.showMessageDialog(image, exception.getMessage(), "Couldn't save the image", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
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

    // Выбор фрактала
    private class ComboBoxListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e){
            JComboBox obj = (JComboBox) e.getSource();
            generator = (FractalGenerator) obj.getSelectedItem();
            generator.getInitialRange(range);
            drawFractal();
        }
    }
}
