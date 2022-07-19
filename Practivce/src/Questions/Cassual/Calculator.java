package Questions.Cassual;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("Enter the operation: ");
            char op = input.next().trim().charAt(0);

            if(op=='+' || op=='-' || op=='*' || op=='/') {

                System.out.print("Enter first number: ");
                int a = input.nextInt();
                System.out.print("Entrt second number: ");
                int b = input.nextInt();

                if(op=='+'){
                    int out = a+b;
                    System.out.println(a + " + " + b + " = " + out);
                }

                if(op=='-'){
                    int out = a-b;
                    System.out.println(a + " - " + b + " = " + out);
                }

                if(op=='*'){
                    int out = a*b;
                    System.out.println(a + " * " + b + " = " + out);
                }

                if(op=='/'){
                    if(b==0) {
                        System.out.println("Not defined");
                    } else {
                        int out = a/b;
                        System.out.println(a + " / " + b + " = " + out);
                    }
                }
            }
            else if(op == 'x' || op == 'X') {
                System.out.println("Thank You :)");
                break;   
            }
            else {
                System.out.println("Invalid Operation :(");
            }
        }

        input.close();
    }    
}
