import java.util.*;
import java.net.*;

public class CrawlerTask extends Thread {
    private URLPool urlPool;
    private final String protocol = "https:";

    public CrawlerTask(URLDepthPair urlDepthPair){
        urlPool = new URLPool();
        urlPool.addLink(urlDepthPair);
    }

    // Выводим все возможные для посещения сайты
    @Override
    public void run(){
        URLDepthPair urlDepthPair = urlPool.getLink();
        System.out.println(urlDepthPair);
        Crawler.URLCount++;
        if (urlDepthPair.getDepth() >= Crawler.getMaxDepth())
            return;
        search(urlDepthPair);
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
                URLDepthPair newAddress = newURLPair(newURL, currentAddress);
                if (newAddress == null)
                    continue;
                newThread(newAddress);
            }
        } catch (Exception e) {
            System.err.println("Exception: " + e.getLocalizedMessage());
        }
    }

    // Добавляем найденную пару URL и глубины
    private URLDepthPair newURLPair(String newURL, URLDepthPair currentAddress){
        if (newURL.startsWith("//"))
            newURL = protocol + newURL;
        else if (!newURL.startsWith(protocol)) return null;
        URLDepthPair new_pair = new URLDepthPair(newURL, currentAddress.getDepth() + 1);
        return new_pair;
    }

    private void newThread(URLDepthPair urlDepthPair){
        CrawlerTask task = new CrawlerTask(urlDepthPair);
        task.start();
    }
}
