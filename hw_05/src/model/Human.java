package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Human {

    private int id;
    private String surname;
    private String name;
    private int age;
    private List<Relationship> relationships;

    public Human(List<Human> list,String surname, String name, int age) {
        this.id = setId(list);
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    public Human() {
    }

    public int getId() {
        return id;
    }

    private int setId(List<Human> list) {
        int upperRange = 100;
        Random random = new Random();
        int tempId = random.nextInt(upperRange);
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).id == tempId){
                tempId++;
                i = 0;
            }
        }
        return this.id = tempId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Relationship> getRelationships() {
        return relationships;
    }

    public String humanToString(Human human){
        String res = "";
        res = "id человека: " + human.id + "\n" + "Фамилия человека: " + human.surname + "\n" + "Имя человека: " + human.name + "\n" +
                "Возраст человека: " + human.age +"\n" + "Связи человека: " + "\n";
        if (human.relationships != null){
            for (Relationship r : human.relationships){
                res = res + "C человеком " + "id которого: " + r.getRelationToHumanId() +
                        " существует связь - " + r.getRelation() + "\n";
            }
        }
        return res;
    }

    public String childrensToString(Human human){
        String res = "";
        if (human.relationships != null){
            for (Relationship r : human.relationships){
                if (r.getRelationId() == 2){
                    res = res + "Id ребенка: " + r.getRelationToHumanId();
                }
            }
        }
        return res;
    }

    public void setRelationship(Human human,Relationship relationship) {
        if (human.relationships == null){
            ArrayList<Relationship> temp = new ArrayList<Relationship>();
            temp.add(relationship);
            human.relationships = temp;
        }
        else{
            human.relationships.add(relationship);
        }
    }
}