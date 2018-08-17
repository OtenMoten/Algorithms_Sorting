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
public class MergeSort implements ISort {

    @Override
    public int[] sort(int[] intArray) {

        if (intArray.length > 1) {

            int midOfArray = (int) (intArray.length / 2);
            int[] leftArray = new int[midOfArray];
            int[] rightArray = new int[intArray.length - midOfArray];

            for (int i = 0; i <= leftArray.length - 1; i++) {
                leftArray[i] = intArray[i];
            }

            for (int i = midOfArray; i <= intArray.length - 1; i++) {
                rightArray[i - midOfArray] = intArray[i];
            }

            leftArray = sort(leftArray);
            rightArray = sort(rightArray);

            return merge(leftArray, rightArray);
        } else {
            return intArray;
        }
    }

    private static int[] merge(int[] leftArray, int[] rightArray) {

        int leftIndex = 0;
        int rightIndex = 0;
        int resultOfIndex = 0;

        int[] finalArray = new int[leftArray.length + rightArray.length];

        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftArray[leftIndex] < rightArray[rightIndex]) {
                finalArray[resultOfIndex] = leftArray[leftIndex];
                leftIndex += 1;
            } else {
                finalArray[resultOfIndex] = rightArray[rightIndex];
                rightIndex += 1;
            }
            resultOfIndex += 1;
        }

        while (leftIndex < leftArray.length) {
            finalArray[resultOfIndex] = leftArray[leftIndex];
            leftIndex += 1;
            resultOfIndex += 1;
        }

        while (rightIndex < rightArray.length) {
            finalArray[resultOfIndex] = rightArray[rightIndex];
            rightIndex += 1;
            resultOfIndex += 1;
        }

        return finalArray;
    }

    @Override
    public long[] sort(long[] longArray) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
