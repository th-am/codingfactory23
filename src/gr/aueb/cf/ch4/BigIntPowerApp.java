package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntPowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a;
        BigInteger n;
        BigInteger result = new BigInteger("1");

        System.out.println("please insrt two ints base and power");
        a = BigInteger.valueOf(in.nextInt());
        //kanei typecast apo thn int sthn klassi
        n = BigInteger.valueOf(in.nextInt());

        for (int i = 1; i <= n.intValue(); i++) {
            result = result.multiply(a);
        }
        System.out.printf("%d^%d = %d", a, n, result);
    }
}
