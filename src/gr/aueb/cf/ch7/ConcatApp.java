package gr.aueb.cf.ch7;

/**
 *  concatenates two or more strings
 */
public class ConcatApp {

    public static void main(String[] args) {
        String title = "Dr.";
        String firstname = "Athan.";
        String lastname = "Androutsos";
        String fullName;
        String tittledFullName;

        fullName = title + firstname + lastname;
        tittledFullName = title.concat(firstname).concat(lastname);

        System.out.println(fullName);
        System.out.println(tittledFullName);
    }
}
