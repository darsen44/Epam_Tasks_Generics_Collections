package stringCompare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    void demo(int size){
        Countries Countries1 = new Countries();
        Countries Countries2= new Countries();

        TwoString[] TwoStrings1 = new TwoString[size];
        List<TwoString> TwoStrings2 = new ArrayList<>(size);
        for(int i = 0; i < size; i++){
            TwoStrings1[i] = Countries1.next();
            TwoStrings2.add(Countries2.next());
        }
        Arrays.sort(TwoStrings1);
        System.out.println("Array CompareTo " +Arrays.toString(TwoStrings1));
        TwoStrings2.sort(TwoString::compareTo);
        System.out.println("ArrayList CompareTo " + TwoStrings2);
        Arrays.sort(TwoStrings1,new CompareSecondString());
        System.out.println("Array Comparator " + Arrays.toString(TwoStrings1));
        TwoStrings2.sort(new CompareSecondString());
        System.out.println("ArrayList Comparator " + TwoStrings2);
        System.out.println("Array Search " + Arrays.binarySearch(TwoStrings1, 0,TwoStrings1.length,
                new TwoString("Ukraine","Kyiv"),new CompareSecondString() ));
        System.out.println("ArraysList Search " + Collections.binarySearch(TwoStrings2, new TwoString("Ukraine","Kyiv"),
                new CompareSecondString()));
    }
    public static void main(String[] args) {
        new App().demo(7);
    }
}
