package object_oriented_programming.problem_solving.problem_one;

public class Box {
     double height;
     double width;
     double depth;
     public Box (double height, double width, double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
     }
      public void displayVol(){
        double result = height*width*depth;
        System.out.println("The ans is: " + result);
     }


    public static void main(String[] args) {
        Box box1 = new Box(10, 10, 10);
        box1.displayVol();
        Box box2 = new Box(20, 20, 20);
        box2.displayVol();
    }


}
