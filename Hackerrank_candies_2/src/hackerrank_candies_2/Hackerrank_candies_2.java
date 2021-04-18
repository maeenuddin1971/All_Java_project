package hackerrank_candies_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hackerrank_candies_2 {

    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int n=r.nextInt();
        
        
        int[] p=new int[n];
        
        Map<Integer,Integer>km=new HashMap<>();
        Map<Integer,Integer>sm=new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
          p[i]=r.nextInt();
          //System.out.println(i);
        }
        int robi=0;
        for(int i=0;i<n-1;i++)
        {
          if(p[i]>p[i+1])
          {
            int np=1;
            robi=0;
            for(int hb=i+1;hb<n-1;hb++)
            {
                if(p[hb]<=p[hb+1])
                {
                  //System.out.println("maeen");
                  break;
                }
                np++;    
            }
            km.put(i,np+1);
            i=i+np;
            //System.out.println(i+" is");
            try
            {
              if(p[i]==p[i+1])
              {
                 //System.out.println("mmmmmm");
                 i--; 
                 robi=1;
              }
            }
            catch(Exception jk)
            {
                
            }
          }
          else if(p[i]==p[i+1])
          {
            
            int np=1;
            //robi=0;
            for(int hb=i+1;hb<n-1;hb++)
            {
                if(p[hb]==p[hb+1])
                {
                  np++; 
                  
                }
                else
                {
                  break;
                }
                   
            }
            
            
            if(robi==0)
            {
               sm.put(i, np+1);
            }
            else
            {
              sm.put(i+1,np);
            }
            i=i+np;
            
          }
        }
        //System.out.println(sm);
        //System.out.println("this ");
        //System.out.println(km);
        int sum=0;
        int bg=0;
        int nb=0;
        for(int i=0;i<n;i++)
        {
           if(km.containsKey(i))
           {
             int man=km.get(i);
             
             
             if(man<=nb)
             {
               int hd=man+1;
              // System.out.print(hd+" ");
               sum=sum+hd;
               int hp=0;
               for(int h=man-1;h>0;h--)
               {
                  // System.out.print(h+" ");
                   sum=sum+h;
                   hp=h;
                   i++;
               }
               
               if(hp==1)
               {
                 nb=1;
               }
               else
               {
                 nb=0;
               }
               
               
               
             }
             else
             {
               //System.out.print(man+" ");
               sum=sum+man;
               int hp=0;
               for(int h=man-1;h>0;h--)
               {
                   //System.out.print(h+" ");
                   sum=sum+h;
                   hp=h;
                   i++;
               }
               if(hp==1)
               {
                 nb=1;
               }
               else
               {
                 nb=0;
               }
             }
             
             
             
             
             
             

             
           }
           else if(sm.containsKey(i))
           {
              
              int man=sm.get(i);
              if(nb==1)
              {
                nb++;
                
              }
              else
              {
                nb=1;
              }
              sum=sum+nb;
              //System.out.println("Is "+i+" "+nb+" "+man);
              for(int vb=man-1;vb>0;vb--)
              {
                if(nb==1)
                {
                  nb=2;
                  sum=sum+nb;
                }
                else if(nb==2)
                {
                  nb=1;
                  sum=sum+nb;
                  //System.out.println("kjjdfhsdkjfhs");
                }
                  
                  
              }
              i=i+man-1;
              if(nb==1)
              {
                nb=1;
              }
              else
              {
                nb=0;
              }
              
              
           }
           else
           {
            nb++;
            sum=sum+nb;
            //System.out.println(i+" "+nb);
           }
        }
        System.out.println(sum);
    }
    
}

    

