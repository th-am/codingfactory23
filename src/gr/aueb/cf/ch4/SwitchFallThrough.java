package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * lambanei enan grade apo ton xristh kai dinei feedback
 * me th morfh (excellent very good good fail)
 * an einai >=9 >=7 >=5 <5
 */
public class SwitchFallThrough {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade;

        System.out.println("please provide the grade");
        grade = in.nextInt();

        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("fail");
                break;
            case 5:
            case 6:
                System.out.println("good");
                break;
            case 7:
            case 8:
                System.out.println("very good");
                break;
            case 9:
            case 10:
                System.out.println("excellent");
                break;
            default:
                System.out.println("error in grade");
                break;
        }
    }
}
