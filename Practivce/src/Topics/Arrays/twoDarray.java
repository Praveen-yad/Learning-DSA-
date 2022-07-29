package Topics.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class twoDarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[2][2];    //Specifying the num of row is mandetory but not nunms.(int[row][n]).
        
        
        //Input
        for(int row=0; row < arr.length; row++) {
            for(int col=0; col<arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //Output
        // for(int row=0; row < arr.length; row++) {
        //     for(int col=0; col<arr[row].length; n++) {
        //         System.out.print(arr[row][col]+ " ");
        //     }System.out.println();
        // }
        
        //output#2
        // for(int row = 0 ; row< arr.length; row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        //Output#3
        for(int[] num: arr) {
            System.out.println(Arrays.toString(num));
        }
        in.close();
        
    }
    
} 
