package hackerrank_beautiful_days_at_the_movies;
import java.util.Scanner;
public class Hackerrank_Beautiful_Days_at_the_Movies {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int t=r.nextInt();
        
        int k=r.nextInt();
        int m=r.nextInt();
        int sum=0;
        for(int bm=t;bm<=k;bm++)
        {
          String df=String.valueOf(bm);
          String rp = new StringBuffer(df).reverse().toString();
          int f=Integer.parseInt(rp);
         // System.out.println(f);
          
          if(Math.abs(f-bm)%m==0)
          {
           sum++;   
          }
          
        }
        System.out.println(sum);
    }
    
}
