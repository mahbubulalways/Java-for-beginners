package object_oriented_programming.problem_solving.problem_two_polymorphism;

public class Test {
    public static void main(String[] args) {
        Shape s = new  Shape();
        s = new Rectangle(12.5, 20.6);
        System.out.println( s.area());
        s = new Triangle(33.5, 21.3);
        System.out.println( String.format("%.2f", s.area()));

        // * use array
        System.out.println();
        System.out.println("Use Array for same date type");
        Shape[] shape = new Shape[3];
        shape[0]= new Shape();
        shape[1]= new Rectangle(12.5, 20.6);
        shape[2]= new Triangle(33.5, 21.3);

        for(int i = 0; i < shape.length; i++){
            System.out.println(shape[i].area());
        }
       System.out.println();
    }
}
