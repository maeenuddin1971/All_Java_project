package codeforces_cofee_break_2;

import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_Cofee_break_2 {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int t=r.nextInt();
        int cv=r.nextInt();
        int sx=r.nextInt();
        
        
        int[] a=new int[t];
        int[] it=new int[t];
        for(int az=0;az<t;az++)
        {
            a[az]=r.nextInt();
            it[az]=a[az];
        }
        Arrays.sort(it);
        int sum=sx;
        for(int s=0;s<t;s++)
        {
           int e=it[s]; 
           sum=sum+e;
           for(int ds=0;ds<t;ds++)
           {
               if(sum<it[ds])
               {
                   sum=sum+it[ds]+1;
               }
           }
        }
        
        
        
    }
    
}
