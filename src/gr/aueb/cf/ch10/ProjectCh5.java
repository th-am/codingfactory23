package gr.aueb.cf.ch10;

import static gr.aueb.cf.ch10.ProjectCh3.getChoice;

public class ProjectCh5 {

    public static void main(String[] args) {

    }

    public static void printStarsH(int n) {
        for (int i = 1; i <=n; i++) {
            System.out.print("*");
        }
    }
    public static void printStarsV(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }
    public static void printStarsHV(int n) {
        for (int i = 1; i <= n; i++) {
            printStarsH(n);
            System.out.println();
        }
    }

    public static void printStarsHVAsc(int n) {
        for (int i = 1; i <= n; i++) {
            printStarsH(i);
            System.out.println();
        }
    }

    public static void printStarsHVDesc(int n) {
        for (int i = n; i >= 1; i--) {
            printStarsH(i);
            System.out.println();
        }
    }
    public static void printOnChoice(String s) throws IllegalArgumentException {
        int choice = -1;
        int n = 0;

        try {
            if (s == null) throw new IllegalArgumentException();
            choice = Integer.parseInt(s);
            if ((choice >= 1 && choice <= 5)) {
                System.out.println("please insert the number of stars");
                n = Integer.parseInt(getChoice());
            }

            switch (choice) {
                case 1:
                    printStarsH(n);
                    break;
                case 2:
                    printStarsV(n);
                case 3:
                    printStarsHV(n);
                    break;
                case 4:
                    printStarsHVAsc(n);
                    break;
                case 5:
                    printStarsHVDesc(n);
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw e;
        }
    }
}

