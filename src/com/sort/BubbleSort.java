package com.sort;

import com.util.RandomArray;

/**
 * @author evans
 * @create 2019-06-12 2019/6/12
 **/
public class BubbleSort {
    public static void sort(int[] array){
        int len = array.length;
        int temp, i, j;
        for (i = 0; i < len - 1; i++) {
            for (j = 0; j < len - i - 1; j++) {
                if (array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] randomArray = RandomArray.getRandomArray(10);
        RandomArray.print(randomArray);
        BubbleSort.sort(randomArray);
        RandomArray.print(randomArray);
    }
}
