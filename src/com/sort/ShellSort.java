package com.sort;

import com.util.RandomArray;

/**
 * @author evans
 * @create 2019-06-11 2019/6/11
 * --
 **/
public class ShellSort {
    public static void sort(int[] array){
        int len = array.length, block, i, j, temp;
        // 增量
        int gap = 2;
        for (block =len / gap;block >= 1; block /= gap){
            for (i = block; i < len; i++){
                temp = array[i];
                j = i - block;
                while (j >= 0 && temp < array[j]){
                    array[j + block] = array[j];
                    j = j - block;
                }
                array[j + block] = temp;
            }
        }
    }


    public static void main(String[] args) {
        int[] randomArray = RandomArray.getRandomArray(10);
        RandomArray.print(randomArray);
        ShellSort.sort(randomArray);
        RandomArray.print(randomArray);
    }
}
