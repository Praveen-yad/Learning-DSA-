package Topics;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the fruit you wanna knoe about: ");
        String fruit = input.next();

        switch(fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("Red fruit");
                break;
            case "Grapes":
                System.out.println("Green watery fruit");
                break;
            default:
                System.out.println("Invalid Fruit");
        }
        input.close();
    }
    
}
