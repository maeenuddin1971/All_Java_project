package codeforces_unique_bid_auction;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Codeforces_Unique_Bid_Auction {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int hw=r.nextInt();
        for(int hs=0;hs<hw;hs++)
        {
        int n=r.nextInt();
        int[] p=new int[n];
        Map<Integer,Integer>pk=new HashMap<>();
        Map<Integer,Integer>fx=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            p[i]=r.nextInt();
            
            if(!pk.containsKey(p[i]))
            {
             pk.put(p[i],1);
             fx.put(p[i],i+1);
            }
            else
            {
             pk.put(p[i],pk.get(p[i])+1);
            }
            
        }
        
        //System.out.println(pk);
        int hc=0;
        for(int ih=1;ih<=n;ih++)
        {
          if(pk.containsKey(ih)&&pk.get(ih)==1)
          {
            System.out.println(fx.get(ih));
            hc=1;
            break;
          }
        }
        
        if(hc==0)
        {
          System.out.println("-1");
        }
        
        
        
        
        
        
    }
    
}
}