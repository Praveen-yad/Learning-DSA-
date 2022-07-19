package Topics.Functions;

import java.util.Scanner;

public class IntArguments {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first No.");
        int a = input.nextInt();
        System.out.print("Enter secund No.");
        int b = input.nextInt();
        int out = mul(a,b);
        System.out.println(out);
        input.close();
    }
    static int mul(int a , int b) {
        int c = a * b;
        return c;
    }
     
}