package Topics;


public class Loop {
    public static void main(String[] args) {

        /*
            Syntax of for loop:

            for(initialisation; condition; incriment/decrement) {
                //body
            }
        */
            //for loops
//        for(int num=5; num>=-10; num -= 2) {
//            System.out.println(num);
//        }


            //While loops
        int num = 1;
//        while(num<=6) {
//            System.out.println(num);
//            num += 1;
//        }

        //do while loop
        do {
            System.out.println(num);              //It executes this statement fot thr forst time
            num = num+1;                         //despite of the condition and then check the condition
        } while(num!=7);
    }
}
