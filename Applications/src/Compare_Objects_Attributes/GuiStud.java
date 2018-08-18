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
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Comparator;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GuiStud extends JFrame implements ActionListener {

    private JButton bMnr = new JButton("mnr");
    private JButton bName = new JButton("Name");
    private JButton bGeb = new JButton("Gebdat");

    public GuiStud() {
        this.setTitle("GUI for Students");
        this.setLocation(800, 600);
        this.setLayout(new FlowLayout());
        this.add(bMnr);
        this.add(bName);
        this.add(bGeb);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		this.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);;
//			}
//		});
        bMnr.addActionListener(this);
        bName.addActionListener(this);
        bGeb.addActionListener(this);

        this.pack();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bMnr) {
            Comparator<?> comp = new StudentComparatorMnr();
            ausgabe(comp);
        }
        if (e.getSource() == bName) {
            Comparator comp = new StudentComparatorName();
            ausgabe(comp);

        }
        if (e.getSource() == bGeb) {
            Comparator comp = new StudentComparatorGebDat();
            ausgabe(comp);
        }

    }

    void ausgabe(Comparator comp) {
        TreeSet<Student> set = new TreeSet<>(comp);
        set.addAll(new Students());
        for (Student stud : set) {
            System.out.println(stud);
        }

        System.out.println();

    }

}
