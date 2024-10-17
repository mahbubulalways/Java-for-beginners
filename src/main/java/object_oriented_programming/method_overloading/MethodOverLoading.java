package object_oriented_programming.method_overloading;

public class MethodOverLoading {
    // * In same class of java there have same named two or more methods. But parameters list or data types must be different. Its called method overloading or polymorphism. And those method called overloaded method.

    // * Method name and parameter list called together method signature.

    public static void add(double a, double b){ 
        System.out.println("Ans variable 2 double : "+ a+b );
    }
    public static void add(int a, int b){
        System.out.println("Ans variable 2 int : "+ a + b );
    }
    public static void add(int a, int b, double c){
        System.out.println("Ans variable 2 double 1 int : "+ a+ b+c );
    }
    public static void add(int a, int b, int c){
        System.out.println("Ans variable 3 int : "+ a+ b+c );
    }
    public static void add(int a, int b, long c){
        System.out.println("Ans variable 2 int one long : "+ a+ b+c );
    }

    public static void main(String[] args) {
        MethodOverLoading.add(12.7, 6.28); // * Two double parameter
        MethodOverLoading.add(12, 6); // * Two int parameter
        MethodOverLoading.add(12, 6, 7.9); // * Two int and one double parameter
        MethodOverLoading.add(12, 6, 7); // * Three int and parameter
        MethodOverLoading.add(12, 6, 7); // * Two int and one long and parameter
    }
}
