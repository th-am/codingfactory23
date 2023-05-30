package gr.aueb.cf.ch2;

/** emfanizei typos dedomena akaraiwn
 * megethos min kai max
 */
public class InTypesApp {

    public static void main(String[] args) {
        System.out.printf("type: %s, size: %d bits, min: %,d, max: %,d\n",
                Integer.TYPE, Integer.BYTES * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("type: %s, size: %d bits, min: %,d, max: %,d\n",
                Byte.TYPE, Byte.BYTES * 8, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("type: %s, size: %d bits, min: %,d, max: %,d\n",
                Short.TYPE, Short.BYTES * 8, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("type: %s, size: %d bits, min: %,d, max: %,d\n",
                Long.TYPE, Long.BYTES * 8, Long.MIN_VALUE, Long.MAX_VALUE);
// me kefalaia px MIN einai statheres
        //to %s einai placeholder gia strings env to %d einai gua int
    }




}
