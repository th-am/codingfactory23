package gr.aueb.cf.ch2;

import java.math.BigInteger;

/*
demonstrates bigint class
 */

public class AddBigIntApp {

    public static void main(String[] args) {
        BigInteger bigNUM = new BigInteger("2147483647");
        BigInteger bigNUM2 = new BigInteger("2147483647");
        BigInteger result = new BigInteger("0");

        result = bigNUM.add(bigNUM2);

        System.out.println("%,d, result");
    }
}
