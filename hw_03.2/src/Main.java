public class Main {
    public static void main(String[] args){
        Collection studentsCollection = new Collection();
        studentsCollection.addStudent("01", "Смирнов", "Дмитрий", "Юриспруденция");
        studentsCollection.addStudent("02", "Панева", "Марина", "Менеджмент");
        studentsCollection.addStudent("03", "Смолева", "Екатерина", "Журналистика");
        studentsCollection.addStudent("04", "Адеев", "Роман", "Экономика");

        for (Students student:studentsCollection){
            System.out.println(student);
        }
    }
}