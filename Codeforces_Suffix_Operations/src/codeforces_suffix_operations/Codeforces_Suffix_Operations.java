package codeforces_suffix_operations;

import java.util.Scanner;

public class Codeforces_Suffix_Operations {
    public static void main(String[] args) {
        
        Scanner r=new Scanner(System.in);
        
        int t=r.nextInt();
        
        int[] p=new int[t];
        int dif=0;
        for(int uh=0;uh<t;uh++)
        {
          p[uh]=r.nextInt();
          if(uh>0)
          {
            dif=dif+Math.abs(p[uh]-p[uh-1]);
          }
          
        }
        System.out.println(dif);
        int gf=0;
        int th=0;
        for(int uh=0;uh<t;uh++)
        {
          if(uh==0)
          {
            if(p[uh]>p[uh+1])
            {
                gf=dif-Math.abs((p[uh]-p[uh+1]));
            }
            else if(p[uh]<p[uh+1])
            {
                gf=dif-((p[uh+1]-p[uh])+Math.abs(p[uh]-p[uh+2]));
            }
          }
          
          if(uh==t-1)
          {
            if(p[uh]<p[uh-1])
            {
               //th=dif-((p[uh-1]-p[uh])+Math.abs(p[uh]-p[uh-2]));
            }
          }
          
        }
        
        System.out.println(gf);
        System.out.println(th);
        
    }
    
    public int red(int[] k,int hf)
    {
        if()
    }
    
}
