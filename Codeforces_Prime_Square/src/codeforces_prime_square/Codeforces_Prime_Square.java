package codeforces_prime_square;

import java.util.Scanner;

public class Codeforces_Prime_Square {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int ia=r.nextInt();
        
        for(int ip=0;ip<ia;ip++)
        {
        int t=r.nextInt();
        int[][] p=new int[t][t];
        
        
        //if(t%2==0)
        //{
          int uh=0,mn=t-1;
          for(int h=0;h<t;h++)
          {
            p[h][uh]=1;
            p[mn][h]=1;
            uh++;
            mn--;
          }
          
          
          
        //}
          
        if(t%2!=0)
        {
           int fg=t/2;
           
           p[fg][fg-1]=1;
           p[fg-1][fg]=1;
           p[fg][fg+1]=1;
           p[fg+1][fg]=1;
           
        }
        
        
        
        for(int iy=0;iy<t;iy++)
        {
            for(int ic=0;ic<t;ic++)
            {
               System.out.print(p[iy][ic]+" ");
            }
            System.out.println();
        }
        
        
        
    }
    
}
}