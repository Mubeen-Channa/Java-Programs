class StaticExample {
    // Static and instance variables
    static int num_1 = 10; // Static variable
    int num_2 = 20;        // Instance variable

    // Static method
    static void showName() {
        System.out.println("Mubeen Channa");
    }

    // Non-static method
    void display() {
        showName(); // Accessing static method
        num_2++;     // Modifying instance variable
    }

    // Another static method
    static void exampleStaticMethod() {
        showName(); // Accessing static method
    }

    // Method with final parameters
    void finalParametersExample(final int n1, final int n2) {
        // n1++;          // Error: cannot modify final parameter
        // n2 = n2 + 10;  // Error: cannot modify final parameter
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        System.out.println();

        // Accessing static variables and methods without creating an object
        System.out.println(StaticExample.num_1);
        StaticExample.showName();

        // Demonstrating final variable
        final int n1 = 100;
        // n1 = 300; // Error: cannot modify final variable
    }
}
