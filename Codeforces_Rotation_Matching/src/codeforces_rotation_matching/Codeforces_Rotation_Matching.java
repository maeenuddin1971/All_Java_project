package codeforces_rotation_matching;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Codeforces_Rotation_Matching {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       
       int n=r.nextInt();
       int[] p=new int[n];
       int[] m=new int[n];
       Map<Integer,Integer>ph=new HashMap<>();
       Map<Integer,Integer>mh=new HashMap<>();
       for(int i=0;i<n;i++)
       {
         p[i]=r.nextInt();
         ph.put(p[i],i+1);
       }
       
       for(int i=0;i<n;i++)
       {
         m[i]=r.nextInt();
         mh.put(m[i], i+1);
       }
       
       //System.out.println(ph);
       //System.out.println(mh);
       Map<Integer,Integer>rt=new HashMap<>();
       int max=0;
       for(int i=0;i<n;i++)
       {
        if(ph.get(p[i])<mh.get(p[i]))
        {
            int k=n-mh.get(p[i]);
            int hj=ph.get(p[i]);
            int u=k+hj;
            if(rt.containsKey(u))
            {
              rt.put(u,rt.get(u)+1);
            }
            else
            {
              rt.put(u,1);
            }
            if(max<rt.get(u))
            {
              max=rt.get(u);
            }
            
        }
        else
        {
           int u=ph.get(p[i])-mh.get(p[i]);
           
            if(rt.containsKey(u))
            {
              rt.put(u,rt.get(u)+1);
            }
            else
            {
              rt.put(u,1);
            }
            
            if(max<rt.get(u))
            {
              max=rt.get(u);
            }
        }
       }
      // System.out.println(rt);
       System.out.println(max);
    }
    
}
