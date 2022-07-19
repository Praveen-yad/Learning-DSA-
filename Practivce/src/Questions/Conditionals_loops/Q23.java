package Questions.Conditionals_loops;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want the factors of: ");
        int num = in.nextInt();
        int count = num;
        while(count != 0) {
            if(num % count == 0){
                int a = num / count;
                System.out.println(a + " ");
                count--;
            } else {
                count--;
            }
        } 

        in.close();
    }
    
}
