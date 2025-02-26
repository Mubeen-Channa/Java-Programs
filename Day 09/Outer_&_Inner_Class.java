// Outer class
class Outer {
    int a = 7;

    Inner1 innerObj1 = new Inner1();
    Inner2 innerObj2 = new Inner2();

    void displayInnerValues() {
        System.out.println(innerObj1.b);
        System.out.println(innerObj2.b);
    }

    // Inner NOn-Static Nested Class
    class Inner1 {
        int b = 10;     // This varibale is not accesseble out of this class

        void showValues() {
            System.out.println("Outer class variable: " + a);   // Outer Class Varibale
            System.out.println("Inner class variable: " + b);
        }
    }

    // Static Nested Class
    static class Inner2 {
        static int a = 10;
        int b = 20;

        static void displayStatic() {
            System.out.println("Static Class Static Method: " + a);
        }
    }

    // Static block to print message at the beginning
    static {
        System.out.println("Hello");
    }
}

// Main class
public class InnerClassesDemo {
    public static void main(String[] args) {
        System.out.println();

        Outer outerObj = new Outer();
        outerObj.displayInnerValues();

        // Creating object of non-static inner class
        Outer.Inner1 innerObj1 = outerObj.new Inner1();
        innerObj1.showValues();

        // Calling static method of static inner class
        Outer.Inner2.displayStatic();
    }
}
