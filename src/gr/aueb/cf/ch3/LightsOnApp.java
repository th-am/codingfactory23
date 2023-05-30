package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν πρέπει να ανάψουν γτα
 * φωτα του αυτοκινητου με βαση 3 μεταβλητες
 * αν βρεχει ΚΑΙ ταυτοχρονα ισχυει ενα τουλαχιστον αοπο
 * ειναι σκοταδι Η τρεχουμε με πανω απο 100
 * τις τιμς τις δινει ο χήστης
 */
public class LightsOnApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        boolean lightsOn = false;
        final int MAX_SPEED = 100;

        System.out.println("Please insert if it's raining(true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it's dark");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed (int)");
        speed = in.nextInt();

        isRunning = (speed > MAX_SPEED);
        lightsOn = isRaining && (isDark || isRunning);

        System.out.println("Lights on: " + lightsOn);

    }
}
