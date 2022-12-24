package model;

public class Conclusion implements IConclusion{

    @Override
    public String conclusionString(String str){
        return str + "\n";
    }

    @Override
    public String conclusionListToString(HumanList list) {
        String result = "";
        result = list.itemListToString();
        return result;
    }
}