import java.util.Scanner;

public class If_Else {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int salary;
       System.out.print("Enter Salary : ");
       salary=input.nextInt();


       // If Else Method
       System.out.println("Enter Salary");
       salary=input.nextInt();

       if (salary>70000){
           System.out.println("Above");
       }
       else{
           System.out.println("Below");
       }
    }
}