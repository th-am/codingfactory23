package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * ypologizei paragontiko me th methodi
 * facto ()
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int result;

        System.out.println("please isert n");
        n = in.nextInt();

        result = facto(n);

        System.out.printf("%d! = %d", n, result);
    }

    /**
     *
     * @param n the bumber (n) of n!
     * @return 1 * 2 * 3 *...
     */
    public static int facto (int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
