package com.fourchapter;

import java.util.Calendar;

/**
 * @author evans
 * @create 2019-06-19 2019/6/19
 * --
 **/
public class Fab {
    public static int FabRecursive(int n){
        if (n < 1){
            return 0;
        }else if (n == 1 || n == 2){
            return 1;
        }else{
            return FabRecursive(n-1) + FabRecursive(n-2);
        }
    }
    public static int FabNoRecursive(int n){
        if (n < 1){
            return 0;
        }else if (n == 1 || n == 2){
            return 1;
        }else{
            int[] rs = new int[n];
            rs[0] = 1;
            rs[1] = 1;
            for (int i = 2;i < n;i++){
                rs[i] = rs[i-1]+rs[i-2];
            }
            return rs[n-1];
        }
    }

    public static void main(String[] args) {
        long begin, end;
        int n = 43;
        begin = System.currentTimeMillis();
        System.out.println(FabNoRecursive(n));
        end = System.currentTimeMillis();
        System.out.println(end - begin);
        System.out.println("-----------------------------");
        begin = System.currentTimeMillis();
        System.out.println(FabRecursive(n));
        end = System.currentTimeMillis();
        System.out.println(end - begin);
    }
}
