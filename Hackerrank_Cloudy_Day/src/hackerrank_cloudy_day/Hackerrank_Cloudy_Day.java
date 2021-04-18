package hackerrank_cloudy_day;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hackerrank_Cloudy_Day {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int t=r.nextInt();
        
        int[] citype=new int[t];
        Map<Integer,Integer>citymap=new HashMap<>();
        for(int i=0;i<t;i++)
        {
           citype[i]=r.nextInt();
        }
        int[] city=new int[t];
        
        for(int i=0;i<t;i++)
        {
            city[i]=r.nextInt();
            citymap.put(city[i],citype[i]);
        }
       // System.out.println(citymap);
        int y=r.nextInt();
        Map<Integer,Integer>cloud=new HashMap<>();
        int[] cloudcity=new int[y];
        for(int i=0;i<y;i++)
        {
          cloudcity[i]=r.nextInt();
        }
        
        int[] cloudrange=new int[y];
        int sum=0;
        Map<Integer,Integer>phw=new HashMap<>();
        Map<Integer,Integer>bd=new HashMap<>();
        int high=0;
        for(int i=0;i<y;i++)
        {
            cloudrange[i]=r.nextInt();
            int ph=cloudcity[i];
            sum=0;
            if(!cloud.containsKey(ph))
            {
            cloud.put(ph,ph);
            }
            else
            {
             cloud.remove(ph);
             bd.put(ph, sum);
            }
            if(citymap.containsKey(ph))
            sum=sum+citymap.get(ph);
             for(int gf=cloudrange[i],kh=cloudrange[i];gf>0;gf--,kh--)
             {
               int hr=ph-gf;
               int hyp=kh+ph;
               //System.out.println(hr+" "+hyp);
               if(!cloud.containsKey(hr))
               {
               cloud.put(hr,ph);
               }
               else
               {
                  cloud.remove(hr);
                  bd.put(hr, sum); 
               }
               if(!cloud.containsKey(hyp))
               {
               cloud.put(hyp,ph);
               }
               else
               {
                 cloud.remove(hyp);
                 bd.put(hyp, sum);  
               }
               
               if(citymap.containsKey(hr))
               sum=sum+citymap.get(hr);
               if(citymap.containsKey(hyp))
               sum=sum+citymap.get(hyp);
               
             }
           // System.out.println("sum "+sum);
            if(high<sum)
            {
              high=sum;
              phw.put(high,ph);
            }
            
        }
        /*System.out.println(cloud);
        System.out.println(phw);
        System.out.println(high);*/
        int sum2=0;
        for(int hx=0;hx<t;hx++)
        {
          int hz=city[hx];
          if(cloud.containsKey(hz))
          {
             if(phw.get(high)==cloud.get(hz))
             {
                 sum2=sum2+citymap.get(hz);
             }
          }
          else if(bd.containsKey(hz))
          {
              continue;
          }
          else
          {
             sum2=sum2+citymap.get(hz); 
          }
        }
        System.out.println(sum2);
        
        
    }
    
}
