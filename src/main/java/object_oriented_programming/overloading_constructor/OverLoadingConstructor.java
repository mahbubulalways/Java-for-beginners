package object_oriented_programming.overloading_constructor;

public class OverLoadingConstructor {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.displayInformation();
        Teacher teacher2 = new Teacher("Mahbubul", "Male");
        teacher2.displayInformation();
        Teacher teacher3 = new Teacher("Mahbubul", "Male", "012101", 32);
        teacher3.displayInformation();
    }
}
