/**
 * This application compares several Student-objects each other
 * by different attributes and will give a sorted output.
 *
 * Enjoy the course and feel free to contribute.
 */
package Compare_Objects_Attributes;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
import java.util.Comparator;

class StudentComparatorMnr implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getID().compareTo(o2.getID());
    }
}

class StudentComparatorName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class StudentComparatorGebDat implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getDate().compareTo(o2.getDate());
    }
}
