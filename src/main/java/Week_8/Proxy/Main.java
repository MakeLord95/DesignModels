package Week_8.Proxy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");

        System.out.println("First time opening images");
        image1.showImage();
        image2.showImage();

        System.out.println("Second time opening images");
        image1.showImage();
        image2.showImage();

        List<Image> photoAlbum = new ArrayList<>();
        photoAlbum.add(new ProxyImage("Photo 1"));
        photoAlbum.add(new ProxyImage("Photo 2"));
        photoAlbum.add(new ProxyImage("Photo 3"));

        System.out.println("First time opening images in photo album");
        for (Image image : photoAlbum) {
            image.showImage();
        }

        System.out.println("Second time opening images in photo album");
        for (Image image : photoAlbum) {
            image.showImage();
        }
    }
}
