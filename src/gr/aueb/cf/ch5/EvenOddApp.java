package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * apofasizei an enas int einai artios h perittos
 */
public class EvenOddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        boolean isNumEven = false;

        System.out.println("please insert an int");
        num = in.nextInt();

        isNumEven = isEven(num);

        System.out.println("num " + num + " is even: " + isNumEven);

    }

    /**
     * evaluates an in if its even or not
     * @param n the number (int) to evaluate
     * @return  true if n is even, false otherwise
     */

    public static boolean isEven(int n) {
        return n % 2 == 0;
//        if (n % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
    }
}
