package view;

import Presenter.Presenter;
public class MenuImplement {
    private Presenter presenter = new Presenter();

    public void doSomething(String userSelect){

        Console input = new Console();

        if (userSelect.equals("1")) {
            presenter.consolePrintAllHumans();
        }

        else if (userSelect.equals("2")) {
            String surname = input.inputKey(MenuText.Surname);
            String name = input.inputKey(MenuText.Name);
            int age = Integer.parseInt(input.inputKey(MenuText.Age));
            presenter.addHuman(surname, name, age);
        }

        else if (userSelect.equals("3")) {
            int id = Integer.parseInt(input.inputKey(MenuText.Id));
            presenter.removeHuman(id);
        }

        else if (userSelect.equals("4")) {
            int id = Integer.parseInt(input.inputKey(MenuText.Id));
            presenter.printChildrens(id);
        }

        else if (userSelect.equals("5")) {
            int id = Integer.parseInt(input.inputKey(MenuText.Id));
            int relationId = Integer.parseInt(input.inputKey(MenuText.ReletionId));
            int relationToHumanId = Integer.parseInt(input.inputKey(MenuText.IdTo));
            presenter.addReletionToHuman(id, relationId, relationToHumanId);
        }

        else if (userSelect.equals("6")) {
            int id = Integer.parseInt(input.inputKey(MenuText.Id));
            presenter.addTxt(id);
        }

        else if (userSelect.equals("7")) {
            int id = Integer.parseInt(input.inputKey(MenuText.Id));
            presenter.addDoc(id);
        }

        else if (userSelect.equals("8")) {
            int id = Integer.parseInt(input.inputKey(MenuText.Id));
            presenter.addCsv(id);
        }
    }
}