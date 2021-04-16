
package codeforces_got_any_grapes;

import java.util.Scanner;

public class Codeforces_Got_Any_Grapes {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int a,b,c;
        
        int g,h,k;
        
        
        a=r.nextInt();
        b=r.nextInt();
        c=r.nextInt();
        
         g=r.nextInt();
        h=r.nextInt();
        k=r.nextInt();
        int sum=0;
        if(a<=g)
        {
            int p1=0;
            int y=0;
            int we=0;
           sum=g-a; 
           
           int sd=sum+h;
           
           if(b<=sd)
           {
               p1=1;
               we=sd-b+k;
              // System.out.println(we);
           }
           
           if(c<=we)
           {
               y=1;
           }
           
           if(p1==1&&y==1)
           {
               System.out.println("Yes");
           }
           else
               System.out.println("NO");
        }
        else
        {
            System.out.println("NO");
           // System.out.println("maeen");
        }
        
        
        
    }
    
}
