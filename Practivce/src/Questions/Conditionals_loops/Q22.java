package Questions.Conditionals_loops;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer :)");
        int n = input.nextInt();
        int a = 0;
        int sum = 0;
        int prod = 1;
 
        while(n>0) {
            a = n % 10;
            sum = sum + a ;
            prod = prod * a;
            n = n / 10;
        }
        System.out.println("Sum is: " + sum);
        System.out.println("Product is: " +prod);
        int Diff = prod - sum;
        System.out.println("Difference is: " + Diff);

        input.close();     
    }   
}
