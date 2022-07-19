package Topics.Basics;


import java.util.Scanner;

public class ifelse{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//if else statement

//        System.out.print("Enter a number :");
//        int num = input.nextInt();
//        if(num%2==0) {
//            System.out.println(num + " is an Even number :)");
//        } else {
//            System.out.println(num + " is an odd number <3");
//        }

//muntiple if else statement

        System.out.print("Enter the salary :");
        int salary = input.nextInt();
        if(salary < 10000) {
            salary += 1000;
            System.out.println(salary);
        }else if(salary<20000) {
            salary+=2000;
            System.out.println(salary);
        }else {
            salary+=3000;
            System.out.println(salary);
        }

        input.close();
    }
}
