import java.util.Scanner;

public class Take_Input
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // Input Object

        // Initialized 2 String Variables
        String fname, lname; 

        System.out.print("Enter Your Frist Name : ");  // Input 1
        fname = input.next();

        System.out.print("Enter Your Second Name : "); // Input 2
        lname = input.next();

        System.out.println("Your Full Name : " + fname + " " + lname); // Print Frist Name and Last Name 


        // Initialized 2 Integer Variables
        int num1, num2;

        System.out.print("Enter Frist Number : ");
        num1 = input.nextInt();

        System.out.print("Enter Second Number : ");
        num2 = input.nextInt();

        System.out.println();
        System.out.println("Sum of two numbers : " + (num1+num2));
        System.out.println("Sub of two numbers : " + (num1-num2));
        System.out.println("Mul of two numbers : " + (num1*num2));
        System.out.println("Div of two numbers : " + (num1/num2));
    }
}
