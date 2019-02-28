package stringCompare;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Countries {
    private final TwoString[] countryCapital = {
            new TwoString("Ukraine", "Kyiv"),
            new TwoString("Georgia", "Tbilisi"),
            new TwoString("Poland", "Warsaw"),
            new TwoString("England", "London"),
            new TwoString("Czech Republic","Prague"),
            new TwoString("U.S.A.", "Washington"),
            new TwoString("Brazil", "Brazilia"),
            new TwoString("Ireland", "Dublin"),
            new TwoString("N. Ireland", "Belfast"),

    };
    private int next = 0;

    public TwoString next(){
        return countryCapital[(next++)%countryCapital.length];
    }
}