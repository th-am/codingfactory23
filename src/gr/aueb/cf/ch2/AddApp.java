package gr.aueb.cf.ch2;

/*overflow.

 */
public class AddApp {

    public static void main(String[] args) {
        //dilosh aki arxikopoihsh metavlitvn
        int num1 = 2_147_483_647;
        int num2 = 2;
        int result = 0;
        //entoles
        result = num1 +num2;

        //ektyposi
        System.out.println(result);
        //de mas vgazei error alla de mas vgazei kai sosoto
    }
}
