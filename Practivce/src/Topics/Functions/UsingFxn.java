package Topics.Functions;

import java.util.Scanner;

public class UsingFxn {
    public static void main(String[] args) {       
        sum();    
    }
    static void sum() {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter first No.");
        int num1 = input.nextInt();
        System.out.print("Enter second No.");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
        input.close();
    }
  
}
