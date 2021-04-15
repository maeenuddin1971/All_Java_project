package codeforces_big_vova_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Codeforces_Big_vova_2 {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int yq=r.nextInt();
        
        for(int pd=0;pd<yq;pd++)
        {
        int n=r.nextInt();
        List<Integer>bh=new ArrayList<>();
        Map<Integer,List<Integer>>pk=new HashMap<>();
        
        int[] np=new int[n];
        int high=0;
        Map<Integer,Integer>mk=new HashMap<>();
        Map<Integer,Integer>k=new HashMap<>();
        int highp=0;
        
        for(int i=0;i<n;i++)
        {
          np[i]=r.nextInt();
          
          if(high<np[i])
          {
             high=np[i];
             highp=i;
          }
        }
        bh.add(high);
        //System.out.println(high);
        
        //System.out.println(highp);
        mk.put(highp,high);
        List<Integer>pt=new ArrayList<>();
        
        pt.add(high);
        pk.put(high,pt);
        
        int gx=0,m=0;
        for(int i=0;i<n;i++)
        {
          gx=0;
          for(int kj=0;kj<n;kj++)
          {
              if(!mk.containsKey(kj))
              {
                int hy=gcd(high,np[kj]);
               // System.out.println("robi "+high+" "+np[kj]+" "+hy);
                if(gx<=hy)
                {
                gx=hy;
                m=kj;
                }
                
              }
          }
          
          List<Integer>pr=pk.get(gx);
          if(pr==null)
          {
            bh.add(gx);
            pr=new ArrayList<>();
            pr.add(np[m]);
            pk.put(gx,pr);
          }
          else
          {
            pr.add(np[m]);
            pk.put(gx, pr);
          }
          
          high=gx;
         mk.put(m,gx);
        }
        //System.out.println(mk);
        //System.out.println(bh);
        
        
        for(int uy=0;uy<bh.size();uy++)
        {
            if(bh.get(uy)!=0)
            {
              //System.out.println(pk.get(bh.get(uy)));
                List<Integer>pa=pk.get(bh.get(uy));
                for(int up=0;up<pa.size();up++)
                {
                   System.out.print(pa.get(up)+" "); 
                }
            }
        }
       System.out.println(); 
    }
    }
    
    
    public static int gcd(int a,int b)
    {
        if(b==0)
        {
          return a;
        }
        return gcd(b,a%b);
    }
    
    
    
    
}
