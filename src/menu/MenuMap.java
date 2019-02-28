package menu;

import java.util.LinkedHashMap;
import java.util.Map;

public class MenuMap {
    private Map<String,Command> commandsMenu;

    public MenuMap() {
        commandsMenu = new LinkedHashMap<>();
        commandsMenu.put("1", this::testMyFuncInterface);
        commandsMenu.put("2", this::testCommand);
        commandsMenu.put("3", this::testStreams);
        commandsMenu.put("4", this::testTextLines);
        commandsMenu.put("5", this::exit);
    }

    private void exit() {
        System.exit(0);
    }

    private void testTextLines() {
        System.out.println("Text Lines");
    }

    private void testStreams() {
        System.out.println("Streams");
    }

    private void testCommand() {
        System.out.println("Command");
    }

    private void testMyFuncInterface() {
        System.out.println("FuncInterface");
    }
    public void get(String keyMenu){
        commandsMenu.get(keyMenu).execute();
    }

}
