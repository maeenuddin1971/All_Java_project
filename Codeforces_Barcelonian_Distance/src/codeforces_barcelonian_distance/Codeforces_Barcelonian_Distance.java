package codeforces_barcelonian_distance;
import java.util.*;
public class Codeforces_Barcelonian_Distance {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int a=r.nextInt();
        int b=r.nextInt();
        int k=r.nextInt();
        int v1,w1,q1,a1;
        int x1=r.nextInt();
        int y1=r.nextInt();
        int r1=x1;
        v1=x1;
        w1=y1;
        
        int r2=y1;
        int x2=r.nextInt();
        int y2=r.nextInt();
        int r3=x2;
        int r4=y2;
        
        q1=x2;
        a1=y2;
        int sum;
        if(x1*a+y1*b+k==0)
        {
            System.out.println(x1+" "+y1);
        }
        else
        {
            for(;;)
            {
            if(k<0)
            {
               sum= r1*a+r2*b+k;
               if(sum<0)
               {
                  // System.out.println("sfjskjskjfh");
                   r1=x1++;
               }
               else if(sum==0)
               {
                   System.out.println(r1+" "+r2);
                   break;
               }
               if(sum>0)
               {
                  
               }
            }
            else if(k>0)
            {
               
                
                
                
            }
               
            }
        }
        
        
        
        
        
        
        //for the x2,y2
        
        
        if(x2*a+y2*b+k==0)
        {
            System.out.println(x2+" "+y2);
        }
        
        
    }
    
}
