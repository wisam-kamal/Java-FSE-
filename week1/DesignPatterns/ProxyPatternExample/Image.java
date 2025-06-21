public interface Image {
    void display();
}

class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromServer(fileName);
    }

    private void loadFromServer(String fileName) {
        System.out.println("Loading image from remote server: " + fileName);
    }

    public void display() {
        System.out.println("Displaying image: " + fileName);
    }
}

class ProxyImage implements Image {
    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        } else {
            System.out.println("Using cached image: " + fileName);
        }
        realImage.display();
    }
}
