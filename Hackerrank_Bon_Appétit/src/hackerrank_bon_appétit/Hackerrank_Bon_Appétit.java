package hackerrank_bon_appétit;
import static java.lang.Math.abs;
import java.util.Scanner;
public class Hackerrank_Bon_Appétit {
    public static void main(String[] args) {
      Scanner r=new Scanner(System.in);
      int t=r.nextInt();
      int m=r.nextInt();
      int[] n=new int[t];
      int sum=0;
      for(int u=0;u<t;u++)
      {
       n[u]=r.nextInt();
       if(m==u)
       {
           continue;
       }
       else
       {
           sum=sum+n[u];
       }
      }
      int i=r.nextInt();
      int bn=sum/2;
      if(bn==i)
      {
          System.out.println("Bon Appetit");
      }
      else
      {
          int yh=abs(i-bn);
          System.out.println(yh);
      }
    }
    
}
