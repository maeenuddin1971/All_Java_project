package hackerrank_candies;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hackerrank_Candies {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int n=r.nextInt();
        
        
        int[] p=new int[n];
        
        Map<Integer,Integer>km=new HashMap<>();
        Map<Integer,Integer>sm=new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
          p[i]=r.nextInt();
        }
        
        for(int i=0;i<n-1;i++)
        {
          if(p[i]>p[i+1])
          {
            int np=1;
            for(int hb=i+1;hb<n-1;hb++)
            {
                if(p[hb]<=p[hb+1])
                {
                  //System.out.println("maeen");
                  break;
                }
                np++;    
            }
            km.put(i,np+1);
            i=i+np;
          }
        }
        System.out.println("this ");
        System.out.println(km);
        int sum=0;
        int bg=0;
        int nb=0;
        for(int i=0;i<n;i++)
        {
           if(km.containsKey(i))
           {
             //System.out.println(i);
            // break;
             int man=km.get(i);
             if(man<=nb)
             {
               man=nb+1;
               System.out.println("maen");
               //System.out.println(i);
               System.out.print(man+" ");
               
               for(int nf=man-1;nf>0;nf--)
               {
                 i++;
                 System.out.print(nf+" ");
               }
             }
             else
             {
               //System.out.println(i);
               for(int nf=man-1;nf>0;nf--)
               {
                 i++;
                 System.out.print(nf+" ");
               }
             }
             nb=0;
           }
           else
           {
            nb++;
            System.out.print(nb+" ");
            sm.put(i,nb);
           }
        }
        
    }
    
}
