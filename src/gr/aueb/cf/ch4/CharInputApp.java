package gr.aueb.cf.ch4;

import java.io.IOException;
//otan exoym exception theloume ayto
/**
 * diavazei enan char me thn
 * system.in.red()
 */
public class CharInputApp {

    public static void main(String[] args) throws IOException {
        char inputChar;

        System.out.println("please insert an ASCII char");
        inputChar = (char) System.in.read();
        //h kokkinh gramh proeidopoiei gia lathi poy legontai exceptions

        System.out.println("char: " + inputChar);
    }
}
