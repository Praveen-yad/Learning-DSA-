package Questions;

import java.util.Scanner;

public class LargestInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number :");
        int a = input.nextInt();
        System.out.print("Enter Second number :");
        int b = input.nextInt();
        System.out.print("Enter Third number :");
        int c = input.nextInt();

        // Approach first:
        int max = a;

        if(b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        //Approach Second:
//        int max = 0;
//        if(a>b) {
//            max = a;
//        } else {
//            max = b;
//        }
//
//        if(c>max){
//            max = c;
//        }


        //Third approach:
//        int max = Math.max(c,Math.max(a,b));

        System.out.println("Maximum is:" + " " + max);
        
        input.close();
    }
}
