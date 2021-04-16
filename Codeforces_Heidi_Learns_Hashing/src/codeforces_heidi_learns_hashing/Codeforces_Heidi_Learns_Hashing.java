package codeforces_heidi_learns_hashing;

import java.util.Scanner;

public class Codeforces_Heidi_Learns_Hashing {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        String input=r.nextLine();
        
        long t=Long.parseLong(input);
        
      //  int z=r.nextInt();
        
        long sum=0;
        long k=0;
      
      Double s;
      long a=5;
      long gonok=3;
       long x=1;
       long point=0;
       int y=0;
        for(;;)
        {
          
           
           long d=2;
           
           long n=1;
            for(;;)
            {
              
                if(t%2==0)
                {
                    System.out.println("NO");
                    y=1;
                    break;
                }
                
                
              long m=a+(n-1)*d;
               
              if(m==t)
              {
                  System.out.println(x+" "+n);
                  point=1;
                  break;
              }
              if(m>t)
              {
                  break;
              }
              
            n++;
            }
            x++;
            a=a+(2*gonok);
            if(point==1)
            {
                break;
            }
            
            if(gonok>t&&y!=1)
            {
                System.out.println("NO");
                break;
            }
            if(y==1)
                break;
            
            gonok++;
           // break;
            
        }
    }
    
}
