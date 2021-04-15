package codeforces_ahahahahahahahaha;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Codeforces_Ahahahahahahahaha {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int n=r.nextInt();
        for(int ue=0;ue<n;ue++)
        {
        int hf=r.nextInt();
        
        int[] hg=new int[hf];
        Map<Integer,Integer>kj=new HashMap<>();
        kj.put(0,0);
        kj.put(1,0);
        String me="";
        for(int i=0;i<hf;i++)
        {
           hg[i]=r.nextInt();
           me=me+hg[i];
           kj.put(hg[i],kj.get(hg[i])+1);
        }
       // System.out.println(kj);
        
        int hw=hf/2;
        if(hf%2!=0)
        {
          hw++;
        }
        
        if(kj.get(0)>=kj.get(1))
        {
            System.out.println(kj.get(0));
            
            for(int uh=0;uh<kj.get(0);uh++)
            {
              System.out.print(0+" ");
            }
        }
        else
        {
           int ht=kj.get(1);
          // System.out.println(ht);
           if(ht%2==0)
           {
            System.out.println(ht);
            for(int uh=0;uh<kj.get(1);uh++)
            {
              System.out.print(1+" ");
            } 
           }
           else
           {
               
               if(ht-1>=hw)
               {
                    System.out.println(ht-1);
                    for(int uh=0;uh<kj.get(1)-1;uh++)
                    {
                    System.out.print(1+" ");
                    }  
               }
               else
               {
                  int iz=0;
                  if(me.contains("00"))
                  {
                     System.out.println(ht-1+2);
                     for(int ip=0;ip<me.length();ip++)
                     {
                      try
                      {
                         if(me.charAt(ip)=='0'&&me.charAt(ip+1)=='0'&&iz==0)
                         {
                             System.out.print(0+" "+0+" ");
                             ip++;
                             iz=0;
                         }
                         if(ht>1&&me.charAt(ip)=='1')
                         {
                           System.out.print(1+" ");
                           ht--;
                         }
                      }
                      catch(Exception uh)
                      {
                          
                      }
                     }
                      
                      
                  }
                  else
                  {
                      int hp=0;
                      System.out.println(ht);
                      if(me.charAt(0)=='0')
                      {
                        System.out.print(0+" ");
                        hp=1;
                      }
                         for(int ip=0;ip<me.length();ip++)
                         if(ht>1&&me.charAt(ip)=='1')
                         {
                           System.out.print(1+" ");
                           ht--;
                         }
                         
                         if(hp==0)
                         {
                         // System.out.println(me.charAt(me.length()-1));
                          if(me.charAt(me.length()-1)=='0')
                          System.out.print(0);
                         }
                      
                  }
               }
               
           }
        }
        System.out.println();
    }
    
}
}