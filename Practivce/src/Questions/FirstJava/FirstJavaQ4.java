package Questions.FirstJava;

import java.util.Scanner;

public class FirstJavaQ4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number :");
        int fir = input.nextInt();
        System.out.print("Enter Second Number :");
        int sec = input.nextInt();
        System.out.println("Select an operater: (+) , (-) , (*) , (/) ");
        char oprt = input.next().charAt(0);

        if( oprt == '+') {
            System.out.println((fir) + " + " + (sec) + " = " + (fir+sec));
        }else if(oprt == '-') {
            System.out.println((fir) + " - " + (sec) + " = " + (fir-sec));
        }else if(oprt == '*') {
            System.out.println((fir) + " x " + (sec) + " = " + (fir*sec));
        }else if(oprt == '/') {
            System.out.println((fir) + " / " + (sec) + " = " + (fir/sec)); 
        }else{
            System.out.println("Invalid Operator");
        }
        
        input.close();  
    }
}
