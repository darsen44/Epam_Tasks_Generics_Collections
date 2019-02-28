package str_into_int;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StrIntoInt {

    public static void main(String[] args) {
        List<Integer> listInt = new LinkedList<>();
        listInt.add(0);
        addToList(listInt);
        System.out.println(listInt.get(2));

    }

    public static void addToList(List list) {
        list.add("0067");
        list.add("bb");
    }

}
