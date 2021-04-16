package codeforces_killjoy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Codeforces_Killjoy {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int y=r.nextInt();
        for(int hw=0;hw<y;hw++)
        {
        int t=r.nextInt();
        int m=r.nextInt();
        
        int[] p=new int[t];
        int uh=0;
        List<Integer>pk=new ArrayList<>();
        int gh=0;
        int ip=0;
        for(int i=0;i<t;i++)
        {
         p[i]=r.nextInt();
         if(m!=p[i])
         {
           gh=1;
         }
         if(m==p[i])
         {
         ip=1;
         }
         
         int gf=p[i]-m;
         pk.add(p[i]-m);
         if(gf!=0)
         {
           uh++;  
         }
         
        }
        
        //System.out.println(pk);
        
        //for(int u=0;u)
        
        if(gh==0)
        {
            System.out.println(0);
        }
        else
        {
          if(uh==1)
          {
            System.out.println(1);
          }
          else
          {
             int hr=0;
             for(int uy=0;uy<pk.size();uy++)
             {
               hr=hr+pk.get(uy);
             }
             if(hr==0)
             {
               System.out.println(1);
             }
             else
             {
              if(ip==1)
              System.out.println(1);
              else
              System.out.println(2);
             }
              
          }
        }
        
        
        
        
        
    }
    
}
}