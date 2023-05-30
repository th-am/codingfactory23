package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * diavzei apo to stdin to start value,
 * end value, step kai ektypwnsie plhthos epanalipsewn
 */
public class ForFlexApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startValue;
        int endValue;
        int step;
        int iterations = 0;

        System.out.println("please provide start end and step value");
        startValue = in.nextInt();
        endValue = in.nextInt();
        step = in.nextInt();

        for (int i = startValue; i <= endValue; i = i + step) {
            iterations++;
            System.out.print(i + " ");
        }

        System.out.println("iterations: " + iterations);


    }
}
