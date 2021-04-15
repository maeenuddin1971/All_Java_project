package codeforces_big_vova;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Codeforces_Big_Vova {
    
    
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       
       int tg=r.nextInt();
       
       for(int yf=0;yf<tg;yf++)
       {
       Map<Integer,List<Integer>>pk=new HashMap<>();
       int n=r.nextInt();
       List<Integer>bh=new ArrayList<>();
       
       int[] p=new int[n];
       int high=0;
       int gs=0;
       for(int i=0;i<n;i++)
       {
          p[i]=r.nextInt();
          if(p[i]>high)
          {
            high=p[i];
          }
       }
       //System.out.println(high);
       
       
       for(int i=0;i<n;i++)
       {
         if(high!=p[i])
         {
             int hf=gcd(high,p[i]);
            // System.out.println(hf);
             
             List<Integer>pj=pk.get(hf);
             
             if(pj==null)
             {
               bh.add(hf);
               pj=new ArrayList<>();
               pj.add(p[i]);
               pk.put(hf,pj);
             }
             else
             {
               pj.add(p[i]);
               pk.put(hf,pj);
             }
         }
         else
         {
           gs++;
         }
       }
       //System.out.println(bh);
       Collections.sort(bh);
      // System.out.print(high+" ");
       for(int ud=bh.size()-1;ud>=0;ud--)
       {
           List<Integer>fr=pk.get(bh.get(ud));
           System.out.println(fr+" "+bh.get(ud));
           /*for(int g=0;g<fr.size();g++)
           {
             System.out.print(fr.get(g)+" ");
           }*/
           
       }
       
       for(int ue=0;ue<gs-1;ue++)
       {
           System.out.print(high+" ");
       }
       
       System.out.println();
    }
       
    }
    
    public static int gcd(int a,int b)
    {
        if(b==0)
        {
          return a;
        }
        return gcd(b,a%b);
    }
    
}
