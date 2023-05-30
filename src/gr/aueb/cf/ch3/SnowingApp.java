package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασοιζει αν χιονιζρι η οχι με βαση
 * οψχι μονο τη θερμοκρασια αλλα και το αν
 * βρεχει, αν βρεχει και θερμοκρασια <0 υουτε χιονιζει
 * αλλιως οχι
 */
public class SnowingApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int temp = 0;

        System.out.println("Please insert if its raining (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert the temperature");
        temp = in.nextInt();

        isSnowing = isRaining && (temp<0);

        System.out.println("Is snowing: " + isSnowing);
    }
}


