package Topics.Functions;

import java.util.Scanner;

public class ReturnFxn {
    public static void main(String[] args) {
        int c = n();
        // char c = (char)(out);
        System.out.println(c);
        
    }
    static int n() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word:");
        char word = input.next().trim().charAt(0); 
        int n = (int)(word);
        input.close();
        return n;   
    }
}