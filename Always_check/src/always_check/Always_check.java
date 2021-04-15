package always_check;

import java.util.Scanner;
import java.util.*;
public class Always_check {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       int t=r.nextInt();
       int[] mn=new int[t];
       
       Map<Integer,Integer>bg=new HashMap<>();
       
       Stack<Integer>fg=new Stack<>();
       for(int i=0;i<t;i++)
       {
           mn[i]=r.nextInt();
       }
       bg.put(mn[0],1);
       fg.push(mn[0]);
       int sum=0;
       for(int f=1;f<t;f++)
       {
           try
           {
           if(fg.peek()>=mn[f])
           {
               //System.out.println(fg);
               //System.out.println("peek"+fg.peek());
               System.out.println("rajakar");
               if(!bg.containsKey(mn[f]))
               {
                bg.put(mn[f],1);
                fg.push(mn[f]);
               }
               else
               {
                   bg.put(mn[f],bg.get(mn[f])+1);
               }
           }
           else
           {
              //System.out.println(); 
              //System.out.println("rajakar");
              if(bg.containsKey(mn[f]))
                {
                                       
                 for(int u=0;u<t;u++)
                 {
                     int xr=fg.pop();
                     System.out.println(xr);
            
                     
                      
                     if(xr==mn[f])
                     {
                     System.out.println("reeeeeeeeet"+xr);  
                     System.out.println(fg); 
                     fg.push(xr);
                    /* if(fg.size()==1)
                     {
                     fg.push(xr);
                     System.out.println("maeen");
                     }*/
                     //System.out.println(xr);
                     //System.out.println("uddin");
                    // System.out.println(bg.get(xr));
                     f--;
                     break;
                     }
                     else
                     {
                         sum=((bg.get(xr)+1)*bg.get(xr))/2;
                         System.out.println("sum is "+sum);
                         System.out.println(bg.get(xr));
                     }
                  }
              }
              else
              {
                if(bg.get(mn[f])==null)
                {
                bg.put(mn[f],1);
                fg.push(mn[f]);
                }
                else
                {
                    bg.put(mn[f],bg.get(mn[f])+1);
                }
              }
              
              
              
              
              
           }
           }
           catch(Exception hb)
           {
               
           }
       }
       System.out.println(bg);
       
    }
    
}
