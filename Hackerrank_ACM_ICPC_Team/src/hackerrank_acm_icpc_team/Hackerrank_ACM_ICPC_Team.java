package hackerrank_acm_icpc_team;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Hackerrank_ACM_ICPC_Team {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       int t=r.nextInt();
       int u=r.nextInt();
       String[] p=new String[t];
       for(int y=0;y<t;y++)
       {
        p[y]=r.next();
             
       }
      // System.out.println(p[0]);
       int high=0;
       Map<Integer,Integer>jh=new HashMap<>();
      for(int y=0;y<t-1;y++)
       {
           
           //int high=0;
           for(int e=y+1;e<t;e++)
           {
            int sum=0;
            for(int cd=0;cd<u;cd++)
            {
             if(p[y].charAt(cd)=='0'&&p[e].charAt(cd)=='0')
             {
                 continue;
             }
             else
             {
                 sum++;
             }
            }
            if(high<=sum)
            {
               high=sum;
               if(jh.containsKey(high))
               {
               jh.put(high,jh.get(high)+1);
               }
               else
               {
               jh.put(high,1);
               }
              // System.out.println(high);
            }
            //System.out.println(sum);
           }
           
       }
      System.out.println(high);
      System.out.println(jh.get(high));
    }
    
}
