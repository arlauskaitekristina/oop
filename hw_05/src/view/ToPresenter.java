package view;

import presenter.Presenter;
public class ToPresenter {
    private Presenter presenter = new Presenter();

    public void doSomething(String userSelect){

        UserInputFromConsole input = new UserInputFromConsole();

        if (userSelect.equals("1")) {
            presenter.consolePrintAllHumans();
        }

        else if (userSelect.equals("2")) {
            String surname = input.inputKey(TextsMenu.Surname);
            String name = input.inputKey(TextsMenu.Name);
            int age = Integer.parseInt(input.inputKey(TextsMenu.Age));
            presenter.addHuman(surname, name, age);
        }

        else if (userSelect.equals("3")) {
            int id = Integer.parseInt(input.inputKey(TextsMenu.Id));
            presenter.removeHuman(id);
        }

        else if (userSelect.equals("4")) {
            int id = Integer.parseInt(input.inputKey(TextsMenu.Id));
            presenter.printChildrens(id);
        }

        else if (userSelect.equals("5")) {
            int id = Integer.parseInt(input.inputKey(TextsMenu.Id));
            int relationId = Integer.parseInt(input.inputKey(TextsMenu.ReletionId));
            int relationToHumanId = Integer.parseInt(input.inputKey(TextsMenu.IdTo));
            presenter.addReletionToHuman(id, relationId, relationToHumanId);
        }

        else if (userSelect.equals("6")) {
            int id = Integer.parseInt(input.inputKey(TextsMenu.Id));
            presenter.addToTxt(id);
        }

        else if (userSelect.equals("7")) {
            int id = Integer.parseInt(input.inputKey(TextsMenu.Id));
            presenter.addToDoc(id);
        }

        else if (userSelect.equals("8")) {
            int id = Integer.parseInt(input.inputKey(TextsMenu.Id));
            presenter.addToCsv(id);
        }
    }
}