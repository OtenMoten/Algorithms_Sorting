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
public class Person {

    private final String myName;
    private final int myDate;
    private final double myLoan;

    public Person(String newName, int newDate, double newLoan) {
        this.myName = newName;
        this.myDate = newDate;
        this.myLoan = newLoan;
    }

    public String getName() {
        return this.myName;
    }

    public Integer getJahr() {
        return this.myDate;
    }

    public Double getGehalt() {
        return this.myLoan;
    }

    @Override
    public String toString() {
        return this.myName + " : " + this.myDate + " - " + this.myLoan;
    }

}
