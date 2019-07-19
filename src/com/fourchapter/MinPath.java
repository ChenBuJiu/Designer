package com.fourchapter;

import com.util.RandomArray;
/**
 * @author evans
 * @create 2019-06-20 2019/6/20
 * --
 **/
public class MinPath {
    public static int getMin(int[][] maxtix){
        if (maxtix == null || maxtix.length == 0 || maxtix[0] == null || maxtix[0].length == 0){
            return 0;
        }
        int row = maxtix.length;
        int col = maxtix[0].length;
        int[][] dp = new int[row][col];
        dp[0][0] = maxtix[0][0];
        for (int i = 1; i < row; i++){
            dp[i][0] = dp[i-1][0] + maxtix[i][0];
        }
        for (int i = 1; i < col; i++){
            dp[0][i] = dp[0][i-1] + maxtix[0][i];
        }
        for (int i = 1;i < row; i++){
            for (int j = 1; j < col; j++){
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]) + maxtix[i][j];
            }
        }
        RandomArray.printTwoDim(dp);
        return dp[row-1][col-1];
    }
    public static int getMinLowSpace(int[][] maxtix){
        if (maxtix == null || maxtix.length == 0 || maxtix[0] == null || maxtix[0].length == 0){
            return 0;
        }
        int row = maxtix.length;
        int col = maxtix[0].length;
        int less = Math.min(row, col);
        int more = Math.max(row, col);
        boolean flag = less == row;
        int[] dp = new int[less];
        dp[0] = maxtix[0][0];
        for (int i = 1; i < less; i++){
            dp[i] = dp[i-1] + (flag ? maxtix[i][0] : maxtix[0][i]);
        }
        for (int i = 1; i < more; i++){
            dp[0] = dp[0] + (!flag ? maxtix[i][0] : maxtix[0][i]);
            for (int j = 1; j < less; j++){
                dp[j] = Math.min(dp[j-1] ,dp[j] ) + (!flag ? maxtix[i][j] : maxtix[j][i]);
            }
        }
        RandomArray.print(dp);
        return dp[less-1];
    }

    public static void main(String[] args) {
        int row = 4;
        int col = 5;
        int[][] twoDim = RandomArray.getTwoDim(row, col);
        RandomArray.printTwoDim(twoDim);
        System.out.println("------------------------------");
        MinPath.getMin(twoDim);
        System.out.println("------------------------------");
        MinPath.getMinLowSpace(twoDim);
    }
}
