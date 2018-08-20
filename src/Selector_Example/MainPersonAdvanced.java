/**
 * This is a example application how to implement the selection of
 * different sorting-algorithms, selected by the user.
 *
 * Enjoy the course and feel free to contribute.
 */
package Selector_Example;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class MainPersonAdvanced {

    public static void main(String[] args) {

        PersonAdvanced persBert = new PersonAdvanced("Bert", 1980, 2300.0);
        PersonAdvanced persAlex = new PersonAdvanced("Alex", 1970, 7300.0);

        if (persBert.compareTo(persAlex) > 0) {
            System.out.println(persBert.getName() + " was born after " + persAlex.getName());
        }

    }

}
