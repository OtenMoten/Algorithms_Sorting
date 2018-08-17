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
public class BubbleSort implements ISort {

    @Override
    public int[] sort(int[] intArray) {

        int iSaveInt;

        for (int i = 1; i < intArray.length; i++) {

            for (int j = 0; j < intArray.length - i; j++) {

                if (intArray[j] > intArray[j + 1]) {
                    iSaveInt = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = iSaveInt;
                }
            }
        }
        return intArray;

    }

    @Override
    public long[] sort(long[] longArray) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
