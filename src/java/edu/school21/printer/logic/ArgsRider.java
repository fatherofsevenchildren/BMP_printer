package src.java.edu.school21.printer.logic;

import com.beust.jcommander.Parameter;

import java.util.List;

public class ArgsRider {

    @Parameter(names = {"--white="}, description = "lol bro just text color")
    private String white;

    @Parameter(names = {"--black="}, description = "lol bro just text color")
    private String black;

    @Parameter(description = "Main parameters")
    private List<String> mainParams;

    public String getWhite() {
        return white;
    }

    public String getBlack() {
        return black;
    }

}