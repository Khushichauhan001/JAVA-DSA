package Array2.Hard;


import java.util.*;

public class Pascal {
    public static long nCr(int n, int r) {
        long res = 1;

        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    public static int pascalTriangle(int r, int c) {
        int element = (int) nCr(r - 1, c - 1);
        return element;
    }

    public static void main(String[] args) {
        int r = 5; // row number
        int c = 3; // col number
        int element = pascalTriangle(r, c);
        System.out.println("The element at position (r,c) is: " + element);
    }
}  
        
        



// 3rd variant 

// import java.util.*;

// public class tUf {
//     public static List<Integer> generateRow(int row) {
//         long ans = 1;
//         List<Integer> ansRow = new ArrayList<>();
//         ansRow.add(1); //inserting the 1st element

//         //calculate the rest of the elements:
//         for (int col = 1; col < row; col++) {
//             ans = ans * (row - col);
//             ans = ans / col;
//             ansRow.add((int)ans);
//         }
//         return ansRow;
//     }

//     public static List<List<Integer>> pascalTriangle(int n) {
//         List<List<Integer>> ans = new ArrayList<>();

//         //store the entire pascal's triangle:
//         for (int row = 1; row <= n; row++) {
//             ans.add(generateRow(row));
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         List<List<Integer>> ans = pascalTriangle(n);
//         for (List<Integer> it : ans) {
//             for (int ele : it) {
//                 System.out.print(ele + " ");
//             }
//             System.out.println();
//         }
//     }
// }
