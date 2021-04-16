package codeforces_napoleon_cake;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Codeforces_Napoleon_Cake {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int pk=r.nextInt();
        
        for(int pj=0;pj<pk;pj++)
        {
        int t=r.nextInt();
        
        int[] h=new int[t];
        StringBuilder dr=new StringBuilder();
        Map<Integer,Integer>pn=new HashMap<>();
        for(int ih=0;ih<t;ih++)
        {
            h[ih]=r.nextInt();
        }
        int mif=0;
        int gc=0;
        for(int ik=t-1;ik>=0;ik--)
        {
          int nh=h[ik];
          
          if(nh!=0)
          {
           gc=nh;
           nh--;
           pn.put(ik, nh);
           if(dr.length()==0)
            dr.append("1").append(" ");
           else
           {
           dr.append("1").append(" ");
           }
           
           for(int ht=1;ht<gc;ht++)
           {
            try
            {
            ik--;
            if(h[ik]!=0)
            {
            pn.put(ik, ht);
            dr.append("1").append(" ");
            //System.out.println(h[ik]);
            nh--;
            if(h[ik]>nh+1)
            {
            //System.out.println("hete "+nh);
            nh=h[ik];
            //System.out.println("gc ius "+gc);
            //System.out.println("gc id "+nh);
            gc=gc+nh-1;
            
            //System.out.println(gc);
            }
            }
            else
            {
              //pn.put(ik, ht);
              dr.append("1").append(" ");
              nh--;
            }
            }
            catch(Exception jg)
            {
                
            }
            //ik--;
           }
          }
          else
          {
            if(dr.length()==0)
            dr.append("0").append(" ");
            else
            dr.append("0").append(" ");
          }
           
           
          
        }
        
        System.out.println(dr.reverse().toString().trim());
        
        /*for(int ui=0;ui<t;ui++)
        {
            if(pn.containsKey(ui))
            {
                System.out.print(1+" ");
            }
            else
            {
                System.out.print("0"+" ");
            }
        }
        System.out.println();*/
        
        
    }
    
}
}