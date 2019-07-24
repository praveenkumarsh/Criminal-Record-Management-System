/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criminaldatabase;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ResourceGridImage implements Runnable {

    private BufferedImage image;
    private String filename;
    private int rows, columns;
    private BufferedImage[][] smallImages;
    private int smallWidth;
    private int smallHeight;
    private String targetDir;
    private int imageCounter;

    public ResourceGridImage(String filename, int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.filename = filename;
        init();
    }

    private void init() {
        this.image = this.getGridImage();
        this.smallWidth = image.getWidth() / columns;
        this.smallHeight = image.getHeight() / rows;
        this.smallImages = new BufferedImage[columns][rows];
    }

    private BufferedImage getGridImage() {
        try {
            return ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    String name = SplitImageInsert.CrimName;

    public void run() {
        int count = 0;
        count++;
        String dir = "./Images/Criminalimg/" + name;
        this.createSmallImages();
        this.createDirectoryForSaving(dir);
        this.saveSmallImages(dir);
    }

    private void createSmallImages() {
        imageCounter = 0;
        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < columns; x++) {
                smallImages[x][y] = image.getSubimage(x * smallWidth, y * smallHeight, smallWidth, smallHeight);
                imageCounter++;
            }
        }
        System.out.println("Images created: " + imageCounter);
    }

    private void createDirectoryForSaving(String dir) {
        this.targetDir = dir;
        if (!(new File(dir).mkdirs())) {
            System.err.println("Directory could not be created");
        }
    }

    private void saveSmallImages(String dir) {
        imageCounter = 0;

        try {
            ImageIO.write(smallImages[0][0], "png", new File(dir + "/" + name + "_" + "hair" + ".png"));
            System.out.println(name + "_" + "hair" + ".png");

            ImageIO.write(smallImages[0][1], "png", new File(dir + "/" + name + "_" + "forehead" + ".png"));
            ImageIO.write(smallImages[0][2], "png", new File(dir + "/" + name + "_" + "eye" + ".png"));
            ImageIO.write(smallImages[0][3], "png", new File(dir + "/" + name + "_" + "nose" + ".png"));
            ImageIO.write(smallImages[0][4], "png", new File(dir + "/" + name + "_" + "mouth" + ".png"));
            ImageIO.write(smallImages[0][5], "png", new File(dir + "/" + name + "_" + "chin" + ".png"));
            System.out.println(dir + name + "_" + "forehead" + ".png");
            System.out.println(dir + name + "_" + "eye" + ".png");
            System.out.println(dir + name + "_" + "nose" + ".png");
            System.out.println(dir + name + "_" + "mouth" + ".png");
            System.out.println(dir + name + "_" + "chin" + ".png");

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Images saved: " + imageCounter);
    }

    public BufferedImage[][] getSmallImages() {
        return this.smallImages;
    }
}
