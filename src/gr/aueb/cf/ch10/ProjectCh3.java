package gr.aueb.cf.ch10;

import java.util.Scanner;

/**
 * emfanizei menu kai
 */
public class ProjectCh3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        String response = "";
        do {
            printMenu();
            response =  getChoice();

            try {
                if (response.matches("[Qq]")) {
                    quit = true;
                } else {
                    printOnChoice(response);
                }
            } catch (IllegalArgumentException e) {
                System.out.println("invalid choice");
            }
        } while (!quit);

    }

    public static void printMenu() {
        System.out.println("please select one of the following");
        System.out.println("1 insert");
        System.out.println("2 update");
        System.out.println("3 delete");
        System.out.println("4 select");
        System.out.println("Q or q to quit");
    }

    public static String getChoice() {
        return in.nextLine().trim();
    }
    public static void printOnChoice(String s) {
        int choice = -1;
        //ta runtime exception de xreiazetay na ta grafo sto onomatis panw
        try {
            if (s == null) throw new IllegalArgumentException();

            choice = Integer.parseInt(s);

            switch (choice) {
                case 1:
                    System.out.println("inserted");
                    break;
                case 2:
                    System.out.println("updated");
                    break;
                case 3:
                    System.out.println("deleted");
                    break;
                case 4:
                    System.out.println("selected");
                    break;
                default:
                    throw new IllegalArgumentException();

            }
        } catch (IllegalArgumentException e) {
            //e.printStackTrace():
            throw e;
        }

    }
}
