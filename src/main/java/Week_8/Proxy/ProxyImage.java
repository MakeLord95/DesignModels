package Week_8.Proxy;

class ProxyImage implements Image {
    private final String filename;
    private RealImage image;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void showImage() {
        if (image == null) {
            image = new RealImage(filename);
        }
        image.showImage();
    }

    @Override
    public void showData() {
        System.out.printf("Filename: %s\n", filename);
    }
}
