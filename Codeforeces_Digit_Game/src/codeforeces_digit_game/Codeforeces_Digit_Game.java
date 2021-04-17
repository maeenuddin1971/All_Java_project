package codeforeces_digit_game;

import java.util.Scanner;

public class Codeforeces_Digit_Game {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int ix=r.nextInt();
        
        for(int iy=0;iy<ix;iy++)
        {
        int gd=r.nextInt();
        r.nextLine();
        String gh=r.nextLine();
        
        if(gh.length()%2==0)
        {
           int ic=0;
           for(int i=1;i<gd;i=i+2)
           {
             if(gh.charAt(i)%2==0)
             {
              ic=1;
              break;
             }
           }
           if(ic==1)
           {
             System.out.println("2");
           }
           else
           {
             System.out.println("1");  
           }
        }
        else
        {
            int ic=0;
            
            for(int i=0;i<gd;i=i+2)
            {
               if(gh.charAt(i)%2!=0)
               {
                   ic=1;
                   break;
               }
            }
            if(ic==1)
            {
              System.out.println(1);
            }
            else
            {
              System.out.println(2);
            }
            
        }
        
    }
    
    
}
}