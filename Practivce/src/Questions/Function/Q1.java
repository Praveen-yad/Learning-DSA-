package Questions.Function;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Size();
    }
    static void Size() {
        Scanner input = new Scanner(System.in);
        int max = 0;
        int min = 0;
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(b>a) {
            if(c>b) {
                max = c;
                min = a;
            }else {
                max = b;
                if(a<c){
                    min = a;
                }else {
                    min = c;
                }
            }
        }else {
            max = a;
            if(b<c) {
                min = b;
            }else {
                min = c;
            }
        }
        System.out.println("Minimum is " + min );
        System.out.println("Maximum is " + max);

        input.close();
    }   
}
