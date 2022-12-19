package model;

import java.util.ArrayList;
import java.util.List;

public class HumanList {
    private List<Human> list;

    public HumanList() {
        this.list = new ArrayList<Human>();
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
        dmitriy.setRelationship(dmitriy, dmitriyirina);

        Relationship irinadmitry = new Relationship(1, 02);
        irina.setRelationship(irina, irinadmitry);

        Relationship dmitriyarina = new Relationship(2, 03);
        dmitriy.setRelationship(dmitriy, dmitriyarina);

        Relationship irinaarina = new Relationship(2, 03);
        irina.setRelationship(irina, irinaarina);

        Relationship arinairina = new Relationship(4, 02);
        arina.setRelationship(arina, arinairina);

        Relationship arinadmitry = new Relationship(4, 01);
        arina.setRelationship(arina, arinadmitry );
    }

    public Human get(int index) {
        return this.list.get(index);
    }

    public int size() {
        return this.list.size();
    }

    public String humanListToString() {
        String result = "";
        for (int i = 0; i < this.list.size(); i++) {
            result = result + list.get(i).humanToString(list.get(i)) + "\n";
        }
        return result;
    }

    public String addHuman(String surname, String name, int age) {
        Human humanToAdd = new Human(list, surname, name, age);
        this.list.add(humanToAdd);
        return "Добавлен: " + humanToAdd.humanToString(humanToAdd) + "\n";
    }

    public String removeHuman(int idForMenu) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == idForMenu) {
                Human removedHuman = list.get(i);
                list.remove(i);
                return "Удален: " + removedHuman.humanToString(removedHuman) + "\n";
            }
        }
        return "Совпадений нет" + "\n";
    }

    public String printChildrens(int idForMenu) {
        for (Human human : list) {
            if (human.getId() == idForMenu) {
                return "Дети: " + human.childrensToString(human);
            }
        }
        return "Совпадений нет" + "\n";
    }

    public String addReletionToHuman(int idForMenu, int reletionId, int reletionToHumanId) {
        for (Human human : list) {
            if (human.getId() == idForMenu) {
                Relationship relationship = new Relationship(reletionId, reletionToHumanId);
                human.setRelationship(human, relationship);
                return "Связь добавлена" + "\n";
            }
        }
        return "Совпадений нет" + "\n";
    }
}