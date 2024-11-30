package Collections;
import java.util.Set;
import java.util.HashSet;

public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(33);
        set.add(2);
        set.add(54);
        set.add(32);
        set.add(65);

        System.out.println(set);

        set.remove(54);
        System.out.println(set);

        //first way 
        // System.out.println(set.contains(100));

        // second way 
      boolean  contain = set.contains(100);
        System.out.println(contain);

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();
        System.out.println(set);
    }
}

