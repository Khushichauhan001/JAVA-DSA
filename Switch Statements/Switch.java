
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        String fruit = s1.next();

            //  String a = "Khushi";
            //  String b = "Khushi";
            //  System.out.println(a == b);  // gives me the true value bcz it only checks the value not refernece


        // long way and not so suitable 


        //    if(fruit.equals("mango")){
        //    System.out.println("King of fruit");
        //    }
        //    if(fruit.equals("orange")){
        //     System.out.println("Round fruit");
        //    }
        //    if(fruit.equals("Grapes")){
        //     System.out.println("Small fruit");
        //    }


        // same thing can be done by switch 
        // switch(fruit) {        // can be done by enhanced switch statements

        //     case "Mango":
        //      System.out.println("KIng of fruit");
        //      break;
        //     case "Apple":
        //     System.out.println("Red colour fruit");
        //     break;
        //     case "Orange":
        //     System.out.println("Round fruit");
        //     break;
        //     case "Grapes":
        //     System.out.println("Small fruit");
        //     break;
        //     default:
        //     System.out.println("no fruit matches");
        // }


        // enhanced switch statement
        switch(fruit){
            case "Mango" -> System.out.println("king of fruits");
            case "Apple" -> System.out.println("red coloured fruit");
            case "grapes" -> System.out.println("small fruit");
            default -> System.out.println("enter a valid fruit");
        }


        // int day = s1.nextInt();
        // switch(Day){   case 1 -> spln("monday")}

        
     }
}


