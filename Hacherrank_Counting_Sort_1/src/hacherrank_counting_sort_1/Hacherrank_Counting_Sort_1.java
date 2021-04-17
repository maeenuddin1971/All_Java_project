package hacherrank_counting_sort_1;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hacherrank_Counting_Sort_1 {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int t=r.nextInt();
        
        int[] p=new int[t];
        Map<Integer,Integer>h=new HashMap<>();
        
        
        for(int i=0;i<p.length;i++)
        {
          p[i]=r.nextInt();
          
          if(!h.containsKey(p[i]))
          {
           h.put(p[i],1);
          }
          else
          {
           h.put(p[i],h.get(p[i])+1);
          }
        }
        System.out.println(h);
        
        for(int u=0;u<100;u++)
        {
          if(h.containsKey(u))
          {
           System.out.print(h.get(u)+" ");
          }
          else
          {
           System.out.print(0+" ");   
          }
        }
        
        
        
        
        
        
        
    }
    
}
