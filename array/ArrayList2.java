import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //INITIALIZATION
        for(int i = 0 ; i< 3 ; i++){
            list.add(new ArrayList<>());
        }

        //add elements
        for(int i =  0; i< 3 ; i++) {
           for(int j  = 0 ; j<3 ; j++){
            list.get(i).add(s1.nextInt());
           }
        }
        System.out.println(list);
    }
}
