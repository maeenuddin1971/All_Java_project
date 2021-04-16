package codeforces_minimum_integer;
import java.util.*;
public class Codeforces_Minimum_Integer {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int t=r.nextInt();
        
        
        for(int fg=0;fg<t;fg++)
        {
            int cv=r.nextInt();
            int vb=r.nextInt();
            int sd=r.nextInt();
            
            int p=0;
            
            
            
            
            if(vb==sd)
            {
                
            }
            
            
            
            
            
            
            if(sd!=1)
            {
            for(int y=cv-1;y>1;y--)
            {
             if(y%sd==0)
                {
                   System.out.println(y);
                   p=1;
                   break;
                }
            }
            }
            if(p==0&&sd!=1)
            {
                int u=vb+1;
                for(;;)
                {
                  if(u%sd==0)
                  {
                       System.out.println(u);
                       break;
                  }
                  else
                      u++;
                    
                    
                }
            }
            if(sd==1)
            {
                if(cv!=1)
                {
                    System.out.println(1); 
                }
                else
                     System.out.println(vb+1);
            }
            
            
            
        }
    }
    
}
