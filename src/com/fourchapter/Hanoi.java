package com.fourchapter;

/**
 * @author evans
 * @create 2019-06-28 2019/6/28
 **/
public class Hanoi {
    public static void getTimes(int n){
        if (n > 0){
            fun(n, "left", "mid", "right");
        }
    }
    public static void fun(int n, String from, String mid, String to){
        if (n == 1){
            System.out.println("move from" + from + "to" + to);
        }else{
            fun(n - 1, from, to, mid);
            fun(1, from, mid , to);

            fun(n - 1, mid, from, to);
        }
    }
    public static void main(String[] args) {
    }
}
