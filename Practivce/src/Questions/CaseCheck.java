package Questions;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the character :");
        char word = input.next().trim().charAt(0);

        if(word >='A' && word <= 'Z') {
            System.out.println("UpperCase");
        } else {
            System.out.println("LowerCase");
        }
        
        input.close();
    }    
}
