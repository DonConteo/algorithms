package com.company;

import java.util.Arrays;

public class SortAlgorithms {

    static int iteration = 0;

    private void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public void bubbleSort(int[] incomeArray) {
        int[] array = incomeArray;
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i-1);
                    needIteration = true;
                    iteration++;
                    System.out.println("#" + iteration + " - " + Arrays.toString(array));
                }
            }
        }
        System.out.println("Result - " + Arrays.toString(array) + ", Iterations = " + iteration);
    }

    public void quickSort(int[] array, int leftBorder, int rightBorder) {
        int leftIndex = leftBorder;
        int rightIndex = rightBorder;
        int pivot = array[(leftIndex + rightIndex) / 2];
        do {
            while (array[leftIndex] < pivot) {
                leftIndex++;
            }
            while (array[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(array, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
            iteration++;
            System.out.println("#" + iteration + " - " + Arrays.toString(array));
        }
        while (leftIndex <= rightIndex);
        if (leftIndex < rightBorder) {
            quickSort(array, leftIndex, rightBorder);
        }
        if (leftBorder < rightIndex) {
            quickSort(array, leftBorder, rightIndex);
        }
        System.out.println("Result - " + Arrays.toString(array) + ", Iterations = " + iteration);
    }
}
