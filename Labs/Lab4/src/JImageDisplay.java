import java.awt.image.BufferedImage;
import java.awt.*;

public class JImageDisplay extends javax.swing.JComponent {
    private BufferedImage image; // Изображение

    public JImageDisplay(int width, int height) {
        image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB); // Инициализируем изображение
        Dimension dimension = new java.awt.Dimension(width, height); // Создаём объект класса Dimension
        setPreferredSize(dimension); // Выводим изображение полностью
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null); // Отрисовываем изображение
    }

    public void clearImage(){
        for (int x = 0; x < image.getWidth(); x++)
            for (int y = 0; y < image.getHeight(); y++)
                image.setRGB(x, y, 0); // Заменяем все пиксели черным
    }

    public void drawPixel(int x, int y, int rgbColor){
        image.setRGB(x, y, rgbColor); // Заменяем пиксель определенным цветом
    }
}
