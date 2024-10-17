package object_oriented_programming.inheritance;

public class Teacher extends  Person {
     String qualification;

    public Teacher(String name, int age, String qualification) {
        super(name, age);
        this.qualification= qualification;
    }
     
     public  void  displayInfo2(){
        displayInfo1();
        System.out.println("Qualification: " + qualification);
     }



}
