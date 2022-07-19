package Topics.Functions;

import java.util.Scanner;

public class StrArguments {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hey! Your name:");
        String name = input.next();
        String out = greet(name);
        System.out.println(out);
        System.out.println(Ask());
        input.close();
        
    }
    static String greet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String Ask() {
        String hi = "how are you";
        return hi;
    }
    
}
