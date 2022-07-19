package Questions.Conditionals_loops;

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        while(true) {
            int num = in.nextInt();
            a  = num + a; 
            if(num == 0 ) {
                break;
            }
        }System.out.println(a);   
        in.close();
    }
    
}
