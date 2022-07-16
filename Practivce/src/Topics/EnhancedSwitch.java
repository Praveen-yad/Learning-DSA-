package Topics;

import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the fruit you wanna knoe about: ");
        String fruit = input.next();

        switch(fruit) {
            case "Mango" -> System.out.println("king of fruits");
            case "Apple" -> System.out.println("Red super healty fruit");
            case "Guavava" -> System.out.println("Green Hard fruit");
            case "Grapes" -> System.out.println("Small green watery fruit");
            default -> System.out.println("Invalid Fruit");
        }
        input.close();
    }
    
}
