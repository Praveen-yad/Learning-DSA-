package Questions;

import java.util.Scanner;

public class FibonatchiNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Fibonatchi you want :");
        int n = input.nextInt();
        int a = 0;
        int b = 1;

        for(int count = 2; count <= n; count++) {
            int temp = b;
            b = b + a;
            a = temp;
        }
        System.out.println(b);

        input.close();
    }
    
}
