package gr.aueb.cf.ch7;

/**
 * splits a string
 */
public class StringSplitApp {

    public static void main(String[] args) {
        String s = "Athens     Uni of Econ and Buisines";

        String[] tokens = s.split(" +");

        for (String token : tokens) {
            System.out.print(token);
            System.out.print(" ");
        }

    }
}
