package hackerrank_chocolate_feast;

import java.util.Scanner;

public class Hackerrank_Chocolate_Feast {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        
        int az=r.nextInt();
        
        for(int cw=0;cw<az;cw++)
        {
        int n=r.nextInt();
        
        int c=r.nextInt();
        int m=r.nextInt();
        
        int sum=0;
        int u=n/c;
        sum=u;
        for(;;)
        {
          if(u%m==0||u<m)
          {
           if(u%m==0)
               sum++;
           break;
          }
          int bd=u/m;
          int yu=u%m;
          sum=sum+bd;
          //System.out.println(sum);
          u=bd+yu;
          
        }
        System.out.println(sum);
        if(sum==721)
        {
           System.out.println(n+" "+c+" "+m);
        }
        }
    }
    
}
