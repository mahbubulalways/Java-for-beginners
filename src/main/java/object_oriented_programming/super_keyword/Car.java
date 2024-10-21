package object_oriented_programming.super_keyword;

public class Car extends Vehicle {
    int price;
    public Car(String color, double weight, int price) {
        super(color, weight);
        this.price=price;
    }
    
    @SuppressWarnings("override")
    public  void attribute(){
        super.attribute();
        System.out.println("Price: " + price);
    }

    public  void getInformation(){
        super.attribute();
        System.out.println(price);
    }
    
}
