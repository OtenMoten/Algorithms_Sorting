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
public class PersonAdvanced extends Person implements Comparable<Person> {

    public PersonAdvanced(String newName, int newDate, double newLoan) {
        super(newName, newDate, newLoan);
    }

    @Override
    public int compareTo(Person inputPerson) {
        return this.getJahr().compareTo(inputPerson.getJahr());
    }

}
