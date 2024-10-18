// Java program that uses recursion to calculate the sum of the first 10 natural numbers

public class Sum_Of_Numbers {

    // Recursive method to calculate the sum
    public static int sum(int n) {
        // Base case
        if (n <= 0) {
            return 0;
        }
        // Recursive case
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int number = 10; // Sum of the first 10 natural numbers
        int result = sum(number);
        System.out.println("Sum of the first " + number + " natural numbers is: " + result);
    }
}
