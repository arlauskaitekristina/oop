import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Integer[] myArr = {6582, 98, 17, 13, 54, 29, 741 };
        System.out.println("Заданый массив: " + Arrays.toString(myArr));
        Arrays.sort(myArr,new NewComparator());

        for(Integer arr : myArr); {
            System.out.print("Отсортированный: " + Arrays.toString(myArr));
        }
    }
}