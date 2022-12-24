package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Human implements Item {

    private int id;
    private String surname;
    private String name;
    private int age;
    private List<Relationship> relationships;

    public Human(List<Item> list, String surname, String name, int age) {
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

    private int setId(List<Item> list) {
        int upperRange = 50;
        Random random = new Random();
        int tempId = random.nextInt(upperRange);
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == tempId){
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

    public String itemToString(){
        String res = "";
        res = "id человека: " + this.id + "\n" + "Фамилия человека: " + this.surname + "\n" + "Имя человека: " + this.name + "\n" +
                "Возраст человека: " + this.age +"\n" + "Связи человека: " + "\n";
        if (this.relationships != null){
            for (Relationship r : this.relationships){
                res = res + "C человеком " + "id которого: " + r.getRelationToHumanId() +
                        " существует связь - " + r.getRelation() + "\n";
            }
        }
        return res;
    }

    public String childrensToString(){
        String res = "";
        if (this.relationships != null){
            for (Relationship r : this.relationships){
                if (r.getRelationId() == 2){
                    res = res + "Id ребенка: " + r.getRelationToHumanId();
                }
            }
        }
        return res;
    }

    public void setRelationship(Relationship relationship) {
        if (this.relationships == null){
            ArrayList<Relationship> temp = new ArrayList<Relationship>();
            temp.add(relationship);
            this.relationships = temp;
        }
        else{
            this.relationships.add(relationship);
        }
    }
}