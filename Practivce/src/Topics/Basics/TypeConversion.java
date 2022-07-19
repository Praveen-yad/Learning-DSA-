package Topics.Basics;

import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a decimal number :");
//        float number = input.nextFloat();
//        int num = (int)(number);
//        System.out.println(num);

        //Type conversion
//        int a = (int)(156.23f);
//        System.out.println(a);

        //Automatic type conversion
//       int z = 'A';
//       System.out.println(z);

        int i = 123456;
        char c = 'a';
        float f = 12.65f;
        short s = 1234;
        double d = 1234.9876;
        double p = (i+c) / (c*f) + (s*d);
        System.out.println((i+c) + " " + (c*f) + " " + (s*d) );
        System.out.println(p);
// here type is automatically converted to one which is larger

        input.close();
    }
}
