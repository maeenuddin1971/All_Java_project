
package codeforces_decryption;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Codeforces_Decryption {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int us=r.nextInt();
        
        for(int gx=0;gx<us;gx++)
        {
        int t=r.nextInt();
        
        Map<Integer,Integer>pk=new HashMap<>();
         Map<Integer,Integer>zk=new HashMap<>();
        List<Integer>pg=new ArrayList<>();
        List<Integer>p=new ArrayList<>();
        pk.put(t, t);
        pg.add(t);
        
        for(int uc=2;uc<=t;uc++)
        {
          if(pk.containsKey(uc)||pk.containsKey(t/uc))
          {
            break;
          }
          if(t%uc==0)
          {
            if(uc==t/uc)
            {
              pk.put(uc,1);  pg.add(uc);
              continue;
            }
            pg.add(uc);
            pg.add(t/uc);
            pk.put(uc,1);
            pk.put(t/uc, uc);
          }
        }
        
        //System.out.println(pg);
        /*pg.clear();
        pg.add(10);
        pg.add(4);
        pg.add(2);
        pg.add(6);*/
        int ga=0;
        int hw=0;
        for(int uc=0;uc<pg.size();uc++)
        {
          try
          {
          if(gcd(pg.get(uc),pg.get(uc+1))==1)
          {
            //System.out.println(pg.get(uc)+" "+pg.get(uc+1));
            ga=1;
            break;
            /*if(!zk.containsKey(uc))
            {
            p.add(pg.get(uc));
            zk.put(uc, uc);
            }
            p.add(lcm(pg.get(uc),pg.get(uc+1)));
            if(!zk.containsKey(uc+1))
            {
            p.add(pg.get(uc+1));
            zk.put(uc+1, uc);
            }
            hw=0;*/
          }
          else
          {
            if(!zk.containsKey(uc))
            {
            p.add(pg.get(uc));
            zk.put(uc, uc);
            }
            //p.add(pg.get(uc+1));
          }
          }
          catch(Exception jv)
          {
            if(!zk.containsKey(uc))
            {
              p.add(pg.get(uc));
            }
          }
          
          
        }
        
        //System.out.println(p);
        
        
        
        for(int uc=0;uc<pg.size();uc++)
        {
          System.out.print(pg.get(uc)+" ");
        }
        System.out.println();
        System.out.println(ga);
        //System.out.println("GCD of two numbers "+lcm(15,20));
       // System.out.println();
    }
        
    }
    
    public static int lcm(int a,int b)
    {
      return (a/gcd(a,b))*b;  
    }
    
    public static int gcd(int a,int b)
    {
       if(a==0)
           return b;
       return gcd(b%a,a);
    }
    
    
    
    
    
}
