package Topics.Basics;

import java.util.Scanner;

public class SwitchEquals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the fruit you wanna knoe about: ");
        String fruit = input.next();
        
        if(fruit.equals("mango")) {
            System.out.println("King of fruits"); 
        } else if(fruit.equals("grapes")) {
            System.out.println("Green watery fruit ");
        } else{
            System.out.println("Invald Fruit ");
        }
        input.close();
    }   
}
