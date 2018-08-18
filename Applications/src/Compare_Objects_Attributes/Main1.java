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
import java.util.ArrayList;
import java.util.TreeSet;

public class Main1 {

    public static void main(String[] args) {
        Student s100 = new Student(100, "Kurt", "12.12.1990");
        Student s101 = new Student(101, "Karl", "23.04.1991");
        Student s102 = new Student(102, "Karla", "14.02.1992");
        Student s103 = new Student(103, "Sahra", "04.12.1993");
        Student s104 = new Student(104, "Sarah", "30.11.1994");

        ArrayList<Student> liste = new ArrayList<>();
        liste.add(s100);
        liste.add(s101);
        liste.add(s102);
        liste.add(s103);
        liste.add(s104);
        liste.add(s101);

        TreeSet<Student> set
                = new TreeSet<>(new StudentComparatorName());
        set.addAll(liste);
        for (Student stud : set) {
            System.out.println(stud);
        }
    }

}
