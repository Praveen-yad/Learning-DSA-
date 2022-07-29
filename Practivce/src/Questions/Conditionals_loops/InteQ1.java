package Questions.Conditionals_loops;

import java.util.Scanner;

public class InteQ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int count = num-1; count > 0; count-- ) {
            num = num * count;
        }System.out.println(num);
        in.close();
    }
    
}
