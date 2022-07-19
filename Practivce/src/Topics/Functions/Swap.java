package Topics.Functions;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a , b);
        System.out.print(a + " " + b);
        // String name =  "Praveen";
        // changename(name);
        // System.out.println(name);
    }
    // static void changename(String naam) {
    //     naam = "Priyanshu"; 
    // }
    static void swap(int a , int b) {
        int temp = a;
        a = b;
        b = temp;
    }       
}
