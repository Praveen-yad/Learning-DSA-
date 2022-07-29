package Questions.Conditionals_loops;

import java.util.Scanner;

public class IntQ3 {
    public static void main(String[] args) {
        avg();
        
    }
    static void avg() {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int count = 0;
        while(true){
            int num = in.nextInt();  
            a = a + num;
            if(num == 0) {
                break;
            }
            count += 1;
        }
        double ans = a/count;
        System.out.println(ans);
        in.close();
    }
}