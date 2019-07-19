package com.sort;

import com.util.RandomArray;

/**
 * @author evans
 * @create 2019-06-11 2019/6/11
 * --
 **/
public class SelectSort {
    public static void sort(int[] array){
        int len = array.length;
        int temp, min;
        for (int i = 0; i < len - 1; i++) {
            min = i;
            for (int j = i + 1; j < len; j++) {
                if (array[min] > array[j]){
                    min = j;
                }
            }
            if (min != i){
                temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] randomArray = RandomArray.getRandomArray(10);
        RandomArray.print(randomArray);
        SelectSort.sort(randomArray);
        RandomArray.print(randomArray);
    }
}
