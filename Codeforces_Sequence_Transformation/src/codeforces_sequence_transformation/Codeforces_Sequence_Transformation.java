package codeforces_sequence_transformation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Codeforces_Sequence_Transformation {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       
       int ub=r.nextInt();
       
       for(int hw=0;hw<ub;hw++)
       {
       int t=r.nextInt();
       
       int[] h=new int[t];
       
       for(int i=0;i<t;i++)
       {
         h[i]=r.nextInt();
       }
       
       Map<Integer,Integer>pk=new HashMap<>();
       Map<Integer,Integer>pc=new HashMap<>();
       List<Integer>pm=new ArrayList<>();
       int hd=0;
       pk.put(h[0],1);
       pm.add(h[0]);
       for(int yh=1;yh<t;yh++)
       {
         if(h[0]!=h[yh])
         {
            break; 
         }
         else
         {
            hd++;
         }
       }
       if(hd==t-1)
       {
         pk.put(h[0],0);
       }
       //System.out.println(hd);
       pc.put(h[0], hd);
       for(int uh=hd+1;uh<t;uh++)
       {
           if(!pk.containsKey(h[uh]))
           {
             pm.add(h[uh]);
             pk.put(h[uh],1);
             
             uh=maeen(h,uh);
             //System.out.println("uh is "+uh);
             if(uh!=t-1&&uh<t-1)
             {
               if(!pc.containsKey(h[uh]))
               {
                 pc.put(h[uh], uh);
                 pk.put(h[uh],pk.get(h[uh])+1);
               }
             }
             
           }
           else
           {
            // System.out.println(h[uh]+" is "+pk.get(h[uh]));
             pk.put(h[uh],pk.get(h[uh])+1);
             uh=maeen(h,uh);
             //System.out.println("uh is "+uh);
             if(uh!=t-1&&uh<t-1)
             {
               if(!pc.containsKey(h[uh]))
               {
                 pc.put(h[uh], uh);
                 pk.put(h[uh],pk.get(h[uh])+1);
               }
             }
             
           }
       }
       //System.out.println("pk is "+pk);
       if(pk.get(h[t-1])>1)
       {
         //System.out.println(pk.get(h[t-1]));
         pk.put(h[t-1],pk.get(h[t-1])-1);
         //System.out.println(h[t-1]);
       }
       
       
       
       
       //System.out.println(pk);
       
       //System.out.println(pm);
       //Set pm= pk.keySet();
       int bg=pk.get(pm.get(0));
       for(int bn=0;bn<pm.size();bn++)
       {
         if(bg>pk.get(pm.get(bn)))
         {
           bg=pm.get(bn);
         }
       }
       System.out.println(bg);
       
       
    }
       
    }
    
    public static int maeen(int[] p,int bd)
    {
        int gw=bd;
       // System.out.println("ami is "+p[gw]);
        for(int hx=bd;hx<p.length;hx++)
        {
            if(p[bd]==p[hx])
            {
               return gw;
            }
            else
            {
             gw++; 
            }
        }
        
        return gw;
    }
    
}
