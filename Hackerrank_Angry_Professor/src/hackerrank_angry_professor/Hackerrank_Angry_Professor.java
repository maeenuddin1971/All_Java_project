package hackerrank_angry_professor;
import java.util.Scanner;
public class Hackerrank_Angry_Professor {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       int t=r.nextInt();
       
       for(int y=0;y<t;y++)
       {
           int b=r.nextInt();
           int a=r.nextInt();
           int sum=0;
           for(int u=0;u<b;u++)
           {
            int c=r.nextInt();
            
            if(c<=0)
            {
             sum++;
            }
           }
           if(sum>=a)
           {
               System.out.println("NO");
           }
           else
           {
               System.out.println("YES");
           }
       }
    }
    
}
