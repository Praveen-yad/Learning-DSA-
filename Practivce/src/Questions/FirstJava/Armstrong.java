package Questions.FirstJava;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number:");
        int n = input.nextInt();
        int c = n;
        int temp = n;
        int count = 0;
        double num = 0;

        while(n > 0){
            n = n/10;
            count += 1;
        }
        while(temp>0){
            num = num + Math.pow(temp%10, count);   
            temp = temp/10;        
        }
        if(num==c){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }

        input.close();
    }
    
}
