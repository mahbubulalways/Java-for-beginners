package object_oriented_programming.polymorphism;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("Sabbir");  // * Compile time polymorphism method overloading

        p.displayInfo(); // * run time polymorphism method overriding

        p = new  Person("Sabbir", 22);    // * Compile time polymorphism method overloading

        System.out.println();

        p.displayInfo(); // * run time polymorphism method overriding

        Teacher t = new Teacher("Anisul", 32, "MSC");  // * Compile time polymorphism method overloading

        t.displayInfo();   // * run time polymorphism method overriding

        // * dynamic method dispatch/ run time polymorphism method overriding

        p = new Teacher("Anis", 34, "BSC");  // * super class variable refer sub class object. This is called dynamic method dispatch

        p.displayInfo();  // * run time polymorphism method overriding

    }
}
