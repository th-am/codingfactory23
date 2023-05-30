package gr.aueb.cf.ch2;

/**
 * Κλάση που διαβάζει τρεις ακεραίους απο τον χρήστη
 * τους μειωνει κατα 1 και τους εμφαβίζει με τη σειρα που
 * δοθηκαν αφήνοντας ένα κενό αναμεσα τους
 */

import java.util.Scanner;

public class ThreeNumbersApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Please insert three integers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        num1--;
        num2--;
        num3--;

        System.out.printf("%d %d %d", num1, num2, num3);
    }
}
