package com.fourchapter;

import com.util.RandomArray;

/**
 * @author evans
 * @create 2019-06-27 2019/6/27
 **/
public class Sequence {
    public static int[] getSequence(int[] array){
        int len = array.length;
        int[] dp = new int[len];
        int[] valid = new int[len];
        dp[0] = 1;
        valid[0] = array[0];
        int l, m, r;
        int right = 0;
        for(int i = 1; i < len; i++){
            l = 0;
            r = right;
            while (l <= r){
                m = (l + r) / 2;
                if (array[i] > valid[m]){
                    l = m + 1;
                }else{
                    r = m - 1;
                }
            }
            right = Math.max(right, l);
            valid[l] = array[i];
            dp[i] = l + 1;
        }
        return dp;
    }
    public static void main(String[] args) {
        int[] array = {2,1,5,3,6,4,8,9,7};
        int[] dp = Sequence.getSequence(array);
        RandomArray.print(dp);
    }
}
