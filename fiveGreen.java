import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);

        int females = sc.nextInt();
        int males = sc.nextInt();
        int[] femaleHeights = new int[females];
        int[] maleHeights = new int[males];
        for (int i = 0; i < females; i++) {
            femaleHeights[i] = sc.nextInt();
        }

        for (int i = 0; i < males; i++) {
            maleHeights[i] = sc.nextInt();
        }

        Arrays.sort(femaleHeights);
        Arrays.sort(maleHeights);
        int marrCount = 0;
        for (int i = 0, j = 0; i < males && j < females; i++) {
            int heightDiff = maleHeights[i] - femaleHeights[j];
            if (heightDiff > 0 && heightDiff <= 4) {
                marrCount++;
                j++;
            }
            if(heightDiff > 4){
                j++;
                i--;
            }
        }
        System.out.println(marrCount);
    }
}
