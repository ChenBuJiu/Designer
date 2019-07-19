package com.sort;

import java.util.Arrays;

/**
 * @author evans
 * @create 2019-06-11 2019/6/11
 * --
 **/
public class Sort {
    public static void main(String[] args) {

        int arr[] = {818,664,234,342,587,214,281,77,537,255};
        int temp;
        for (int i=1;i<arr.length;i++){
            //待排元素小于有序序列的最后一个元素时，向前插入
            if (arr[i]<arr[i-1]){
                temp = arr[i];
                for (int j=i;j>=0;j--){
                    if (j>0 && arr[j-1]>temp) {
                        arr[j]=arr[j-1];
                    }else {
                        arr[j]=temp;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
