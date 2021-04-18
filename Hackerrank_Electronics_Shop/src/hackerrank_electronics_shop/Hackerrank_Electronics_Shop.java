package hackerrank_electronics_shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Hackerrank_Electronics_Shop {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int t=r.nextInt();
        int m=r.nextInt();
        int z=r.nextInt();
        List<Integer> s=new ArrayList<>();
        List<Integer> p=new ArrayList<>();
        
        for(int i=0;i<m;i++)
        {
         //s[i]=r.nextInt();
         s.add(r.nextInt());
        }
        Collections.sort(s);
        for(int y=0;y<z;y++)
        {
         //p[y]=r.nextInt();
         p.add(r.nextInt());
        }
        
        
        //Arrays.sort(p);
        Collections.sort(p);
        List<Integer>cs=new ArrayList<Integer>();
        int sum;
        int vc=0;
        
        if(m<=z||m>z)
        {
        for(int u=0;u<m;u++)
        {
         
         for(int v=z-1;v>=0;v--)
         {
          sum=s.get(u)+p.get(v);
          if(sum<t)
          {
              
           if(cs.size()==0)
           {
           cs.add(sum);
           }
           else
           {
               if(sum>cs.get(0))
               {
                cs.clear();
                cs.add(sum);               
               }
           }
           break;
          }
          if(sum==t)
          {
           vc=1;   
          }
         }
         if(vc==1)
         {
             System.out.println(t);
             break;
         }
        }
        }
        else
        {
            
        }
        
        if(vc==0&&cs.size()!=0)
        {
        System.out.println(cs.get(0));
        }
        else if(cs.size()!=1)
        {
          System.out.println(-1);
        }
        
    }
    
}
