package Topics.Functions;

import java.util.Scanner;

public class Overloading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // fun(45);
        fun("Hello");
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = add(a , b);
        System.out.println(sum);
        input.close();
        
    }
    static void fun(int a) {
        System.out.println("First One");
        System.out.println(a);
    }                              //Two functions can have same name..To do so either the number or the type of argument must be different.
    static void fun(String b) {   //This is known as function overloading.
        System.out.println("Second One");
        System.out.println(b);
    }
    static int add(int num1 , int num2) {
        int sum = num1 + num2;
        return sum;
    }
}