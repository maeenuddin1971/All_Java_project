package codeforces_number_game;

import java.util.Scanner;

public class Codeforces_Number_Game {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       
       int t=r.nextInt();
       
       if(t==1)
       {
         System.out.println("FastestFinger");
       }
       else if(t==2)
       {
          System.out.println("Ashishgup"); 
       }
       else if(t%2!=0)
       {
          System.out.println("Ashishgup");  
       }
       else
       {
          int m=0;
          int hb=t;
           for(;;)
           {
           for(int i=0;i<t;i++)
           {
            int gf=t/2;
            if(gf%2!=0)
            {
             int ju=hb/gf;
             System.out.println(ju);
             if(ju%2!=0)
             {
            
             continue;
             }
             else
             {
               
             }
             
             
             
             
             
            }
            t=gf;   
           }
           }
           
           if(m==0)
           {
             System.out.println("FastestFinger");
           }
           
        
           
           
       }
       
    }
    
}
