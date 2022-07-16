package Questions;

import java.util.Scanner;

public class DigitOccurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = input.nextInt();

        System.out.print("Which number you wanna find :");
        int fn = input.nextInt();

        int count = 0;

        while(num > 0){
            int rem = num % 10;
            if(rem == fn) {
                count++;
            } 
            num = (num/10);
        }
       System.out.println(fn + " is repeating " + count + " times :)");

       input.close();
    }
    
}
