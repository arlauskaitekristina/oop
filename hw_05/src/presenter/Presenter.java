package presenter;

import model.HumanList;
import model.Output;
import model.SaveTo;
import view.PrintView;

public class Presenter {

    private HumanList list = new HumanList();
    private SaveTo s = new SaveTo();
    private Output output = new Output();

    public void consolePrintAllHumans(){
        PrintView.print(output.outputListToString(list));
    }

    public void addHuman(String surname, String name, Integer age){
        PrintView.print(output.outputString(list.addHuman(surname, name, age)));}

    public void removeHuman(int id){
        PrintView.print(output.outputString(list.removeHuman(id)));
    }

    public void printChildrens(int id){
        PrintView.print(output.outputString(list.printChildrens(id)));
    }

    public void addReletionToHuman(int id, int relationId, int reletionToHumanId){
        PrintView.print(output.outputString(list.addReletionToHuman(id, relationId, reletionToHumanId)));
    }

    public void addToTxt(int id){
        PrintView.print(output.outputString(s.addToTxt(list,id)));
    }

    public void addToDoc(int id){
        PrintView.print(output.outputString(s.addToDoc(list,id)));
    }

    public void addToCsv(int id){
        PrintView.print(output.outputString(s.addToCsv(list,id)));
    }

}