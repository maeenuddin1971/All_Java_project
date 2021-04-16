package codeforces_game_23;

import java.util.Scanner;

public class Codeforces_Game_23 {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       
       int n=r.nextInt();
       int m=r.nextInt();
       
        if(n==m)
       {
               System.out.println(0);
       }
        else if(n*2>m)
       {
           System.out.println(-1);
       }
       else
       {
           if(n*2==m)
           {
               System.out.println(1);
           }
          else
           {
               
               int sum=0;
               int u=n;
               
               for(;;)
               {
               if(m%(u*3)==0)
               {
                  u=u*3; 
                  sum++;
                //  System.out.println("yes it is ");
               }
               else if(m%(u*2)==0)
               {
                  u=u*2;
                  sum++;
                //  System.out.println("yes it was");
               }
               else if(m%(u*3)!=0&&m%(u*2)!=0&&m!=u)
               {
                    System.out.println(-1);
                   break;
                 
               }
               else if(m==u)
               {
                   System.out.println(sum);
                   break;
               }
               else if(m<u)
               {
                   System.out.println(-1);
                   break;
               }
               
               }
               
               
               
               
               
           }
       }
       
    }
    
}
