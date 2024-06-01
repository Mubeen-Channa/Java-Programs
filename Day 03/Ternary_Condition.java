import java.util.Scanner;
public class Ternary_Condition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int salary;
       System.out.print("Enter Salary : ");
       salary=input.nextInt();

       // Ternory Method
       System.out.println((salary>70000)?"above":"Below");
    }
}