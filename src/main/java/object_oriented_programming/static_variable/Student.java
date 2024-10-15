package object_oriented_programming.static_variable;

public class Student {
   static int count = 0;  // * without static keyword count value store separately for each object
    String name;
    int roll;
    static String universityName = "DIU";
    public Student(String name, int roll){
        this.name=name;
        this.roll=roll;
        count++;
    }

    public  void getTotalStudents(){
        System.out.println("Total students under this class: " + count);
    }
}
