package model;

public class Save {

    public String addTxt(HumanList list, int idForMenu){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == idForMenu){
                SaveTxt txt = new SaveTxt();
                txt.saveAs(list.get(i).itemToString());
                return "Записано в txt файл: " + list.get(i).itemToString() + "\n";
            }
        }
        return "Совпадений нет" + "\n";
    }

    public String addCsv(HumanList list, int idForMenu){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == idForMenu){
                SaveCsv csv = new SaveCsv();
                csv.saveAs(list.get(i).itemToString());
                return "Записан в csv файл: " + list.get(i).itemToString() + "\n";
            }
        }
        return "Совпадений нет" + "\n";
    }

    public String addDoc(HumanList list,int idForMenu){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == idForMenu){
                SaveDoc doc = new SaveDoc();
                doc.saveAs(list.get(i).itemToString());
                return "Записано в doc файл: " + list.get(i).itemToString() + "\n";
            }
        }
        return "Совпадений нет" + "\n";
    }
}