package object_oriented_programming.inheritance;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("Mahbubul", 22);
        p1.displayInfo1();

        Teacher t1 = new  Teacher("Anisul Islam", 32, "M.Sc. in CSE ");
        t1.displayInfo2();
    }
}
