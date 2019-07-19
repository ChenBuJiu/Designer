package com.sort;

import com.util.RandomArray;

/**
 * @author evans
 * @create 2019-06-11 2019/6/11
 * 稳定性 稳定
 * 空间复杂度 O(1)
 * 时间复杂度
 * 1.顺序
 * 2.逆序
 * 3.普通情况
 **/
public class InsertSort {
    public static void sort(int[] array){
        int len = array.length;
        // 临时存放待插入元素的变量
        int temp, i , j;
        for (i = 1; i < len; i++) {
            if (array[i] < array[i-1]){
                temp = array[i];
                j = i-1;
                while (j >= 0 && temp < array[j]){
                    array[j+1] = array[j];
                    j--;
                }
                array[j+1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] randomArray = RandomArray.getRandomArray(100);
        RandomArray.print(randomArray);
        InsertSort.sort(randomArray);
        RandomArray.print(randomArray);
    }
}
