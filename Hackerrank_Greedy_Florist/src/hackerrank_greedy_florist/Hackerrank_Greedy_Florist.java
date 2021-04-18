package hackerrank_greedy_florist;

import java.util.Arrays;
import java.util.Scanner;

public class Hackerrank_Greedy_Florist {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       
       int n=r.nextInt();
       int k=r.nextInt();
       
       int[] p=new int[n];
       
       //long bh=(long) Math.pow(2,30);
       //System.out.println(bh);
       
       for(int i=0;i<n;i++)
       {
         p[i]=r.nextInt();
       }
       
       Arrays.sort(p);
       int kj=0;
       long sum=0;
       for(int u=p.length-1;u>=0;u--)
       {
           if(kj==k)
           {
             break;
           }
           else
           {
             sum=sum+p[u];
           }
           kj++;
       }
       //System.out.println(sum);
       int m=n-k;
       int kp=2;
       for(int hg=m-1;hg>=0;)
       {
          for(int np=0;np<k;np++)
          {
            try
            {
            //System.out.println(sum);
            sum=sum+p[hg]*kp;
            hg--;
            }
            catch(Exception ju)
            {
              break;
            }
          }
          kp++;
          
       }
       System.out.println(sum);
       
       
       
       
    }
    
}
