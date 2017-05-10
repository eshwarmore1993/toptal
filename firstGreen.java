import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int seed = 1;
        int count = 0;
        while(true){
            if(count>=input)
                break;
            else{
                for(int i=0;i<seed;i++){
                    
                    if(count>=input)
                        break;
                    System.out.println("Stack");
                    count++;
                }
                for(int i=0;i<seed;i++){
                    
                    if(count>=input)
                        break;
                    System.out.println("Green");
                    count++;
                }
            }
            seed++;
        }
    }
}
