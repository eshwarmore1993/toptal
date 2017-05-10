import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        int dp[][] = new Solution().countPS(str.toCharArray(),n);
        int q = scanner.nextInt();
        for (int i=0;i<q;i++)
        {
            int left = scanner.nextInt();
            int right = scanner.nextInt();
            System.out.println(dp[left-1][right-1]);
        }
    }

    private int[][] countPS(char str[],int n)
    {
        int dp[][] = new int[n][n];
        boolean P[][] = new boolean[n][n];

        for (int i= 0; i< n; i++) {
            P[i][i] = true;
            dp[i][i] = 1 ;
        }
        for (int i=0; i<n-1; i++)
        {
            dp[i][i+1]=2;
            if (str[i] == str[i+1])
            {
                P[i][i+1] = true;
                dp[i][i+1]++ ;
            }
        }

        for (int gap=2 ; gap<n; gap++)
        {

            for (int i=0; i<n-gap; i++)
            {

                int j = gap + i;

                if (str[i] == str[j] && P[i+1][j-1] )
                    P[i][j] = true;


                if (P[i][j] == true)
                    dp[i][j] = dp[i][j-1] + dp[i+1][j] + 1 - dp[i+1][j-1];
                else
                    dp[i][j] = dp[i][j-1] + dp[i+1][j] - dp[i+1][j-1];
            }
        }

        return dp;
    }
}
