package Questions.Conditionals_loops;

import java.util.Scanner;

public class IntQ26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nsum = 0;
        int esum = 0;
        int osum = 0;
        while(true) {
            int N = input.nextInt();
  
            if(N < 0) {
                nsum = nsum + N;         
            }
            if(N>0 && N%2 ==0) {
                esum = esum + N;           
            }
            if(N>0 && N%2 != 0){
                osum = osum + N;
            }
            if(N==0){
                break;
            }
            
        }
        
        System.out.println("Sum of Negetive numbers : " + nsum);
        System.out.println("Sum of Positive numbers : " + esum);
        System.out.println("Sum of Odd numbers : " + osum);

        input.close();       
    }   
}