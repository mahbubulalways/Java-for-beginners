package object_oriented_programming.method_overrinding;

public class Teacher extends Person {
    String qualification;
    String name;
    

    public Teacher( String name,int age,String qualification ) {
        super(name, age);
        this.qualification = qualification;
    }

    @Override   // * static and final method can not be over ride or modify.
    void displayInfo() {
        // TODO Auto-generated method stub
        super.displayInfo();
        System.out.println(name);
        System.out.println("Qualification: " + qualification);
    }
    
}
