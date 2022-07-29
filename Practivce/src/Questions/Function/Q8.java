package Questions.Function;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Grade();
    }
    static void Grade() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Gardes :");
        int marks = in.nextInt();
        if(marks>90 && marks<= 100){
            System.out.println("AA");
        }else if(marks>80  && marks<=90) {
            System.out.println("AB");
        }
        else if(marks>70  && marks<=80) {
            System.out.println("BB");
        }
        else if(marks>60  && marks<=70) {
            System.out.println("BC");
        }
        else if(marks>50  && marks<=60) {
            System.out.println("CD");
        }
        else if(marks >40 && marks <=50) {
            System.out.println("DD");
        }
        else if(marks<=40) {
            System.out.println("You Failed");
        }else {
            System.out.println("Invalid Entry");
        }

        in.close();
    }
    
}
