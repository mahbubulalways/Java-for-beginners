package object_oriented_programming.super_keyword;

public class Vehicle {
    String color;
    double weight;

    public Vehicle(String color, double weight) {
         this.color= color;
         this.weight= weight;
    }
     public void attribute(){
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
     }
}
