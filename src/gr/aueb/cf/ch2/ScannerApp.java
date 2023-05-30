package gr.aueb.cf.ch2;

/*
* diavasei apo keyboard dyo akeraioys kai
* tous prosthetei
*
* */


import java.util.Scanner;

public class ScannerApp {

    public static void main(String[] args) {
        //dilosh metavlitvn kai arxikopoihsh
        Scanner in = new Scanner(System.in);
        //antistoixoume to pliktrologio me mia metavliti "in"
        //pleon otan leme in ananferomaste sto pliktologio
        int num1 = 0;
        int num2 = 0; //kali praktiki na arxikopoioume
        int sum = 0;

        //entoles
        System.out.println("please instert 2 ints");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;

        //agnoei ta kena allages grammis klp kai diavazei ton int
        //ekypwsh
        System.out.printf("%d + %d = %d", num1, num2, sum);

    }


}
