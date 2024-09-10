import java.util.*;

class Box {
    int height;
    int width;
    int depth;

    // Default Constructor
    Box() {
        height = 0;
        width  = 0;
        depth  = 0;
    }

    // First Way
    Box(int h, int w, int d) {
        height = h;
        width  = w;
        depth  = d;
    }

    // Method to calculate volume
    int calculateVolume() {
        return height * width * depth;
    }

    // Second Way
//    box(int height, int width, int depth)
//    {
          // If we dont give this keyword than it give 0 value because of same name of instance variable and local variable of constructer
//        this.height = height;
//        this.width = width;
//        this.depth = depth;
//    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Using parameterized constructor
        Box box1 = new Box(5, 10, 15);

        System.out.println("Height: " + box1.height);
        System.out.println("Width:  " + box1.width);
        System.out.println("Depth:  " + box1.depth);
        System.out.println("Volume: " + box1.calculateVolume());

        // Using default constructor
        Box box2 = new Box();
        System.out.println("\nDefault Box Volume: " + box2.calculateVolume());
    }
}
