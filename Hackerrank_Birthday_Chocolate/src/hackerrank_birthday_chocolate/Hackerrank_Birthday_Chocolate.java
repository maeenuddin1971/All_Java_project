package hackerrank_birthday_chocolate;
import java.util.Scanner;
public class Hackerrank_Birthday_Chocolate {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int t=r.nextInt();
        
        int[] m=new int[t];
        for(int u=0;u<t;u++)
        {
            m[u]=r.nextInt();
        }
        int v=r.nextInt();
        int p=r.nextInt();
        int result=0;
        for(int u=0;u<t;u++)
        {
         int sum=0;
         try
         {
         for(int d=u;d<p+u;d++)
         {
           sum=sum+m[d];
           System.out.println(sum);
         }
         if(sum==v)
         {
           result++;  
         }
         }
         catch(Exception jh)
         {
             
         }
        }
        System.out.println(result);
        
    }
    
}
