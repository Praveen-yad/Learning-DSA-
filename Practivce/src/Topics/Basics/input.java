package Topics.Basics;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        int age = input.nextInt();
//        System.out.println("the age you entered is " + age );

        System.out.print("Enter your name:");
        String name = input.nextLine();
        System.out.println("You entered " + name);
        
//        float marks = input.nextFloat();
//        System.out.println("marks entered is " + marks);
        
        input.close();
    }
}

//int number = 64; (input.nextInt)
//string words = hello (input.nextLine)
//char letter = 'a';(input.nextline)
//float decimal = 58.65f;(input.nextFloat)
//double largedecimal = 8946642.55516565;(input.nextBigDecimal)
//long largeInteger = 484154154154155L;(input.nextBigInteger)
//boolean check = false;(input.nextBollean)