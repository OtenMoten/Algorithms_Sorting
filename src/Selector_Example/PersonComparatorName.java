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
import java.util.Comparator;

public class PersonComparatorName implements Comparator<Person> {

    @Override
    public int compare(Person inputPerson_Alpha, Person inputPerson_Beta) {
        return inputPerson_Alpha.getName().compareTo(inputPerson_Beta.getName());
    }

}
