package Recursion;

import java.util.Scanner;

public class ReverseString {
    static String reverse(String s){
        if(s.length() == 0) return "";     // " " -> aese ni krna h 

        String smallAns = reverse(s.substring(1));
        char currChar = s.charAt(0);
        return smallAns+currChar;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        // String s = "level";
        // System.out.println(reverse(s));
      String rev = reverse(s);
      if(rev.equals(s)) {
        System.out.println("Palindrome");
    }
      else {
        System.out.println("Not Palindrome");
      }
    // System.out.println(rev);
    }
}
