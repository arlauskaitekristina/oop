package model;

import java.util.ArrayList;
import java.util.List;

public class HumanList {
    private List<Item> list;

    public HumanList() {
        this.list = new ArrayList<Item>();
        Human dmitriy = new Human();
        dmitriy.setId(01);
        dmitriy.setSurname("Смирнов");
        dmitriy.setName("Дмитрий");
        dmitriy.setAge(40);
        list.add(dmitriy);
        System.out.println(dmitriy.getRelationships());

        Human irina = new Human();
        irina.setId(02);
        irina.setSurname("Смирнова");
        irina.setName("Ирина");
        irina.setAge(45);
        list.add(irina );
        System.out.println(irina.getRelationships());

        Human arina = new Human();
        arina.setId(03);
        arina.setSurname("Смирнова");
        arina.setName("Арина");
        arina.setAge(10);
        list.add(arina);
        System.out.println(arina.getRelationships());

        Relationship dmitriyirina = new Relationship(1, 01);
        dmitriy.setRelationship(dmitriyirina);

        Relationship irinadmitry = new Relationship(1, 02);
        irina.setRelationship(irinadmitry);

        Relationship dmitriyarina = new Relationship(2, 03);
        dmitriy.setRelationship(dmitriyarina);

        Relationship irinaarina = new Relationship(2, 03);
        irina.setRelationship(irinaarina);

        Relationship arinairina = new Relationship(4, 02);
        arina.setRelationship(arinairina);

        Relationship arinadmitry = new Relationship(4, 01);
        arina.setRelationship(arinadmitry);
    }

    public Item get(int index) {
        return this.list.get(index);
    }

    public int size() {
        return this.list.size();
    }

    public String itemListToString(){
        String result = "";
        for (int i = 0; i < this.list.size(); i++){
            result = result + list.get(i).itemToString() + "\n";
        }
        return result;
    }

    public String addHuman(String surname, String name, int age) {
        Item itemToAdd = new Human(list, surname, name, age);
        this.list.add(itemToAdd);
        return "Добавлен: " + itemToAdd.itemToString() + "\n";
    }

    public String removeItem(int idForMenu) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == idForMenu) {
                Item removedHuman = list.get(i);
                list.remove(i);
                return "Удален: " + removedHuman.itemToString() + "\n";
            }
        }
        return "Совпадений нет" + "\n";
    }

    public String printChildrens(int idForMenu) {
        for (Item item : list) {
            if (item.getId() == idForMenu) {
                return "Дети: " + item.childrensToString();
            }
        }
        return "Совпадений нет" + "\n";
    }

    public String addReletionToHuman(int idForMenu, int reletionId, int reletionToHumanId) {
        for (Item item : list) {
            if (item.getId() == idForMenu) {
                Relationship relationship = new Relationship(reletionId, reletionToHumanId);
                item.setRelationship(relationship);
                return "Связь добавлена" + "\n";
            }
        }
        return "Совпадений нет" + "\n";
    }



}