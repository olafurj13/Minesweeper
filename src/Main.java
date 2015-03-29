import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.awt.image.BufferedImage;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main
{
    static int ScreenWidth = 1366;
    static int ScreenHeight = 768;

    public static void main(String[] args) throws Exception{
        Main img = new Main();
        img.screenShotImage();
    }

    static BufferedImage screenShotImage() {
        try {
            Robot robot = new Robot();
            Rectangle captureSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            ScreenWidth = captureSize.width;
            ScreenHeight = captureSize.height;
            BufferedImage bufferedImage = robot.createScreenCapture(captureSize);
            ImageIO.write(bufferedImage, "JPG", new File("C:/Users/OlafurHelgi/Desktop/Mitt Stuff/Vorönn 2015/Gervigreind/FinalProject/Minesweeper/1.jpg"));
            return bufferedImage;
        } catch(Exception e) { e.printStackTrace(); }
        return null;
    }
}