package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * diavazei char me scanner
 */
public class CharScannerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char inputChar;

        inputChar = in.next().charAt(0);

        System.out.println("char: " + inputChar);
    }
}
