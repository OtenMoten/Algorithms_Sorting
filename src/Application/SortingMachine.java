/**
 * In this package you will learn about several sorting-algorithms.
 *
 * Enjoy the course and feel free to contribute.
 */
package Application;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
import Interfaces.ISort;
import java.util.Random;

public class SortingMachine {

    private final int iSaveInt = 20;
    int[] myArray = new int[iSaveInt];
    ISort sortingAlgorithm;

    void createArray() {
        Random rand = new Random();
        for (int i = 0; i < this.iSaveInt; i++) {
            this.myArray[i] = Math.abs(rand.nextInt(10000));
        }
    }

    public int[] getUnsortedArray() {
        return this.myArray;
    }

    public int[] getSortedArray() {
        return this.sortingAlgorithm.sort(this.myArray);
    }

    public void setSortingAlgorithm(ISort newSortingAlgorithm) {
        this.sortingAlgorithm = newSortingAlgorithm;
    }

}
