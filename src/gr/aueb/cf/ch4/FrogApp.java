package gr.aueb.cf.ch4;

/**
 Ένας μικρός βάτραχος θέλει να περάσει ένα ποτάμι.
 Ο frog βρίσκεται στη θέση Χ και θέλει να φτάσει στη
 θέση γ (ή σε θέση > Υ). Ο frog Jumps a fixed distance, D.

 βρίσκει τον ελάχιστο αριθμό jumps που ο small frog πρέπει
 να κάνει ώστε να φτάσει (ή να ξεπεράσει) τον στόχο.

 Για παράδειγμα, αν έχουμε
 Χ = 10 Y = 85
 D= 30,
 τότε ο shall frog θα χρειαστεί ο αυτός, γιατί
 Starts at 10, και μετά το 1ο jump πάει στη θέση 10 Στο 2ο jump, πάει 40 + 30 = 70
 και στο 3ο jump, πάει 70 + 30 = 100
 */
public class FrogApp {

    public static void main(String[] args) {
        int x = 0;
        int y = 100;
        int d = 5;
        int jumps = 0;

        jumps = (int) Math.ceil((y - x) / (double) d);
        System.out.println("jumps: " + jumps);
    }

}
