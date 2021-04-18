package hackerrank_counting_sort_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hackerrank_Counting_Sort_2 {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int t=r.nextInt();
        Map<Integer,Integer>km=new HashMap<>();
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<t;i++)
        {
          int gh=r.nextInt();
          if(!km.containsKey(gh))
          {
            km.put(gh,1);
          }
          else
          {
            km.put(gh,km.get(gh)+1);
          }
          
        }
        
        for(int i=0;i<100;i++)
        {
          if(km.containsKey(i))
          {
            for(int u=0;u<km.get(i);u++)
            {
              System.out.print(i+" ");  
            }
          }
        }
        
    }
    
}
