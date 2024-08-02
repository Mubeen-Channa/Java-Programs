import java.util.Scanner; // Library for Input 


// Class definition for Box
class Box {
    // Instance Variables
    double width;
    double height;

    // Method to calculate and display the area of the box
    void calculateArea() {
        System.out.println("Area of the box is: " + (height * width));
    }
}

public class Class_And_Object {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  // Scanner object for input

        // Creating two Box objects
        Box box1 = new Box();
        Box box2 = new Box();

        // Assigning values to the first box's variables
        box1.height = 10;
        box1.width = 20;

        // Assigning values to the second box's variables
        box2.height = 100;
        box2.width = 200;

        // Displaying the dimensions of the first box
        System.out.println("Height of Box 1 is: " + box1.height);
        System.out.println("Width of Box 1 is: " + box1.width);

        System.out.println();

        // Displaying the dimensions of the second box
        System.out.println("Height of Box 2 is: " + box2.height);
        System.out.println("Width of Box 2 is: " + box2.width);

        // Calculating and displaying the area of the first box
        box1.calculateArea();
        
        // Calculating and displaying the area of the second box (if needed)
        box2.calculateArea();


        in.close();  // Closing the scanner object
    }
}