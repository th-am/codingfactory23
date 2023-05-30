package gr.aueb.cf.ch5;

/**
 * yperfortwsh methodwn
 */
public class OverloadingApp {

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));
        System.out.println(add(1l, 2));
        System.out.println(add(1l, 2l));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static long add(long a, int b) {
        return a + b;
    }

    public static long add(long a, long b) {
        return a + b;
    }

}
