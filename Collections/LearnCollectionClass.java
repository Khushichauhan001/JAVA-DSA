package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {
     public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(32);
        list.add(12);
        list.add(45);
        list.add(78);
        list.add(85);
        System.out.println("min element is " + Collections.min(list));
        System.out.println("max element is " + Collections.max(list));
        System.out.println(Collections.frequency(list, 32));



        // sorting in collections

        Collections.sort(list);
        System.out.println(list);

        // order in sorting 
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);







      
     }
}
