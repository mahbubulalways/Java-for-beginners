package object_oriented_programming.problem_solving.problem_two_polymorphism;

public class Rectangle extends Shape {
    double length, width;
     

    public Rectangle(double length, double  width) {
        this.length=length;
        this.width=width;
    }
     
    @Override
     public double area(){
        System.out.print("Rectangle Shape: ");
        return length*width;
     }
}
