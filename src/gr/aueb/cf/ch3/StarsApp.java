package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * ektypwnei n orizontia asterakia
 * opou n enas arothmos pou dinei o xristis
 *
 */
public class StarsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int i = 1;

        System.out.println("please insert number of stars");
        n = in.nextInt();

        while (i <= n){
            System.out.print("*");
            i++;
          // if (i % 50 == 0){
          //System.out.println();
           // }
        }
    }

}
