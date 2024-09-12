
// Class:  A blueprint or template for creating objects. It defines properties (attributes) and behaviors (methods).
// Object: An instance of a class. It represents a real-world entity with its own state (data) and behavior.

// Example: A Simple Car Class

public class Car {
    String color;
    String model;

    public void describeCar() {
        System.out.println("This is a " + color + " " + model);
    }
}


public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "red";
        car1.model = "Corolla";

        Car car2 = new Car();
        car2.color = "blue";
        car2.model = "Camry";

        car1.describeCar();  // This is a red Corolla      
        car2.describeCar();  // This is a blue Camry
    }
}

// Explanation:

// Class Definition:   We define a class named Car with two attributes: color and model. The describeCar() method prints the car's details.
// Object Creation:    We create two objects, car1 and car2, of the Car class.
// Setting Attributes: We assign values to the color and model attributes for each car object.
// Calling Methods:    We call the describeCar() method for both objects to print their details.
