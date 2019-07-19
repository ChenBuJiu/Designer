package com.util;

import java.util.Random;

/**
 * @author evans
 * @create 2019-06-11 2019/6/11
 * --
 **/
public class RandomArray {
    public static int[] getRandomArray(int len){
        int[] array = new int[len];
        Random random = new Random();
        for (int i = 0; i < len ; i++) {
            array[i] = random.nextInt(1000);
        }
        return array;
    }
    public static int[][] getTwoDim(int m, int n){
        int[][] matrix = new int[m][n];
        Random random = new Random();
        for (int i = 0 ; i < m; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = random.nextInt(20);
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[] randomArray = RandomArray.getRandomArray(10);
        RandomArray.print(randomArray);
    }
    public static void print(int[] randomArray){
        for (int i : randomArray){
            System.out.print(i);
            System.out.print(",");
        }
        System.out.println();
    }
    public static void printTwoDim(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0 ; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
}
