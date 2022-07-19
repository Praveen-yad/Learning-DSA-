package Topics.Basics;

import java.util.Scanner;

public class WhileAndFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want the table of :)");
        int num = input.nextInt();

//        int a = 1;
//        //While loop
//        while(a != 11) {
//            System.out.println(num +" x " +a+ " = "+ num*a);
//            a += 1;
//        }

        //For loop
        for(int b = 1; b != 11; b++){
            System.out.println(num + " x " + b +" = "+ num*b);

        }

        input.close();
    }
}
