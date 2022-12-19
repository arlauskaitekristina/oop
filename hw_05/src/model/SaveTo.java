package model;

public class SaveTo {

    public String addToTxt(HumanList list, int idForMenu){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == idForMenu){
                SaveToTxt txt = new SaveToTxt();
                txt.saveAs(list.get(i).humanToString(list.get(i)));
                return "Записано в txt файл: " + list.get(i).humanToString(list.get(i)) + "\n";
            }
        }
        return "Совпадений нет" + "\n";
    }

    public String addToCsv(HumanList list, int idForMenu){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == idForMenu){
                SaveToCsv csv = new SaveToCsv();
                csv.saveAs(list.get(i).humanToString(list.get(i)));
                return "Записан в csv файл: " + list.get(i).humanToString(list.get(1)) + "\n";
            }
        }
        return "Совпадений нет" + "\n";
    }

    public String addToDoc(HumanList list,int idForMenu){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == idForMenu){
                SaveToDoc doc = new SaveToDoc();
                doc.saveAs(list.get(i).humanToString(list.get(i)));
                return "Записано в doc файл: " + list.get(i).humanToString(list.get(i)) + "\n";
            }
        }
        return "Совпадений нет" + "\n";
    }
}