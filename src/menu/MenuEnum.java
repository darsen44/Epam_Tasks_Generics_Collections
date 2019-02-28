package menu;

public enum MenuEnum {
    MY_FUNC_INTERFACE(() -> System.out.println("MyFuncInterface")),
    COMMAND(() -> System.out.println("Command")),
    STREAMS(() -> System.out.println("Streams")),
    TEXT_LINES(() -> System.out.println("Text Lines")),
    EXIT(() -> System.exit(0));

    private Command command;

    MenuEnum(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    public static void get(String keyMenu) {
        MenuEnum.values()[Integer.parseInt(keyMenu) - 1].getCommand().execute();
    }
}
