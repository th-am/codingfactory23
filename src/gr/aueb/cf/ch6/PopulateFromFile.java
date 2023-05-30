package gr.aueb.cf.ch6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * array populate from file
 */
public class PopulateFromFile {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:/tmp/infile.txt");
        Scanner in = new Scanner(file);
        int[] grades = new int[5];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = in.nextInt();
        }

        for (int grade : grades) {
            System.out.println(grade + " ");
        }
    }
}
