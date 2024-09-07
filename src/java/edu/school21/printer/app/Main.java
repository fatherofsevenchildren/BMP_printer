package src.java.edu.school21.printer.app;

import com.beust.jcommander.JCommander;
import src.java.edu.school21.printer.logic.ArgsRider;
import src.java.edu.school21.printer.logic.Converter;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        ArgsRider args1 = new ArgsRider();
        JCommander.newBuilder()
                .addObject(args1)
                .build()
                .parse(args);
         Converter itc = new Converter(args1.getBlack(), args1.getWhite());
         try {
             itc.print();
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
    }
}