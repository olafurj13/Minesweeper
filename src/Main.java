import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.awt.image.BufferedImage;

import java.text.SimpleDateFormat;
import java.util.*;

/*
Initial setup to get working:
  Change ScreenWidth, ScreenHeight
  Make sure TOT_MINES is correct
Hopefully it works then
*/

public class Main
{
    static int ScreenWidth = 1366;
    static int ScreenHeight = 768;
    static SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd hh mm ss a");

    public static void main(String[] args) throws Exception{
        Main img = new Main();
        img.screenShotImage();
    }

    static BufferedImage screenShotImage() throws Exception{
        try {
            Calendar now = Calendar.getInstance();
            Robot robot = new Robot();
            Rectangle captureSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            ScreenWidth = captureSize.width;
            ScreenHeight = captureSize.height;
            BufferedImage bufferedImage = robot.createScreenCapture(captureSize);
            ImageIO.write(bufferedImage, "JPG", new File("C:/Users/OlafurHelgi/Desktop/Mitt Stuff/Vorönn 2015/Gervigreind/FinalProject/Minesweeper/1.jpg"));
            return bufferedImage;
        }
        catch(Exception e) { e.printStackTrace(); }
        return null;
    }
}