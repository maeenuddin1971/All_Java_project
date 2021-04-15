package codeforces_cancel_the_trains;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Codeforces_Cancel_the_Trains {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int mu=r.nextInt();
        
        for(int yh=0;yh<mu;yh++)
        {
        int t=r.nextInt();
        int m=r.nextInt();
        
        
        int[] p=new int[t];
        
        int[] k=new int[m];
        
        Map<Integer,Integer>hb=new HashMap<>();
        
        
        for(int u=0;u<t;u++)
        {
          p[u]=r.nextInt();
          hb.put(p[u],0);
        }
        int sum=0;
        for(int uh=0;uh<m;uh++)
        {
          
          k[uh]=r.nextInt();
          
          if(hb.containsKey(k[uh]))
          {
            sum++;
          }
        }
        
        System.out.println(sum);
        
        
    }
    
}
}