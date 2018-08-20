/**
 * This is a example application how to implement the selection of
 * different sorting-algorithms, selected by the user.
 *
 * Enjoy the course and feel free to contribute.
 */
package Selector_Example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class MainPerson {

    public static void main(String[] args) {

        Person person_Alpha = new Person("Bert", 1980, 2300.0);
        Person person_Beta = new Person("Carlos", 1983, 2500.0);
        Person person_Gamma = new Person("Alex", 1970, 7300.0);

        List<Person> personList = Arrays.asList(person_Alpha, person_Beta, person_Gamma);
        System.out.println("Before name sorting:\n" + personList);
        Collections.sort(personList, new PersonComparatorName());

        System.out.println();

        System.out.println("After name sorting:");
        personList.forEach((myPerson) -> {
            System.out.println(myPerson);
        });

    }

}
