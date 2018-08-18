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

public class Students extends ArrayList<Student> {

    Student s100 = new Student(100, "Kurt", "12.12.1990");
    Student s101 = new Student(101, "Hans", "30.11.2000");
    Student s102 = new Student(102, "Karla", "14.02.1992");
    Student s103 = new Student(103, "Anna", "04.12.1993");
    Student s104 = new Student(104, "Sarah", "24.12.1994");

    public Students() {
        
        this.add(s100);
        this.add(s101);
        this.add(s102);
        this.add(s103);
        this.add(s103);
        this.add(s104);
        
    }

}
