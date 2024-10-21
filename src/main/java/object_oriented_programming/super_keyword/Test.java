package object_oriented_programming.super_keyword;

public class Test {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("RED", 290.80);
        v1.attribute();
        System.out.println();
        Car c1 = new Car("Red",898.9, 2200000);
        c1.attribute();
    }
}
