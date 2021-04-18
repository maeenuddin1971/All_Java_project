package hackerrank_hackerland_radio_transmitters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Hackerrank_Hackerland_Radio_Transmitters {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int t=r.nextInt();
        
        
        int m=r.nextInt();
        
        int[] p=new int[t];
        int min=Integer.MAX_VALUE;
        Map<Integer,Integer>kj=new HashMap<>();
        int max=0;
        for(int i=0;i<t;i++)
        {
          p[i]=r.nextInt();
          if(min>p[i])
          {
            min=p[i];
          }
          
          if(max<p[i])
          {
            max=p[i];
          }
          kj.put(p[i],max);
        }
        
        //System.out.println(min+" "+max);
        
        
        int gf=max-min+1;
        
        //System.out.println(gf);
        
        //int hb=2*m+1;
        
        //System.out.println(hb);
        int sum=0;
        
        List<Integer>mn=new ArrayList<>();
        for(int u=min;u<=max;u++)
        {
            mn.clear();
            if(kj.containsKey(u))
            {
              mn.add(u);
              for(int b=0;b<m;b++)
              {
                u++;
                mn.add(u);
              }
              if(kj.containsKey(mn.get(mn.size()-1)))
              {
                  sum++;
                  u=u+m;
              }
              else
              {
                  sum++;
              }
            }
            
            
        }
        
       System.out.println(sum);
        
        
        
    }
    
}
