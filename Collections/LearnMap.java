package Collections;
import java.util.HashMap;
import java.util.Map;



// isme keys unique hi honi chahie
// brna values override hojyngi 

public class LearnMap {
    public static void main(String[] args) {
        Map<String , Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);


        // numbers.put("Two", 34);  // this will override ur value of two 
        // that's why 

        // numbers.putIfAbsent("Two", 34);     

        System.out.println(numbers);


        for(Map.Entry<String, Integer> e: numbers.entrySet()) {
            System.out.println(e);

            // if want ki sirf key ko iterate krna h 
            System.out.println(e.getKey());
            System.out.println(e.getValue());

            
        }

        
    }
}
