package Topics.Basics;

import java.util.Scanner;

public class SwitchUnderSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter empId:");
        int id = input.nextInt();


        switch(id) {
            case 1 -> System.out.println("Employ A");
            case 2 -> System.out.println("Employ B");
            case 3 -> System.out.println("Employ C");
            case 4 -> {
                System.out.print("Enter department:");
                String dep = input.next();
                switch(dep) {
                    case "IT" -> System.out.println("IT department");
                    case "MG" -> System.out.println("Manegment department");
                    default -> System.out.println("Invalid department entered");
                 }
            }
            default -> System.out.println("Invalid id entered");
        }

        input.close();
    }
    
}
