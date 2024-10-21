package object_oriented_programming.final_variable;

/**
 * University
 */
public class University {

    final  String UNIVERSITY_NAME="DIU"; // * final variable
    final int fees;    // * blank final variable
   static final int students;    // * static blank final variable

    public University(int fees) {
        this.fees = fees;
       
    }
     
    static {
        students=20;
    }
   
   
     void displayInfo(){
        System.out.println("University Name: " + UNIVERSITY_NAME );
        System.out.println("University Fee: " + fees );
        System.out.println("University Students: " + students );
    }

    // 

   final  void displayInfo2(){
        System.out.println("University Name: " + UNIVERSITY_NAME );
        System.out.println("University Fee: " + fees );
        System.out.println("University Students: " + students );
    }
}