/**
 * In this package you will learn about several sorting-algorithms.
 *
 * Enjoy the course and feel free to contribute.
 */
package SortingAlgorithms;

import Interfaces.ISort;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class InsertionSort implements ISort {

    @Override
    public int[] sort(int[] intArray) {

        int iSaveInt;

        for (int i = 1; i < intArray.length; i++) {

            iSaveInt = intArray[i];

            int j = i;

            while (j > 0 && intArray[j - 1] > iSaveInt) {
                intArray[j] = intArray[j - 1];
                j--;
            }
            intArray[j] = iSaveInt;

        }
        return intArray;

    }

    @Override
    public long[] sort(long[] longArray) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
