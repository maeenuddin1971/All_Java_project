package codeforces_rpg_protagonist;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Codeforces_RPG_Protagonist {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int z=r.nextInt();
        
        for(int i=0;i<z;i++)
        {
        int me=r.nextInt();
        int him=r.nextInt();
        
        
        int p=r.nextInt();
        int k=r.nextInt();
        
        int h=r.nextInt();
        int f=r.nextInt();
        Map<Integer,Integer>py=new HashMap<>();
        py.put(h,p);
        py.put(f,k);
        int bz=0;
        
        
       // System.out.println(py);
        int sum=me+him;
       //System.out.println("sum is "+sum);
        int sum2=h*p+f*k;
        //System.out.println(sum2);
        if(h==f)
        {
          int ud=h+f;
          int gw=h*(p+k);
          
         // System.out.println("ud "+ud+" gw "+gw);
          
          if(sum>=gw)
          {
            System.out.println(p+k-1);
            
          }
          else
          {
            int pl=sum/h;
            
            System.out.println(pl-1);
          }
          
        }
        else if(sum>=sum2)
        {
           // System.out.println("rafik");
            System.out.println(p+k);
        }
        else
        {
            //System.out.println("maeen");
            int gc;
            int uh;
            if(h>f)
            {
               gc=f;
               uh=h;
            }
            else
            {
               gc=h;
               uh=f;
            }
            //System.out.println("minim is "+gc);
            
            int man=gc*py.get(gc);
           // System.out.println(man);
            
            if(man>=sum)
            {
                
             // System.out.println("gche"); 
              
              int rx=sum/gc;
              //System.out.println("maeen");
              System.out.println(rx-1);
              
              
              
              
            }
            else
            {
              int gf=sum-man;
              //System.out.println("gf is "+gf);
              int kgb=man/gc;
             // System.out.println(kgb);
              int hs=sum-man;
              
              int kgb2=hs/uh;
              
              //System.out.println(kgb2);
              
              System.out.println(kgb+kgb2);
              
            }
            
            
        }
        
    }
    
}
}