package object_oriented_programming.polymorphism;

public class Person {
    String name;
    int age;
    public Person( String name,int age) {
            this.name=name;
            this.age=age;
    }
    public Person( String name) {
            this.name=name;
    }

    public void displayInfo(){
        System.out.println(name);
        System.out.println(age);
    }
    
}
