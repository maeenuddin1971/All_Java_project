package codeforces_array_walk;

import java.util.Scanner;

public class Codeforces_Array_Walk {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int m=r.nextInt();
        int n=r.nextInt();
        int z=r.nextInt();
        n++;
        int[] mn=new int[m];
        
        for(int i=0;i<m;i++)
        {
          mn[i]=r.nextInt();
        }
        int sum=0;
        int lh=0;
        int mb=0;
        for(int h=0;h<m;h++)
        {
         if(mb>=n)
         {
            System.out.println(sum);
            break;
         }
         try
         {
           if(lh==0)
           {
             sum=sum+mn[h];
             mb++;
             if(mn[h+1]<mn[h-1]&&mb<n)
             {
             sum=sum+mn[h-1];
             h--;
             lh=1;
             mb++;
             }
           }
           else
           {
             sum=sum+mn[h];
             lh=0;
             mb++;
             
             if(mn[h+1]<mn[h-1]&&mb<n)
             {
             sum=sum+mn[h-1];
             h--;
             lh=1;
             mb++;
             }
             
             
             
           }
         }
         catch(Exception jh)
         {
             
         }
        }
        //System.out.println(sum);
    }
    
}
