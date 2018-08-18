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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Student {

    private int myID;
    private String myName;
    private GregorianCalendar myDate;

    public Student(int newID, String newName, String newDate) {

        this.myID = newID;
        this.myName = newName;
        this.myDate = new GregorianCalendar();

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            myDate.setTime(sdf.parse(newDate));
        } catch (ParseException parseExceptionObject) {
            System.out.println(parseExceptionObject.getMessage());
        }

    }

    public Integer getID() {
        return this.myID;
    }

    public String getName() {
        return this.myName;
    }

    public GregorianCalendar getDate() {
        return this.myDate;
    }

    @Override
    public String toString() {
        return this.myName + " has ID '"
                + this.myID + "' and is born @ "
                + new SimpleDateFormat("dd.MM.yyyy").format(this.myDate.getTime());
    }

}
