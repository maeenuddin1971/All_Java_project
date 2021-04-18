package hackerrank_find_the_median;

import java.util.Arrays;
import java.util.Scanner;

public class Hackerrank_Find_the_Median {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int t=r.nextInt();
        
        int[] m=new int[t];
        
        for(int y=0;y<t;y++)
        {
          m[y]=r.nextInt();
        }
        Arrays.sort(m);
        System.out.println(m[(m.length)/2]);
        
    }
    
}
