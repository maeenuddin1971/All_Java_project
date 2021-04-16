package codeforces_k.divisible_sum;

import java.util.Scanner;

public class Codeforces_KDivisible_Sum {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int hc=r.nextInt();
        for(int ur=0;ur<hc;ur++)
        {
        int t=r.nextInt();
        
        int m=r.nextInt();
        
        if(t<=m)
        {
          if(m%t==0)
          {
              System.out.println(m/t);
          }
          else
          {
            int uh=m/t+1;
            System.out.println(uh);
          }
        }
        else
        {
           if(t%m==0)
           {
               System.out.println(1);
           }
           else
           {
               int yt=t/m;
               yt++;
               int hb=m*yt;
               //System.out.println(hb);
               int uh=hb/t+1;
               System.out.println(uh);
           }
        }
        
        
    }
    
}
}
