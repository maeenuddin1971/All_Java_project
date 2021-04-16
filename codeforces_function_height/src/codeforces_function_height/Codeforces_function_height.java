package codeforces_function_height;
import java.util.*;
public class Codeforces_function_height {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       int t=r.nextInt();
       int fg=r.nextInt();
       if(t>fg)
       {
           System.out.println("1");
       }
       else
       {
           if(fg%t==0)
           {
               int cv=fg/t;
               if(cv%2!=0)
               {
                   System.out.println(cv);
               }
               else
               {
                  int vb=fg/t;
                  int xc=vb+(t-1);
                  if(xc%2==0)
                  {
                      System.out.println(xc+1);
                  }
                  else
                  {
                      System.out.println(xc);
                  }
                  
               }
           }
           else
           {
               int zx=fg%t;
               int u=fg/t;
               int sum=zx+u;
              // System.out.println(sum);
               if(sum%2!=0)
               {
                   System.out.println(sum);
               }
               else
               {
                   sum=sum+(t-1);
                   System.out.println(sum);
               }
                   
               
           }
       }
    }
    
}
