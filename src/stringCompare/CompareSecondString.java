package stringCompare;

import java.util.Comparator;

public class CompareSecondString implements Comparator<TwoString> {
    @Override
    public int compare(TwoString twoString, TwoString t1) {
        return twoString.getS2().compareTo(t1.getS2());
    }
}
