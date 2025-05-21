package Recursion;

public class PrintSSQ {
    static void print(String s , String currAns){       

        if(s.length() == 0 ){
            System.out.println(currAns);
            return;    
        }

        char currChar = s.charAt(0);
        String remString = s.substring(1);

        //Curr char -> chooses to be a part of currChar
         String newString = currAns+currChar;
          print(remString, newString);
        

        //Curr char -> choose  not to be a part of currChar
          print(remString, currAns);


    }
    public static void main(String[] args) {
        String s = "abc";
        print(s, "");
    }
}
