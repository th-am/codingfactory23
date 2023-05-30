package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * o xrisths exei 10 eykairies na brei ena
 * mystiko kleidi int
 * an to brei noritera apo thn 10h fora tha prepei
 * na stamathsei
 */
public class FindTheSecretApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECRET_KEY = 12;
        int num;
        boolean found = false;

        for (int i = 1; i <= 10; i++) {
            System.out.println("please make a guess");
            num = in.nextInt();

            if (num == SECRET_KEY) {
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("no worries, play again");
            System.exit(1);
        }
        System.out.println("success! play again");
    }
}
