package Questions.Function;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Vote();
        
    }
    static void Vote(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Age :");
        int age = input.nextInt();
        if(age>0 && age <18) {
            System.out.println("You are under age");
        }else if(age>18 && age < 150) {
            System.out.println("You are eligible for voting");
        }else if(age > 150){
            System.out.println("Danm! Bro you ancient");
        }else {
            System.out.println("invalid Age Entered ");
        }

        input.close();
    }    
}