package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * prints with printStream
 */
public class PrintStreamApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("c:/tmp/f1.txt", StandardCharsets.UTF_8)) {
            ps.println("hello coding factory. Γεια!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
