package object_oriented_programming.inheritance;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
       this.name = name;
       this.age = age;
    }
    public void displayInfo1 (){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        }
    
}
