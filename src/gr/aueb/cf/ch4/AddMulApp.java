package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * prosthetei kai polaplasizei n protouw akeraioys
 * pou dinei o xristhw
 */
public class AddMulApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int sum = 0;
        int result = 1;

        System.out.println("insert a num (int)");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            result = result * i;
        }

        System.out.println("sum = " + sum);
        System.out.println("mul = " + result);
    }
}
