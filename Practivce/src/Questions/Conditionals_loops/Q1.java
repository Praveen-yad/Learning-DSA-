package Questions.Conditionals_loops;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius:");
        int r = in.nextInt();
        if(r <= 0) {
            System.out.println("Not a circle");
        }else {    
            double A = (3.14)*r*r;
            System.out.println("Radius of Circle is " + A); 
        }     
        in.close(); 
       
    }
    
}
