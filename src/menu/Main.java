package menu;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private Map<String,String> menu;
    private static Scanner input = new Scanner(System.in);

    public Main() {
        menu = new LinkedHashMap<>();
        menu.put("1","1 - Test MyFuncInterface");
        menu.put("2","2 - Test Command");
        menu.put("3","3 - Test Streams");
        menu.put("4","4 - Test text lines");
        menu.put("5","5 - exit");
    }

    private void outputMenu(){
        System.out.println("\tMenu");
        for (String str: menu.values()) {
            System.out.println(str);
        }
    }

    private String select(){
        String keyMenu;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Please select menu.");
            keyMenu = scanner.nextLine().toUpperCase();
            if(menu.containsKey(keyMenu)){
                return keyMenu;
            }
        }

    }
    public static void main(String[] args) {
        Main main = new Main();
        MenuMap mapM = new MenuMap();
        main.outputMenu();
//        while (true) mapM.get(main.select());
        while (true)MenuEnum.get(main.select());

    }
}
