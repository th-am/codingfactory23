package gr.aueb.cf.ch4;

import java.util.Scanner;

public class PowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0, n = 0;
        int result = 1;

        System.out.println("please insert base, power");
        a = in.nextInt();
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            result *= a;

        }

        System.out.printf("%d ^ %d = %d", a , n , result);

    }
}
