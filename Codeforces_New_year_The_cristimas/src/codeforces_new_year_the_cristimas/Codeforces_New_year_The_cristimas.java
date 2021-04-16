package codeforces_new_year_the_cristimas;
import java.util.*;
public class Codeforces_New_year_The_cristimas {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       int a=r.nextInt();
       int b=r.nextInt();
       int c=r.nextInt();
       int sum=0;
       //if
       if(a<c&&c<=b)
       {
          if(a+1>b||a+2>c)
          {
              a=a-1;
              sum=a+a+1+a+2;
              System.out.println(sum);
          }
          else
          {
              sum=a+a+1+a+2; 
              System.out.println(sum);
          }
       }
       else if(a==c&&b==c)
       {
           a=a-2;
           sum=a+a+1+a+2;
           System.out.println(sum);
       }
       else if(a==b&&b<c)
       {
         a=a-1;
         sum=a+a+1+a+2;
         System.out.println(sum);
       }
       else if(a==b&&b>c)
       {
         c=c-2;
         sum=c+c+1+c+2;
         System.out.println(sum);
       }
        else if(a>b&&b>c)
       {
         c=c-2;
         sum=c+c+1+c+2;
         System.out.println(sum);
       }
        else if(a<b&&b>c)
       {
         if(a+2<=c)
         {
            sum=a+a+1+a+2;  
            System.out.println(sum);
         }
         else
         {
         c=c-2;
         sum=c+c+1+c+2;
         System.out.println(sum); 
         }
       }
        else if(a>b&&b<c)
        {
            b=b-1;
            sum=b+b+1+b+2;
            System.out.println(sum); 
        }
        else if(a>b&&b==c)
        {
            b=b-2;
            sum=b+b+1+b+2;
            System.out.println(sum); 
        }
       else if(a<b&&b<c)
        {
            
            sum=a+a+1+a+2;
            System.out.println(sum); 
        }
       
    }
    
}
