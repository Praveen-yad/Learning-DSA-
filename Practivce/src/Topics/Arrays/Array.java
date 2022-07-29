package Topics.Arrays;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*Syntax
         * datatupe[] variable_name = new datatype[size]
         */
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(arr[0] + " " + arr[2] + " " + arr[3]);
        
        // OR 
        System.out.println();

        int[] arr2 = {1,2,3,4};
        System.out.println(arr[2] + " " + arr2[0]);

        System.out.println();

        String[] arr3 = new String[4];
        System.out.println(arr3[0]);

        System.out.println();

        String[] arr4 = {"Praveen","Monu","Raja"};
        System.out.println(arr4[0]);

        in.close();

    }

    public static char[] tostring(int[] is) {
        return null;
    }
    
}
