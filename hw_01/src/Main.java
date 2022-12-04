public class Main {
    public static void main(String[] args) {

        //interfaceFamilyTree familyTreePetrov = new FamilyTree();
        FamilyTree familyTreeSmirnov = new FamilyTree();

        Human human1 = new Human("Дмитрий Смирнов", TypeGender.Male);
        Human human2 = new Human("Ирина Смирнова", TypeGender.Female);
        Human human3 = new Human("Арина Смирнова", TypeGender.Female);

        familyTreeSmirnov.addHuman(human1);
        familyTreeSmirnov.addHuman(human2);
        familyTreeSmirnov.addHuman(human3);

        human1.addCommunication(human3, TypeCommunication.Daughter);
        human2.addCommunication(human3, TypeCommunication.Daughter);

        human1.showCommunication(TypeCommunication.Daughter);
        familyTreeSmirnov.findHuman(human1);
        familyTreeSmirnov.findHuman(human2);

        System.out.println(familyTreeSmirnov);
    }
}