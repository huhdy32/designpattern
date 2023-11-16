import java.awt.*;

public class Main {
    public static void main(String[] args) {
        DecodedImage decodedImage;
        ImageReader reader = null;
        String image = args[0];
        String format = image.substring(image.indexOf('.') + 1, (image.length()));
        if (format.equals("gif")) {
            reader = new GifReader(image);
        }
        if (format.equals("jpeg")) {
            reader = new GifReader(image);
        }
        assert reader != null;
        decodedImage = reader.getDecodeImage();
        System.out.println(decodedImage);
    }
}