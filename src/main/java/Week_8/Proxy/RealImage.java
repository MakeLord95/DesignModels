package Week_8.Proxy;

class RealImage implements Image {
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.printf("Loading %s from disk\n", filename);
    }

    @Override
    public void showImage() {
        System.out.printf("Displaying %s\n\n", filename);
    }

    @Override
    public void showData() {
        System.out.printf("Filename: %s\n", filename);
    }
}
