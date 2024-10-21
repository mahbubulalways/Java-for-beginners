package object_oriented_programming.polymorphism;

public class Teacher extends Person {
      String qualification;

    public Teacher(String name,int age, String qualification) {
        super(name, age);
        this.qualification=qualification;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(qualification);
    }

    
      
}
