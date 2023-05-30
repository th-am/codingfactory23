package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * diavazei aoi ena arxeio dedpmenon
 * country city1    city2 .....
 * country
 * kai grafei kathe grammi se diafoewtiko aoiutpuyt
 * arxeio
 *
 * xrhsimopoioume java.io
 */
public class CitiesIOApp {

    public static void main(String[] args) {
        String line;
        String[] cities;
        File dir = new File("c:/tmp/");

        if (!dir.exists()) {
            if (!dir.mkdir()) {
                System.err.println("error in make dir");
                System.exit(1);
            }
        }

        try (BufferedReader bf = new BufferedReader(new FileReader("c:/tmp/cities.txt"))) {
            while ((line = bf.readLine()) != null) {
                cities = line.split(" +");
                switch (cities[0]) {
                    case "Greece":
                        File grFile = new File(dir + "/" + cities[0].substring(0, 2).toLowerCase() + ".txt");
                        PrintStream gr = new PrintStream(grFile, StandardCharsets.UTF_8);
                        //evala substring 0 -2 na parei ta dyo prwta grammata toy greece
                        print(gr, "GR cities");
                        print(gr, cities);
                        break;
                    case "USA":
                        File usFile = new File(dir + "/" + cities[0].substring(0, 2).toLowerCase() + ".txt");
                        PrintStream us = new PrintStream(usFile, StandardCharsets.UTF_8);
                        //evala substring 0 -2 na parei ta dyo prwta grammata toy greece
                        print(us, "USA cities");
                        print(us, cities);
                        break;
                    case "Germany":
                        File deFile = new File(dir + "/" + cities[0].substring(0, 2).toLowerCase() + ".txt");
                        PrintStream de = new PrintStream(deFile, StandardCharsets.UTF_8);
                        //evala substring 0 -2 na parei ta dyo prwta grammata toy greece
                        print(de, "DE cities");
                        print(de, cities);
                        break;
                    default:
                        System.out.println("error in cities");
                        break;
                }
            }
        } catch (IOException e) {

            e.printStackTrace();
        }

    }
    public static void print(PrintStream ps, String message) {
        ps.println(message);
    }

    //yperforomeneh print ara idio onoma synarthshs diaforetikes parametrpi
    public static void print(PrintStream ps, String[] tokens) {
        for (int i = 1; i < tokens.length; i++) {
            ps.print(tokens[i] + " ");
//            print(ps, tokens[i] + " ");
        }

    }
}
