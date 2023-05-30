package gr.aueb.cf.ch1;

/**
 * prosthetei dyo akeraiouw kai emfanizei a
 * apotelsma sto stdout
 */
public class AddApp {

    public static void main(String[] args) {
        //dhldvsh kai arxikopoihsh metavlitwn
        int num1=10;
        int num2=7;
        int result=0;

        //entoles
        result = num1 + num2;


        //ektypwsh apotelesmatwn
        //to syn mpainei anamesa sta alfarithmitika kai arithmous
        //metatrepei to result se kati alfarithmitiko
        System.out.println("to apotelesma einai:" + result);
        //System.out.println("to apotelesma tou " + num1 + " kai " + num2 + " einai " + result);
        System.out.printf("to apotelesma twn %d , %d einai %d", num1, num2, result);

    }



}
