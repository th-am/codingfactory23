package gr.aueb.cf.ch3;

import java.util.Scanner;

public class AverageApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;
        int count = 0;
        int average = 0;

        System.out.println("please provide total and count");
        total = in.nextInt();
        count = in.nextInt();

        if (count == 0) {
            System.out.println("invalid count");
            System.exit(1);
        }

        if (total < 0) {
            System.out.println("invalid total");
            System.exit(1);
        }

        average = total / count;

        if (average > 10) {
            System.out.println("invalid average");
            System.exit(1);
        }


    }

}
