package Topics.Arrays;

import java.util.Arrays;
import java.util.Scanner; 

public class INandOUT {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        int x = input.nextInt();
        int[] arg = new int[x];

        for(int i = 0 ; i < arg.length ; i++) {
            arg[i] = input.nextInt();
        }

        //First way to print
        for(int i = 0; i < arg.length ; i++) {
            System.out.print(arg[i] + " ");
        }
        System.out.println();

        //Second way to print
        for(int num: arg) {     //here num is the number of element in arg
            System.out.print(num + " ");    //it means- For every element in arg print element.
        }
        System.out.println();

        //Third way to print
        System.out.println(Arrays.toString(arg));

        //Stirng Array
        System.out.println("Enter the strings");
        String[] str = new String[3];
        for(int n = 0; n<3; n++) {
            str[n] = input.next();
        }
        System.out.println(Arrays.toString(str));

        input.close();
    }    
}