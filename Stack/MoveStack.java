package Stack;
// codearrmy 
import java.util.Stack;
import java.util.Scanner;

public class MoveStack {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Integer> st = new Stack<>();
   st.push(3);
   st.push(4);
    st.push(5);
    st.push(6);
    System.out.println(st);

    //rverse order m kisi stack ko dalna h toh 
     Stack<Integer> gt = new Stack<>();
while(st.size()>0){         // jb tkk gt khali ni hota h tb tk gt m push krte rho
   //st.peek();
   gt.push(st.pop());
   // st.pop();
}
Stack<Integer> rt = new Stack<>();
while(gt.size()>0){         // jb tkk gt khali ni hota h tb tk gt m push krte rho
   //st.peek();
   rt.push(gt.pop());
   // st.pop();
}
System.out.println(gt);
}
}
