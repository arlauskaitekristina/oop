public class Main {
    public static void main(String[] args) {
        FamilyTree <Human> familyTreeSmirnov = new FamilyTree<>();

        Human human1 = new Human("Дмитрий Смирнов", TypeGender.Male);
        Human human2 = new Human("Ирина Смирнова", TypeGender.Female);
        Human human3 = new Human("Арина Смирнова", TypeGender.Female);

        familyTreeSmirnov.add(human1);
        familyTreeSmirnov.add(human2);
        familyTreeSmirnov.add(human3);

        human1.addCommunication(human3, TypeCommunication.Daughter);
        human2.addCommunication(human3, TypeCommunication.Daughter);

        human1.showCommunication(TypeCommunication.Daughter);
        familyTreeSmirnov.find(human1);
        familyTreeSmirnov.find(human2);

        System.out.println(familyTreeSmirnov);
    }
}