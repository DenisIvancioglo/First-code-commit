package com.class16;

public class Car {
	String make, model, color;
    int door, wheels;
    
    public static void main(String[] args) {
        
        //ClassName variable = new ClassName();
        Car car1 = new Car();
        //1st object
        car1.make = "Honda";
        car1.model = "Civic";
        car1.color = "Black";
        car1.door = 4;
        car1.wheels = 4;
        System.out.println("Car "+ car1.make+" has "+car1.wheels+" wheels");
        //define behavior
        car1.drive();
        car1.reverse();
        car1.stop();
        
        
        //2nd object
        Car car2 = new Car();
        car2.make="Tesla";
        car2.model="X";
        car2.color="Blue";
        car2.door=4;
        car2.wheels=4;
        		
        
        
    }
void drive() {
	System.out.println("Car can drive");
}

void reverse() {
	System.out.println("Car can reverse");
}
void stop() {
	System.out.println("Car can stop");
}


}
