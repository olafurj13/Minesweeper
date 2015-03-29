import java.awt.*;
import java.awt.image.*;
import java.util.*;
import java.awt.Robot;
import java.awt.event.InputEvent;

/*
Initial setup to get working:
  Change ScreenWidth, ScreenHeight
  Make sure TOT_MINES is correct
Hopefully it works then
*/

public class Main
{

    public static void main(String[] args) {
        Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture, "bmp", new File(args[0]));
    }

}