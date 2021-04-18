package hackerrank_beautiful_pairs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Hackerrank_Beautiful_Pairs {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int n=r.nextInt();
        
        int[] p=new int[n];
        int[] m=new int[n];
        Map<Integer,Integer>ps=new HashMap<>();
        Map<Integer,Integer>ms=new HashMap<>();
        Map<Integer,Integer>man=new HashMap<>();
        List<Integer>km=new ArrayList<>();
        List<Integer>sm=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
          p[i]=r.nextInt();
          if(ps.containsKey(p[i]))
          {
            ps.put(p[i],ps.get(p[i])+1);
          }
          else
          {
            ps.put(p[i],1);
            km.add(p[i]);
          }
        }
        int sum=0;
        
        
        
        for(int u=0;u<n;u++)
        {
          m[u]=r.nextInt();
          
          
          if(ms.containsKey(m[u]))
          {
            ms.put(m[u],ms.get(m[u])+1);
          }
          else
          {
            ms.put(m[u],1);
            sm.add(m[u]);
          }
          
          if(ps.containsKey(m[u]))
          {
            if(ps.get(m[u])>=1&&ms.get(m[u])>=1)
            {
              sum++;
              ms.put(m[u],ms.get(m[u])-1);
              ps.put(m[u],ps.get(m[u])-1);
            }
          }
          
        }
        /*System.out.println(ms);
        System.out.println(ps);
        System.out.println(sum);
        System.out.println(km);*/
        
        if(sum==n)
        {
          sum--;
        }
        
        int robi=0;
        for(int hb=0;hb<sm.size();hb++)
        {
          if(ms.get(sm.get(hb))!=0)
          {
            robi=1;
            break;
          }
        }
        
        if(robi==1)
        {
        for(int y=0;y<km.size();y++)
        {
           if((ps.get(km.get(y))>0))
           {
             sum++;
             break;
           }
        }
        }
        System.out.println(sum);
        
    }
    
}
