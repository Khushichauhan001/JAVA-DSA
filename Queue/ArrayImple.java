package Queue;

public class ArrayImple {
    public static class queueA{
    int f = -1 ;
    int r = -1 ;
    int[] arr = new int[100];
    int size =0;

    public void add(int val){
        if(r == arr.length-1 ){
            System.out.println("queue is full");
            return ;
        }
        if(f== -1) {
            f = r= 0;
            arr[0] = val;
        } 
         else {
            arr[++r] =val;

    }
     size++;
    }

    public int remove(){
    //     int x = arr[f]; 
    //     f++;
    //    return x ;

    // or 
  if(size == 0){
    System.out.println("queue is empty");
    return -1;
  }
    f++;
    size-- ;  // remove krne s phle size ko kam kroge  
    return arr[f-1];
    }


    public int peek(){
        if(size == 0){
            System.out.println("queue is empty");
            return -1;
          }
        return arr[f];
    }

   public boolean isEmpty(){
    if(size == 0) return true;
    else return false ;
   }

   public void display(){
    if(size == 0){
        System.out.println("queue is empty");
    }
    else {
        for(int i=f; i<=r ;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    System.out.println();
    }
   }
    public static void main(String[] args) {
        queueA a1 = new queueA();
        a1.display();   // queue is empty 

        a1.add(1);
        a1.add(2);
        a1.add(4);
        a1.add(5);
        a1.display();   // 1 2 4 5 
        a1.remove();
        a1.display();
        System.out.println(a1.peek());
        System.out.println(a1.size);
        
    }
}