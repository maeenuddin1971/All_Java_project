package codeforces_a_kitchen_utensils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Codeforces_A_Kitchen_Utensils {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       int n=r.nextInt();
       int t=r.nextInt();
       int[] m=new int[n];
       int[] i=new int[n];
        Map<Integer,Integer> hm =new HashMap<Integer,Integer>(); 
        List<Integer> a = new ArrayList<Integer>();
       for(int cv=0;cv<n;cv++)
       {
           m[cv]=r.nextInt();
           
       }
       
       
       
       boolean[] visit=new boolean[101];
       for(int p=1;p<=100;p++)
       {
           visit[p]=false;
       }
      
       
       
       
       
       int y;
       for(int cv=0;cv<n;cv++)
       {
           int sum=1;
           if(visit[m[cv]]==false)
           {    
           y=m[cv];
           visit[y]=true;
           for(int x=cv+1;x<n;x++)
           {
               if(y==m[x])
               {
                 sum++;  
               }
           }
           hm.put(y,sum);
           a.add(sum);
          // System.out.println(y+"="+sum);
           } 
       }
       
       Collections.sort(a);
       //System.out.println(a.get(a.size()-1));
       
       int z=a.get(a.size()-1);
       int sum2=0;
       if(t==z||t>z)
       {
           for(int q=0;q<a.size();q++)
           {
           sum2=sum2+(t-a.get(q));
           }
           if(sum2>0)
           System.out.println(sum2);
           else
               System.out.println(0);
       }
       else if(t<z)
               {
                
                  int sdf=0; 
                   
                for(int sw=2;sw<100;sw++)
                {
                    sdf=sw*t;
                    if(sdf>z||sdf==z)
                    {
                       // System.out.println(sdf);
                        break;
                    }
                }
                   
                   
              
                // int cvw=2*t;
                   
                 for(int q=0;q<a.size();q++)
                 {
                 sum2=sum2+(sdf-a.get(q));
                 }
                 if(sum2>0)
           System.out.println(sum2);
           else
               System.out.println(0);
               }
       
       
       
       
       
    }
    
    
    
    
    
}
