import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int lcm=0;
        boolean flag = false;
        for(int i=n1;i<=n1*n2;i++) {
            if(i%n1==0 && i%n2==0) {
                
                lcm=i;
                break; 
            }
        }
        
            System.out.println(lcm);
        
    }
}
