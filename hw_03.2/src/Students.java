public class Students {
    private String id;
    private String name;
    private String surname;
    private String direction;
    public Students(String id, String surname, String name, String direction){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "id:" + id + ", surname:" + surname + ", name:" + name + ", direction:" + direction;
    }
}