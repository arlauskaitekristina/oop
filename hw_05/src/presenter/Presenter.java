package Presenter;

import model.HumanList;
import model.Conclusion;
import model.Save;
import view.PrintView;

public class Presenter {

    private HumanList list= new HumanList();
    private Save s = new Save();
    private Conclusion conclusion = new Conclusion();
    private PrintView print = new PrintView();

    public void consolePrintAllHumans(){
        print.print(conclusion.conclusionListToString(list));}

    public void addHuman(String surname, String name, Integer age){
        print.print(conclusion.conclusionString(list.addHuman(surname, name, age)));}

    public void removeHuman(int id){
        print.print(conclusion.conclusionString(list.removeItem(id)));}

    public void printChildrens(int id){
        print.print(conclusion.conclusionString(list.printChildrens(id)));}

    public void addReletionToHuman(int id, int relationId, int reletionToHumanId){
        print.print(conclusion.conclusionString(list.addReletionToHuman(id, relationId, reletionToHumanId)));}

    public void addCsv(int id){
        print.print(conclusion.conclusionString(s.addCsv(list,id)));}
    public void addTxt(int id){
        print.print(conclusion.conclusionString(s.addTxt(list,id)));}

    public void addDoc(int id){
        print.print(conclusion.conclusionString(s.addDoc(list,id)));}
}