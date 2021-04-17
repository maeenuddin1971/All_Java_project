package hackeerank_halloween_sale;

import java.util.Scanner;

public class Hackeerank_Halloween_Sale {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int p=r.nextInt();
        int d=r.nextInt();
        int m=r.nextInt();
        
        int s=r.nextInt();
        int sum;
        int k=0;
        if(p-d>m)
        {
         sum=p;
         k++;
        }
        else
        {
         sum=m;
         k++;
        }
        
        for(;;)
        {
         
         //{
          if(sum>s)
          {
              k--;
              System.out.println(k);
              break;
          }
          else if(sum==s)
          {
             System.out.println(k);
             break;
          }
            
          if(p-d>m)
          {
              
           
           
           p=p-d;
           sum=sum+p;
           //System.out.println(p+" "+sum);
           k++;
          }
          else if(p<d||p==d)      
          {
           p=p-m;
           sum=sum+p;
           k++;
          } 
          else
          {
           p=m;
           sum=sum+p;
          // System.out.println(p);
           k++;
          }
          
          
          
         //}
        }
    }
    
}
