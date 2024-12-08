import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        
    //  ArrayList<String> studentsName = new ArrayList<>();  // it creates an empty arraylist
    //  studentsName.add("Khushiii"); // it allocates the memory as its own 
    
    
    List<Integer> list = new ArrayList<>(); 
    
    list.add(1);
    list.add(2);
    list.add(3);
    System.out.println(list);

    list.add(4);
    System.out.println(list);

    list.add(1,50);    // add 50 at 1st position
    System.out.println(list);

    List<Integer> newList = new ArrayList<>();
    newList.add(149);
    newList.add(160);

    list.addAll(newList); // this will add all the elements to current list
    System.out.println(list);

    //TO GET ELEMENT
    System.out.println(list.get(1));

    // TO REMOVE  ELEMENT
    list.remove(1);
    System.out.println(list);

    // to remove the particular value from any index(overloading of remove)
    list.remove(Integer.valueOf(3));
    System.out.println(list);

    // to update the value of any element
    list.set(2,30);
    System.out.println(list);

    System.out.println(list.contains(30));


    //to remove alll the elements
    // list.clear();
    // System.out.println(list);

    // to traverse all the elements of list 
     // by using for loop
    for(int i=0;i< list.size();i++){
        System.out.println("the elements is " + list.get(i));
    }

    // by using for each loop
    for(Integer element: list){   // for every element in list 
        System.out.println("foreach elements is " +element);

    }

    //iterator 
    Iterator<Integer> it = list.iterator();

    // its func
    while(it.hasNext()){
        System.out.println("iterator "+ it.next());
    }
    }
}


// complexity big-oh(n)