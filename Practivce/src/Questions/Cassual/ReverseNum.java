package Questions.Cassual;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number :");
        int num = input.nextInt();

        int count = 0;
        int a = 0;

        while(num > 0) {
            a = num % 10;
            count = count*10 + a;
            num = num / 10;
        }
        
        System.out.print("Reverse num is : "+ count);

        input.close();
    }    
}