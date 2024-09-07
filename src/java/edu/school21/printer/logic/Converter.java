package src.java.edu.school21.printer.logic;

import com.diogonunes.jcdp.color.ColoredPrinter;
import com.diogonunes.jcdp.color.api.Ansi;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Converter {
    String filePath = "";
    String charBlack = "";
    String charWhite = "";

    public Converter(String Black, String White) {
        this.filePath = "./src/resources/it.bmp";
        this.charBlack = Black;
        this.charWhite = White;
    }

    public void print () throws IOException {
        File file = new File(filePath);
        BufferedImage image = ImageIO.read(file);
        System.out.println();
        ColoredPrinter printer = new ColoredPrinter();
        for ( int j = 0; j < image.getHeight(); j++) {
            for( int i = 0; i < image.getWidth(); i++) {
                Color color = new Color(image.getRGB(i,j));
                if (color.equals(Color.BLACK)) {
                    printer.print("   ", Ansi.Attribute.NONE,
                            Ansi.FColor.NONE,
                            Ansi.BColor.valueOf(charBlack));
                } else {
                    printer.print("   ", Ansi.Attribute.NONE,
                            Ansi.FColor.NONE,
                            Ansi.BColor.valueOf(charWhite));
                }
            }
            System.out.println();
        }
    }
}
