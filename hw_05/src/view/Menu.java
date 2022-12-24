package view;

public class Menu {

    private static Console scan = new Console();
    private static String userSelect = "EMPTY";
    private static MenuImplement menuI = new MenuImplement();

    public static void Start(){

        while (!userSelect.equals("9")){
            userSelect = "EMPTY";
            userSelect = scan.inputKey(MenuText.Menu);
            menuI.doSomething(userSelect);
        }
        scan.input.close();
        System.out.println("Всего доброго!");
    }
}