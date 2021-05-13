public class URLDepthPair {
    private String address; // URL
    private int depth; // Глубина

    public int getDepth(){
        return depth;
    }

    public String getUrl(){
        return address;
    }

    public URLDepthPair(String address, int depth){
        this.address = address;
        this.depth = depth;
    }

    @Override
    public String toString(){
        return address + " | depth: " + depth;
    }
}
