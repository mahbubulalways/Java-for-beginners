package object_oriented_programming.problem_solving.problem_two_polymorphism;

public class Triangle extends  Shape {
    double base, height;

    public Triangle(double base, double  height) {
            this.base=base;
            this.height=height;
    }
    
 
    @Override
    public double  area(){
        System.out.print("Triangle Shape: ");
        return  0.5 * base * height;
    }
}
