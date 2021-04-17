package codefores_two_arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Codefores_Two_Arrays {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int he=r.nextInt();
        for(int hv=0;hv<he;hv++)
        {
        int n=r.nextInt();
        int t=r.nextInt();
        
        
        int[] p=new int[n];
        Map<Integer,Integer>pj=new HashMap<>();
        Map<Integer,Integer>pj2=new HashMap<>();
        Map<Integer,Integer>pg=new HashMap<>();
        Map<Integer,Integer>pg2=new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
          p[i]=r.nextInt();
          pj.put(p[i],i);
        }
        
        
        for(int i=0;i<n;i++)
        {
           int hx=t-p[i];
           
           if(hx==p[i])
           {
             pg2.put(hx, he);
           }
           else
           if(pj.containsKey(hx)&&!pj2.containsKey(hx))
           {
             pg.put(hx,hx);
             pj2.put(p[i], hx);
           }
        }
        
        //System.out.println(pg);
        
        
        for(int u=0;u<n;u++)
        {
            if(pg2.containsKey(p[u]))
            {
              System.out.print(1+" ");
              pg2.remove(p[u]);
            }
            else
            if(pg.containsKey(p[u]))
            {
               System.out.print(1+" ");
              // pg.remove(p[u]);
            }
            else
            {
              System.out.print(0+" ");
            }
        }
        System.out.println();
    }
    
}
}