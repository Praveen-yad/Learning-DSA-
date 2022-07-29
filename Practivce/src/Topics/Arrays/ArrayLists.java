package Topics.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        ArrayList <Integer> num = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            num.add(in.nextInt());
        }System.out.println(num);

        ArrayList<Integer> list = new ArrayList<>(3);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println( list.get(2));
        System.out.println(list);

        list.set(0, 99);

        System.out.println(list);
        in. close();
    }
    
}
