package object_oriented_programming.final_variable;

/**
 * Student
 */
public class Student extends  University {   // * final class cannot be inherit

    String studentName ;
    

    public Student() {
        super(200000);
    }


    // @Override   // * final method cannot be override
    // void displayInfo2() {  
    //     super.displayInfo();
    // }
}