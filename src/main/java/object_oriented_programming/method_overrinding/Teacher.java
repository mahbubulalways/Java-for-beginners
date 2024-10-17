package object_oriented_programming.method_overrinding;

public class Teacher extends Person {
    String qualification;

    public Teacher( String name,int age,String qualification ) {
        super(name, age);
        this.qualification = qualification;
    }

    @Override
    void displayInfo() {
        // TODO Auto-generated method stub
        super.displayInfo();
        System.out.println("Qualification: " + qualification);
    }
    
}
