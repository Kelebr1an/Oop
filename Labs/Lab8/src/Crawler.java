public class Crawler {

    private String URL; // URL
    private static int maxDepth; // Максимальная глубина
    public static int threadsWaiting = 0; // Ожидающий потоков
    public static int URLCount = 0; // Количество URL
    private static final String protocol = "https:"; // Протокол

    public static void main(String args[]){
        Crawler crawler = new Crawler("https://www.google.com/", 2);
        crawler.run();
        Runtime.getRuntime().addShutdownHook(new Thread(()->printURLCount()));
    }

    // Конструктор с ициниализацией полей класса
    public Crawler(String address, int maxDepth){
        this.URL = address;
        this.maxDepth = maxDepth;
    }

    public void run(){
        CrawlerTask task = new CrawlerTask(new URLDepthPair(URL, 0));
        task.start();
    }

    public static int getMaxDepth(){
        return maxDepth;
    }

    private static void printURLCount(){
        System.out.println("Final URL count: " + URLCount);
    }
}
