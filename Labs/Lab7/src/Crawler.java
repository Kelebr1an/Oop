import java.util.*;
import java.net.*;

public class Crawler {

    private int maxDepth; // Максимальная глубина
    private LinkedList<URLDepthPair> toVisit; // Список из URL
    private HashMap<String, URLDepthPair> visited; // Посещенные адреса
    private static final String protocol = "https:"; // Протокол

    public static void main(String args[]){
        Crawler crawler = new Crawler("https://www.google.ru/", 3);
        crawler.run();
    }

    // Конструктор с ициниализацией полей класса
    public Crawler(String address, int maxDepth){
        visited = new HashMap<>();
        toVisit = new LinkedList<>();
        toVisit.add(new URLDepthPair(address, 0));
        this.maxDepth = maxDepth;
    }

    // Выводим все возможные для посещения сайты
    public void run(){
        while (toVisit.size() > 0) {
            URLDepthPair currentAddress = toVisit.pop();
            if (visited.containsKey(currentAddress.getUrl())) continue;
            visited.put(currentAddress.getUrl(), currentAddress);
            System.out.println(currentAddress);
            if (currentAddress.getDepth() < maxDepth)
                search(currentAddress);
        }
    }

    // Заполняем список необходимых для посещения сайтов
    private void search(URLDepthPair currentAddress){
        try {
            URL url = new URL(currentAddress.getUrl());
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            Scanner scanner = new Scanner(connection.getInputStream());

            while (scanner.findWithinHorizon("<a\\s+(?:[^>]*?\\s+)?href=([\"'])(.*?)\\1", 0) != null){
                String newURL = scanner.match().group(2);
                newURLPair(newURL, currentAddress);
            }
        } catch (Exception e) {
            System.err.println("Exception: " + e.getLocalizedMessage());
        }
    }

    // Добавляем найденную пару URL и глубины
    private void newURLPair(String newURL, URLDepthPair currentAddress){
        if (newURL.startsWith("//"))
            newURL = protocol + newURL;
        else if (!newURL.startsWith(protocol)) return;
        URLDepthPair newPair = new URLDepthPair(newURL, currentAddress.getDepth() + 1);
        toVisit.add(newPair);
    }
}
