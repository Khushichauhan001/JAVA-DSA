package OOPS;

public class classes {
   // creating a new data type  with multiple datatype
    public static class Student {
        String name ;
        int rollno ;
        double percent;
    }
    public static void main(String[] args) {
              Student x  = new Student();    // like int x(abhi bs dabba bnaya h ) 
              x.name = " khushi";
              x.rollno = 95 ;
              x.percent = 87.5 ;
              System.out.println(x.name);

              Student s = new Student();
              s.name = " chauhan";
              s.percent = 45.6;
              s.rollno = 69 ;
    }
}

