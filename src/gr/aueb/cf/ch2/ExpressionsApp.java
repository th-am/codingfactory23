package gr.aueb.cf.ch2;

public class ExpressionsApp {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 5;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;
        int result1 = 0;
        int result2 = 0;

        result2 = num1++; // result --> 12, num -> 13 prowta ekxwrisi meta aujisi
        result2 = ++num2; // num2 -> 6, result2 = 6 prita ayjhsh meta h ekxwirisi

        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;
        //pote div thia 0
        result1 = num1 + num2 * num2 - 5 / num1 % 4;

        System.out.printf("sum: %d, sub: %d, mul: %d div: %d, mod: %d \n",
                sum, sub, mul, div, mod);
        System.out.printf("result1= %d", result1);

    }

}
