import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {  
        Scanner s1 = new Scanner(System.in);
        //syntax  
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(654);
        list.add(43);
        list.add(765);


        // System.out.println(list);
        // System.out.println(list.contains(654));
        // list.remove(2);
        // System.out.println(list);


        //input

        for(int i=0 ; i < 5 ; i++ ){
            list.add(s1.nextInt());
        }
        System.out.println(list);

        // to get the item at any index
        for(int i = 0 ; i<5;i++){
            System.out.println(list.get(i)); // pass index here , list [index] syntax will no work here
             
        }
    }

}
