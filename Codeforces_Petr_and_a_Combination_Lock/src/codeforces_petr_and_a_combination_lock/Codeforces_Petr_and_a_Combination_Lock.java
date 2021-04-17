package codeforces_petr_and_a_combination_lock;
import java.util.*;
public class Codeforces_Petr_and_a_Combination_Lock {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       int n=r.nextInt();
       List<Integer>k=new ArrayList<Integer>();
       for(int i=0;i<n;i++)
       {
        k.add(r.nextInt());
       }
       int sum=0;
        
       for(int u=0;u<k.size();u++)
       {
           sum=sum+k.get(u);
           
       }
       if(sum%360==0)
       {
           System.out.println("YES");
       }
       else if(sum<360)
       {
           Collections.sort(k);
          
           for(int y=0;y<k.size();y++)
           {
              int sum2=0;
               int sd=0;
               try
               {
              for(int df=0;df<k.size()/2+y;df++)
              {
                 sd=sd+k.get(df);
              }
               }
               catch(Exception fg)
               {
                   
               }
              
              try
              {
              for(int cv=y+k.size()/2;cv<k.size();cv++)
              {
                 sum2=sum2+k.get(cv);
              }
              }
              catch(Exception jh)
              {
                      
              }
              
              if(sd==sum2)
              {
                   System.out.println("YES");
                   break;
              }
              else if(sd>sum2)
              {
                  System.out.println("NO");
                  break;
              }
           }
       }
       else if(sum>360)
       {
           
           
           
            Collections.sort(k,Collections.reverseOrder());
         System.out.println(k);
           for(int y=0;y<k.size();y++)
           {
              int sum2=0;
               int sd=0;
               try
               {
              for(int df=0;df<k.size()/2+y;df++)
              {
                 sd=sd+k.get(df);
              }
               }
               catch(Exception fg)
               {
                   
               }
              
              try
              {
              for(int cv=y+k.size()/2;cv<k.size();cv++)
              {
                 sum2=sum2+k.get(cv);
              }
              }
              catch(Exception jh)
              {
                      
              }
              
            if((sd-sum2)%360==0)
            {
                 System.out.println(sd+" "+sum2+" "+(sd-sum2));
                 System.out.println("YES");
                 break;
            }
             if((sd+sum2)%360==0)
            {
                 System.out.println(sd+" "+sum2+" "+(sd+sum2));
                 System.out.println("YES");
                 break;
            }
            
            else if(sum2==0)
            {
                 System.out.println("NO");
                 break;
            }
              
              System.out.println(sd+" "+sum2+" "+(sd-sum2)+" "+(sd+sum2));
             // System.out.println(360%360);
              
           }
           
           
           
           
       }
       
      
      
       
       
       
    }
    
}
