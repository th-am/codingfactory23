package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ενα αεροσκαφος εχει δυο δεξαμενες
 * αν μια δεξαμενη εχει λιγοτερπ απο
 * 1/4 καυσιμα τοτε αναβει πορτοκαλι
 * σημα, ενω αν και οι δυο δεξαμενες εχουν
 * <1/4 κοκκινο σημα
 * ο πιλοτος δινει true η false αν τανκ < 1/4
 * η οχι αντιστοια
 */
public class OrangeRedSignalApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTank1LTQuarter = false;
        boolean isTank2LTQuarter = false;
        boolean orangeOn = false;
        boolean redOn = false;

        System.out.println("Please insert if tank1, tank2 are less than 1/4");
        isTank1LTQuarter = in.nextBoolean();
        isTank2LTQuarter = in.nextBoolean();

        orangeOn = isTank1LTQuarter || isTank2LTQuarter;
        redOn = isTank1LTQuarter && isTank2LTQuarter;

        System.out.println("Orange light on: " + orangeOn);
        System.out.println("Red light on: " + redOn);

        }
}
