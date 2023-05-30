package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * switch instead of if-the-else if
 */
public class SwitchCaseApp {

    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int choice;

        do {
            System.out.println("please select one of the following: ");
            System.out.println("1. one player game");
            System.out.println("2. two player game");
            System.out.println("3. team game");
            System.out.println("4. quit");
            System.out.println("Please provide a choice");

            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("start one player game");
                    break;
                case 2:
                    System.out.println("start two player game");
                    break;
                case 3:
                    System.out.println("start team game");
                    break;
                case 4:
                    System.out.println("Quit game");
                    break;
                case 5:
                    System.out.println("error in choice");
                    break;
            }
        } while (choice != 4);

        System.out.println("goodbye");
    }
}
