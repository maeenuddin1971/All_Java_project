package codeforces_grid.pkg00100;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Codeforces_Grid00100 {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        
        int t=r.nextInt();
        int m=r.nextInt();
        
        int o=t*t-m;
        System.out.println(o);
        Map<Integer,Integer>ro=new HashMap<>();
        Map<Integer,Integer>cl=new HashMap<>();
        int to=0;
        int ex=0;
        if(t<o)
        {
          
          to=o/t;
          ex=o%t;
          System.out.println(to);
        }
        else
        {
          
          ex=o;
          System.out.println("maeen"+ex);
        }
        
        if(to==0&&ex==0)
        {
            for(int u=0;u<t;u++)
            {
            for(int i=0;i<t;i++)
            {
               System.out.print(1);
            }
            System.out.println();
            }
        }
        else
        {
            for(int u=0;u<t;u++)
            {
            for(int i=0;i<t;i++)
            {
               if(ro.containsKey(u)&&cl.containsKey(i))
               {
                 if(ex>ro.get(u)&&ex>cl.get(i))
                 {
                 System.out.print(0);
                 ro.put(u,ro.get(u)+1);
                 cl.put(i,cl.get(i)+1);
                 }
                 else
                 {
                   System.out.print(1);
                 }
               }
               else if(!ro.containsKey(u)&&!cl.containsKey(i))
               {
                 System.out.print(0);
                 ro.put(u, 1);
                 cl.put(i, 1);
               }
               else if(ro.containsKey(u)&&!cl.containsKey(i))
               {
                 if(ro.get(u)<ex)
                 {
                   System.out.print(1);
                   cl.put(i,1);
                 }
               }
            }
            System.out.println();
            }
        }
        
        
    }
    
}
