package wrapper_class_in_java;

public class WrapperClassDemo {
    public static void main(String[] args) {
        // * Auto boxing => convert primitive to object 
        int x =30;
        System.out.println("Primitive: " + x);
        Integer y = Integer.valueOf(x);
        System.out.println("Object: " + y);
        Integer z = x; //* compiler automatic convert it Integer.valueOf() this format
        System.out.println("Object: " + z);

        // * Unboxing => convert object to primitive

        Double a = new Double(121.24);
        System.out.println(a); 
        double b = a; //* compiler automatic convert it doubleValue(); this format
        System.out.println(b);

     }
}
