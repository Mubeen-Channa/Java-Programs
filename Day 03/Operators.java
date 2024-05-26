import java.util.Scanner;
public class Operators {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Sum  of Digonal Task 8
          int ar1 [][]={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
          int sum=0;

          for(int m=0; m<ar1.length; m++){
                  System.out.println(ar1[m][m]);
                  sum+=ar1[m][m];
          }

          System.out.println("");
          System.out.print("Sum of diagonals " + sum);



        // Modules Operator %
           float f;
           int num;

           System.out.print("Enter Floating Number : ");
           f = input.nextFloat();

           System.out.print("Enter Number For Dividing : ");
           num = input.nextInt();

           System.out.println("Your Remainder is : " + f%num);



        // Bitwise and & , Or | , Excleasuive Or ^ , Negation ~
           System.out.println(10 & 15); //10
           System.out.println(5  | 10); //15

           String binary[]= {"0000", "0001", "0010", "0011", "0100", "0101", "0110",
                               "1000", "1001", "1010", "1011", "1100", "1101", "1110" };

           int a=3, b=6, c= a|b, d= a&b, e= a^b, ff= (~a&b) | (a&~b), g= ~a&0x0f ;

           System.out.println("    a       = "         + binary[a]);
           System.out.println("    b       = "         + binary[b]);
           System.out.println("    a|b     = "         + binary[c]);
           System.out.println("    a&b     = "         + binary[d]);
           System.out.println("    a^b     = "         + binary[e]);
           System.out.println("    (~a&b) | (a&~b) = " + binary[ff]);
           System.out.println("    ~a&0x0f = "         + binary[g]);


        // Left and right Shifting
           int x=10;
           int y=20;

           System.out.println(x<<1); // One Left Shifting
           System.out.println(x<<2); // two Left Shifting

           System.out.println(y>>1); // One Right Shifting
           System.out.println(y>>2); // One Right Shifting
    }
}