import java.util.Scanner;
public class Ternary_Condition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int salary;
       System.out.print("Enter Salary : ");
       salary=input.nextInt();

       // Ternory Method
       System.out.println((salary>70000)?"above":"Below");

       // If Else Method
//        System.out.println("Enter Salary");
//        salary=input.nextInt();
//
//        if (salary>70000)
//        {
//            System.out.println("Above");
//        }
//        else
//        {
//            System.out.println("Below");
//        }
    }
}