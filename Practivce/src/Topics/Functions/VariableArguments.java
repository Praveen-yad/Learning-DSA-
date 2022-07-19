package Topics.Functions;

import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
        nArgs(1,2,54,69,35,78,15,56);

        strArgs("Praveen" , "Person X" , "Person Y" , "Person Z");

        extraArgs(1 ,"Praveen" , 45 , 96 , 455);     
    }
    static void nArgs(int ...a) {
        System.out.println(Arrays.toString(a));
    }
    static void strArgs(String ...v) {
        System.out.println(Arrays.toString(v));
    }
    static void extraArgs(int num1 , String str , int ...x) {
        System.out.println(Arrays.toString(x));    //....Here is an issue....😥
    }
}