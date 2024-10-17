package object_oriented_programming.method_overrinding;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("Mahbubul", 22);
        p.displayInfo();
        System.out.println("\n\n");
        Teacher t = new Teacher("Anisul Islam", 32, "B.Sc in CSE");
        t.displayInfo();
    }
}
