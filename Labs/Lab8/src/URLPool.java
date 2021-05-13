import java.util.*;

public class URLPool {
    private HashMap<String, URLDepthPair> visited; // Посещенные адреса
    private LinkedList<URLDepthPair> toVisit; // Необходимые к посещению адреса

    public URLPool() {
        visited = new HashMap<>();
        toVisit = new LinkedList<>();
    }

    // Получение адреса
    public synchronized URLDepthPair getLink(){
        boolean isWaiting = false;
        if (toVisit.size() == 0) {
            try {
                Crawler.threadsWaiting++;
                isWaiting = true;
                this.wait();
            } catch (Exception e) {
                return null;
            }
        }
        if (isWaiting)
            Crawler.threadsWaiting--;
        URLDepthPair urlDepthPair = toVisit.pop();
        visited.put(urlDepthPair.getUrl(), urlDepthPair);
        return urlDepthPair;
    }

    // Добавление адреса
    public synchronized void addLink(URLDepthPair urlDepthPair){
        if (!visited.containsKey(urlDepthPair.getUrl())){
            toVisit.add(urlDepthPair);
            this.notify();
        }
    }
}
