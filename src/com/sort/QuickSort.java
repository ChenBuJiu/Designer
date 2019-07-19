package com.sort;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;
import com.util.RandomArray;

import java.util.function.LongFunction;

/**
 * @author evans
 * @create 2019-06-12 2019/6/12
 * --
 **/
public class QuickSort {
    public static void sort(int[] array, int left, int right){
        // 子数组长度大于1的时候递归排序
        if (left < right){
            int pivot = partition(array, left, right);
            sort(array, left, pivot - 1);
            sort(array, pivot + 1, right);
        }
    }
    public static  int partition(int[] array, int left, int right){
        // 基准元素默认为子数组左边第一个元素，存起来
        int pivot = array[left];
        // 排序，从小到大
        // 光标从两侧向中间移动，终止条件就是两侧光标碰头
        while (left < right){
            while (left < right && pivot <= array[right]) {
                right--;
            }
            if (left < right){
                // 从右边找到了比基准元素小的元素，交换它们
                array[left++] = array[right];
            }
            while (left < right && pivot >= array[left]){
                left++;
            }
            if (left < right){
                // 从左边找到了比基准元素大的元素，交换它们
                array[right] = array[left];
            }
        }
        // 将备份的基准元素填入到最后的位置
        array[left] = pivot;
        return left;
    }
    public static void main(String[] args) {
        int[] randomArray = RandomArray.getRandomArray(10);
        RandomArray.print(randomArray);
        QuickSort.sort(randomArray, 0, randomArray.length - 1);
        RandomArray.print(randomArray);
    }
}
