
package hackerrank_fraudulent_activity_notifications;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Hackerrank_Fraudulent_Activity_Notifications {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        List<Integer>pk=new ArrayList<>();
        
        int t=r.nextInt();
        int d=r.nextInt();
        
        int[] n=new int[t];
        
        for(int i=0;i<t;i++)
        {
            n[i]=r.nextInt();
            //System.out.println(i);
            if(i%10000==0)
            {
                System.out.println(i);
            }
            if(i<d)
            {
             pk.add(n[i]);
            }
        }
        System.out.println("yes");
        Collections.sort(pk);
        System.out.println(pk);
        //int hf=pk.get((pk.size()-1)/2);
        //System.out.println(hf);
        int sum=0;
        if(pk.size()%2!=0)
        {
          System.out.println("khaled");
          if(d!=1)
          {
         // System.out.println("rasel");
          for(int i=pk.size();i<t;i++)
          {
          try
          {
              int hf=pk.get((pk.size()-1)/2);
              //System.out.println(n[i]);
             // System.out.println(hf);
              if(n[i]>=2*hf)
              {
                sum++;  
              }
              //System.out.println(pk);
              pk.remove(0);
              
              if(n[i]>hf)
              {
               // System.out.println("maeen");
                for(int u=pk.size()/2;u<pk.size();u++)
                {
                  int g=pk.get(u);
                  if(u==pk.size()-1)
                  {
                      
                    pk.add(pk.size(),n[i]);
                    break;
                  }
                  if(g>n[i])
                  {
                    pk.add(u,n[i]);
                    break;
                  }
                  
                  
                }
              }
              else
              {
                //System.out.println("maeen");
                for(int u=0;u<pk.size()/2;u++)
                {
                  int g=pk.get(u);
                  if(u==0&&g>n[i])
                  {
                    pk.add(0,n[i]);
                    break;
                  }
                  if(g>=n[i])
                  {
                    pk.add(u,n[i]);
                    break;
                  }
                  if(u==(pk.size()/2)-1)
                  {
                    pk.add(u,n[i]);
                    break;
                  }
                  
                  
                } 
              }
             // System.out.println(pk);
           
          }
          catch(Exception hg)
          {
              
          }
          }
          }
          else
          {
            //System.out.println("1 er jonno");
            int hb=n[0];
            
            for(int i=1;i<n.length;i++)
            {
              //System.out.println(hb);
              if(n[i]>=hb*2)
              {
                  sum++;
                  
                  //System.out.println(hb);
              }
              hb=n[i];
            }
            
          }
        }
        else
        {
            
            if(d!=2)
            {
            System.out.println("hadith");
            for(int i=pk.size();i<t;i++)
            {
              try
              {
                 int ki=pk.get(pk.size()/2);
                 int gi=pk.get((pk.size()/2)-1);
                 double av=(double)(ki+gi)/2; 
                 //System.out.println(av);
                 if(n[i]>=2*av)
                 {
                 sum++;  
                 }
                // System.out.println(pk);
                 pk.remove(0);
                 
                 if(n[i]>av)
                 {
                   // System.out.println("maeen");
                    for(int u=pk.size()/2;u<pk.size();u++)
                    {
                    int g=pk.get(u);
                    if(u==pk.size()-1)
                    {
                      
                    pk.add(pk.size(),n[i]);
                    break;
                    }
                    if(g>n[i])
                    {
                    pk.add(u,n[i]);
                    break;
                    }
                  
                  
                    }  
                 }
                 else
                 {
                    //System.out.println("uddin");
                    for(int u=0;u<pk.size()/2;u++)
                    {
                    int g=pk.get(u);
                     if(u==0&&g>n[i])
                    {
                    pk.add(0,n[i]);
                    break;
                     }
                     if(g>=n[i])
                    {
                    pk.add(u,n[i]);
                    break;
                    }
                    if(u==(pk.size()/2)-1)
                    {
                    pk.add(u,n[i]);
                    break;
                    }
                  
                  
                }   
                 }
                 //System.out.println(pk);
                 
                 
                 
              }
              catch(Exception gr)
              {
                  
              }
            }
            }
            else
            {
              //System.out.println("2 er jonno");
              
              
              for(int i=pk.size();i<t;i++)
              {
                double av=(double)(pk.get(0)+pk.get(1))/2;
                //System.out.println(av);
                //System.out.println(pk);
                pk.remove(0);
                 
                if(n[i]>=2*av)
                {
                 sum++;  
                }
                
                  
                if(n[i]>av)
                {
                  pk.add(1,n[i]);
                }
                else
                {
                  pk.add(0,n[i]);
                }
              }
              
              
            }
            
            
            
            //System.out.println(av);
        }
        System.out.println(sum);
        
        
    }
    
}
