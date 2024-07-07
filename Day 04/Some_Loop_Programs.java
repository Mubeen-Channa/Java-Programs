import java.util.Scanner;

public class Some_Loop_Programs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int a = 1, b;

       // 1. Input 1 Program Terminate with break       
       while (a < 2) {
           b = input.nextInt();
           if (b == 1) {
               break;
           }
       }


       // 2. Input 1 Program Terminate
       int c = 1, z;
       while (c < 2) {
           z = input.nextInt();
           if (z == 1) {
               c = 3;
           }
       }

       
       // 3. Input 1 Program Terminate
       int d = 0;
       while (d != 1) {
           d = input.nextInt();
       }

       
       // 4. Print Natural Numbers Till 100
       int e = 1;
       while (e < 101) {
           System.out.println(e);
           e++;
       }

        
       // 5. Print Numbers and Calculate Sum
       int f = 1, sum = 0;
       do {
           System.out.println(f);
           sum += f;
           f++;
       } while (f <= 10);
       System.out.println();
       System.out.println("Sum of first 10 numbers: " + sum);

        
       // 6. Dividing Number Until It’s Below 100 and More Than 99
       double num = 0;
       while (num < 1000000) {
           num = input.nextInt();
       }
       do {
           num = num / 10;
       } while (num > 99);
       System.out.println(num);

        
       // 7. Counting Down and Printing Specific Lines
       int num2;
       num2 = input.nextInt();
       for (int n = num2; n > 0; n--) {
           System.out.println(n);
       }

       System.out.println();
       for (int m = 1; m <= 10; m++) {
           if (m == 4 || m == 5 || m == 6 || m == 7 || m == 8 || m == 9) {
               System.out.println(".");
               continue;
           }
           System.out.println("Line " + m);
       }

        
        // 8. Iterating Through Arrays
        int array[] = {1, 2, 3, 4, 5};
        for (int item : array) {
            System.out.println(item);
        }

        int array2[][] = {{1, 2}, {3, 4}};
        for (int[] row : array2) {
            for (int item : row) {
                System.out.println(item);
            }
        }
    }
}
