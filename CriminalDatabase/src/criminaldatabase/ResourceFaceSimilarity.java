package criminaldatabase;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ResourceFaceSimilarity {

    public int facecheck(String to, String from) {
        int flag = 0;
        BufferedImage imgA = null;
        BufferedImage imgB = null;

        try {
            File fileA = new File(to);
            File fileB = new File(from);

            imgA = ImageIO.read(fileA);
            imgB = ImageIO.read(fileB);
        } catch (IOException e) {
            System.out.println(e);
        }
        int width1 = imgA.getWidth();
        int width2 = imgB.getWidth();
        int height1 = imgA.getHeight();
        int height2 = imgB.getHeight();

        if ((width1 != width2) || (height1 != height2)) {
            System.out.println("Error: Images dimensions"
                    + " mismatch");
            flag = 0;
        } else {
            long difference = 0;
            for (int y = 0; y < height1; y++) {
                for (int x = 0; x < width1; x++) {
                    int rgbA = imgA.getRGB(x, y);
                    int rgbB = imgB.getRGB(x, y);
                    int redA = (rgbA >> 16) & 0xff;
                    int greenA = (rgbA >> 8) & 0xff;
                    int blueA = (rgbA) & 0xff;
                    int redB = (rgbB >> 16) & 0xff;
                    int greenB = (rgbB >> 8) & 0xff;
                    int blueB = (rgbB) & 0xff;
                    difference += Math.abs(redA - redB);
                    difference += Math.abs(greenA - greenB);
                    difference += Math.abs(blueA - blueB);
                }
            }

            // Total number of red pixels = width * height 
            // Total number of blue pixels = width * height 
            // Total number of green pixels = width * height 
            // So total number of pixels = width * height * 3 
            double total_pixels = width1 * height1 * 3;

            // Normalizing the value of different pixels 
            // for accuracy(average pixels per color 
            // component) 
            double avg_different_pixels = difference
                    / total_pixels;

            // There are 255 values of pixels in total 
            double percentage = (avg_different_pixels
                    / 255) * 100;

            System.out.println("Difference Percentage-->"
                    + percentage);
            flag = 1;
        }
        return flag;
    }
}
