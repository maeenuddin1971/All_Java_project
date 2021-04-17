package codeforces_playing_piano;
import java.util.*;
public class Codeforces_Playing_Piano {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       
       int r=s.nextInt();
       int g=1;
       int[] m=new int[r];
       
       for(int i=0;i<r;i++)
       {
           m[i]=s.nextInt();
       }
       int p=1;
       System.out.print(p+" ");
       for(int i=0;i<r;i++)
       {
           try
           {
               if(m[i]<m[i+1])
               {
                   if(p<6)
                   {
                   if(p!=5)
                   {
                   p++;
                   System.out.print(p+" ");
                   }
                   else
                   {
                       System.out.print(-1+" ");
                   }
                   
                 
                   }
               }
               else if(m[i]>m[i+1])
               {
                   if(p>0)
                   {
                       p--;
                       System.out.print(p+" ");
                   }
                   
               }
               
               else if(m[i]==m[i+1])
               {
               //    System.out.println("khjfhsjfgsjfg");
                 try
                 {
                     if(m[i+1]<m[i+2])
                     {
                     // System.out.println("khjfhsjfgsjfg");
                     for(int z=i+2;z<r;z++)
                     {
                         if(m[z]<m[z+1])
                         {
                             g++;
                             
                         }
                         else
                             break;
                     }
                     p=5-g;
                     System.out.print(p+" ");
                     }
                     
                     
                     
                     else if(m[i+1]>m[i+2])
                     {
                    // System.out.println("skjfhskjfbsjfsf"); 
                     for(int z=i+2;z<r;z++)
                     {
                         if(m[z]>m[z+1])
                         {
                             g++;
                             
                         }
                         else
                             break;
                     }
                     p=g+1;
                     System.out.print(p+" ");
                         
                         
                         
                     }
                     else
                     {
                        
                     }
                     
                     
                     
                     
                     
                 }
                 catch(Exception vb)
                 {
                      if(p==5)
                      {
                          p--;
                          System.out.print(p+" ");
                      }
                      else
                      {
                          p++;
                          System.out.print(p+" ");
                      }
                 }
               }
           }
           catch(Exception b)
           {
               
           }
       }
       
       
    }
    
}
