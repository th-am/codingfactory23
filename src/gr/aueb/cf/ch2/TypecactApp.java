package gr.aueb.cf.ch2;

public class TypecactApp {

    public static void main(String[] args) {
        int num1 = 10;
        long num2 = 20L;
        long result = 0L;

        num1 = (int) num2;

        result = num1 + num2;
        //metattopi h beltistipoihh kodika
        //alla genika to apofeyhoyme kalytera enan typo px int
        //sti java ta apofeygoume ta typecast
        System.out.println(result);
    }
}
