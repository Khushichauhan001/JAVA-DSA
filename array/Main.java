
public class Main {
    public static void main(String[] args) {
        // Q : store roll number
        int a = 19;
        System.out.println(a);

        // syntax 
        // data_type[] variable_name = new datatype[size];


        // store five roll no:
        int[] rollno = new int[5];    // left side : refernce variable and right side : object
        // or directly 
        // int[] rollno2 = {23,12,34,56,78};

        int[] rolln; // declarartion of array. ros is getting defined in the stack
        rolln = new int[5];  // actually here object is being created in the memory(heap)
        System.out.println(rollno[1]);  // by default 0


        String[] arr = new String[3];
        System.out.println(arr[0]);    // be default null

    } 
}