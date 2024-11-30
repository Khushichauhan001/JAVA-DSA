import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();


    // to add elemenets
    animals.push("Lion");
    animals.push("DOg");
    animals.push("Horse");
    animals.push("Cat");
    System.out.println("Stack: " + animals);


    // to see the top element
   System.out.println(animals.peek());

   animals.pop();
   System.out.println("Stack:" +animals);

    }
}
