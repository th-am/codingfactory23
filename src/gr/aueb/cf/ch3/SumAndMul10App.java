package gr.aueb.cf.ch3;

/**
 * ypologizei to athroisma ton 10 protwn akeraiwn
 */
public class SumAndMul10App {

    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;
        int i = 1;

        while (i <= 10) {
            sum += i;
            mul *= i;
            i++;

        }
        System.out.printf("Sum: " + sum);
    }
}
