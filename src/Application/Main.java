/**
 * In this package you will learn about several sorting-algorithms.
 *
 * Enjoy the course and feel free to contribute.
 */
package Application;

import SortingAlgorithms.MergeSort;
import SortingAlgorithms.InsertionSort;
import SortingAlgorithms.BubbleSort;
import java.util.Scanner;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class Main {

    public static void main(String[] args) {

        int iSaveAlgorithmNumber;
        int i = 0;

        long myStartTime = System.currentTimeMillis();

        SortingMachine mySortingMachine = new SortingMachine();
        mySortingMachine.createArray();

        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("'1' for InsertionSort \n"
                    + "'2' for BubbleSort \n"
                    + "'3' for MergeSort \n"
                    + "Choose algorithm: ");
            iSaveAlgorithmNumber = myScanner.nextInt();

            if (iSaveAlgorithmNumber == 1
                    || iSaveAlgorithmNumber == 2
                    || iSaveAlgorithmNumber == 3) {
                System.out.println();

                System.out.println("Default array: ");

                for (int myUnsortedElement : mySortingMachine.getUnsortedArray()) {
                    if (i++ % 5 == 0) {
                        System.out.println();
                    }
                    System.out.print(myUnsortedElement + " > ");
                }
                i = 0;
                System.out.println();

                System.out.println();

                if (iSaveAlgorithmNumber == 1) {
                    mySortingMachine.setSortingAlgorithm(new InsertionSort());
                }
                if (iSaveAlgorithmNumber == 2) {
                    mySortingMachine.setSortingAlgorithm(new BubbleSort());
                }
                if (iSaveAlgorithmNumber == 3) {
                    mySortingMachine.setSortingAlgorithm(new MergeSort());
                }

                System.out.println("Applyed sorting algorithm: ");
                for (int mySortedElement : mySortingMachine.getSortedArray()) {
                    if (i++ % 5 == 0) {
                        System.out.println();
                    }
                    System.out.print(mySortedElement + " > ");
                }

                System.out.println();
                System.out.println();

                System.out.println(
                        "Duration of the sorting process: \n"
                        + (System.currentTimeMillis() - myStartTime) / 1000
                        + " seconds and "
                        + (System.currentTimeMillis() - myStartTime) % 1000
                        + " milliseconds"
                );

            } else {
                System.out.println("Wrong input. Please restart the application.");
            }
        }

    }

}
