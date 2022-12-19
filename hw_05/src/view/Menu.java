package view;

public class Menu {

    private static UserInputFromConsole scan = new UserInputFromConsole();
    private static String userSelect = "EMPTY";
    private static ToPresenter toPresenter = new ToPresenter();

    public static void Start(){

        while (!userSelect.equals("9")){
            userSelect = "EMPTY";
            userSelect = scan.inputKey(TextsMenu.Menu);
            toPresenter.doSomething(userSelect);
        }
        scan.input.close();
        System.out.println("Всего доброго!");
    }
}