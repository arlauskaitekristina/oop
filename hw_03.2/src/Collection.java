import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection implements Iterable<Students> {
    private List<Students> studentsList;
    public Collection() {
        studentsList = new ArrayList<>();
    }

    public void addStudent(String id, String surname, String name, String direction){
        Students student = new Students(id, surname, name, direction);
        studentsList.add(student);
    }

    public List<Students> getTeachersList() {
        return studentsList;
    }

    public Iterator<Students> iterator(){
        return new CollectionIterator();
    }

    class CollectionIterator implements Iterator <Students>{
        int index = 0;

        public boolean hasNext(){
            return index < studentsList.size();
        }

        public Students next(){
            return studentsList.get(index++);
        }
    }
}