package Questions.Conditionals_loops;

import java.util.Scanner;

public class IntQ25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int date = 1;
        int count = 0;
        while(date <= 31) {
            if(date%2 == 0) {
              count++;
              date++;  
            }else {
                date++;
            }
        }
        System.out.println(count);
        in.close();
    }
    
}
