package Stack;

public class RemoveToBalance {
    public static int removeExtra(String s){
     int open = 0 ;
     int close = 0 ;
     for(char ch : s.toCharArray()){
        if(ch == '('){
            open++;
        }
        else{
            if(open>0){
                open--;
            }
            else{
                close++;
            }
        }
     }
     return open+close ;
    }

    public static void main(String[] args) {
        String str = "((()(())()";
        int ans = removeExtra(str);
        System.out.println(ans);
    }
}
