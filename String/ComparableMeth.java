package String;

import java.util.ArrayList;
import java.util.*;

class Animal implements Comparable<Animal>  {
    int age ; 
    String name ;
    int weight ;
    public Animal(int age , String name , int weight){
        this.age = age ;
        this.name = name ;
        this.weight = weight ;
    }
}
public class ComparableMeth {
    public static void main(String[] args) {
        Animal a1 =  new Animal(2, "leo", 3);
        Animal a2 =  new Animal(4, "hina", 3);
        Animal a3 =  new Animal(1, "illlo", 3);
        Animal a4 =  new Animal(7, "kukki", 3);

        List<Animal> l1 = new ArrayList<>();
        l1.add(a1);
        l1.add(a2);
        l1.add(a3);
        l1.add(a4);

        System.out.println(l1);// list aese print nai hogi 


    }
}
