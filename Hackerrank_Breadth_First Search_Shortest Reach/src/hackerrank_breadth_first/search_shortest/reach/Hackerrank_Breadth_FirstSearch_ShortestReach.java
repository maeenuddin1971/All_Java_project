package hackerrank_breadth_first.search_shortest.reach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Hackerrank_Breadth_FirstSearch_ShortestReach {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int d=r.nextInt();
        
        for(int gs=0;gs<d;gs++)
        {
        int n=r.nextInt();
        
        int v=r.nextInt();
     
        List<Integer>man[]=new LinkedList[n+1];
        
        for(int i=0;i<=n;i++)
        {
          man[i]=new LinkedList<>();
        }
        
        
        
        for(int i=0;i<v;i++)
        {
         int m=r.nextInt();
         int u=r.nextInt();
         
         man[m].add(u);
         man[u].add(m);
         
        }
        
        
        /*for(int i=0;i<=n;i++)
        {
            System.out.println(man[i]);
        }*/
        int hb=r.nextInt();
        Map<Integer,Integer>km=new HashMap<>();
        
        km.put(hb,0);
        List<Integer>ky=new ArrayList<>();
        List<Integer>f=new ArrayList<>();
        for(int gh=0;gh<man[hb].size();gh++)
        {
           ky.add(man[hb].get(gh));
           km.put(man[hb].get(gh),6);
        }
        int fx=0;
        int sum=1;
        for(;;)
        {
          sum++;
          for(int bq=0;bq<ky.size();bq++)
          {
            int kg=ky.get(bq);
            //System.out.println(kg);
            for(int fr=0;fr<man[kg].size();fr++)
            {
              if(!km.containsKey(man[kg].get(fr)))
              {
                f.add(man[kg].get(fr));
                km.put(man[kg].get(fr),sum*6);
                
                //System.out.println(man[kg].get(fr));
              }
            }
          }
          
          
            if(ky.isEmpty())
            {
              break;
            }
          
            ky.clear();
          
            for(int ba=0;ba<f.size();ba++)
            {
              ky.add(f.get(ba));
            }
            f.clear();
            
            
         fx++;
         
         if(fx==n)
         {
           break;
         }
        }
        
        //System.out.println(km);
        
        
        for(int gf=0;gf<=n;gf++)
        {
          if(hb!=gf&&gf!=0)
          {
            if(km.containsKey(gf))
            {
              System.out.print(km.get(gf)+" ");
            }
            else
            {
              System.out.print("-1"+" ");
            }
          }
        }
        
        
        
       System.out.println(); 
        
    }
    
}
}