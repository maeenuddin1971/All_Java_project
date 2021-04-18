package hackerrank_breaking_the_records;
import java.util.*;
public class Hackerrank_breaking_the_records {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       int t=r.nextInt();
       int[] y=new int[t];
       int high=0,low=0;
       int h=0,l=0;
       for(int u=0;u<t;u++)
       {
           y[u]=r.nextInt();
           if(u==0)
           {
               high=y[u];
               low=y[u];
           }
           else
           {
               if(high<y[u])
               {
                   h++;
                   high=y[u];
               }
               else if(low>y[u])
               {
                   l++;
                   low=y[u];
               }
           }
       }
       System.out.println(h+" "+l);
    }
    
}
