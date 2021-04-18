package hackerrank_game_of_maximization_2;

import java.util.Scanner;

public class Hackerrank_Game_of_Maximization_2 {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int t=r.nextInt();
        
        int[] p=new int[t];
        int sum1=0,sum2=0;
        
        for(int y=0;y<t;y++)
        {
          p[y]=r.nextInt();
          
          if(y%2==0)
          {
          sum1=sum1+p[y];
          }
          else
          {
          sum2=sum2+p[y];
          }
          
        }
       // System.out.println(sum1);
       // System.out.println(sum2);
        
        System.out.println(2*Math.min(sum1,sum2));
    }
    
}
