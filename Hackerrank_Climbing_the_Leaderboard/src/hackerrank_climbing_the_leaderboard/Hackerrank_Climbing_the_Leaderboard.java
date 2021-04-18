package hackerrank_climbing_the_leaderboard;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Hackerrank_Climbing_the_Leaderboard {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       int t=r.nextInt();
       
       int[] m=new int[t];
       
       Map<Integer,Integer>mn=new HashMap<>();
       List<Integer>nb=new ArrayList<>();
       PriorityQueue<Integer> p = new PriorityQueue<Integer>();
       int bd=1;
       for(int y=0;y<t;y++)
       {
        m[y]=r.nextInt();
        
        if(mn.containsKey(m[y]))
        {
         continue;
        }
        else
        {
         mn.put(m[y],bd);
         nb.add(m[y]);
         p.add(m[y]);
         bd++;
        }
       }
      // System.out.println(nb);
       //System.out.println(p);
       int u=r.nextInt();
       int[] k=new int[u];
       for(int b=0;b<u;b++)
       {
        k[b]=r.nextInt();
        
        if(mn.containsKey(k[b]))
        {
         System.out.println(mn.get(k[b]));
        }
        else
        {
          if(k[b]>nb.get(0))
          {
           System.out.println(1);   
          }
          else if(k[b]<nb.get(nb.size()-1))
          {
           System.out.println(nb.size()+1);
           
          }        
          else
          {
          for(int i=0,vc=nb.size()-1;i<nb.size();i++,vc--)
          {
           try
           {
            if(nb.get(i)>k[b]&&nb.get(i+1)<k[b])
            {
                System.out.println(mn.get(nb.get(i))+1);
                break;
            }
            
            if(nb.get(vc)<k[b]&&nb.get(vc-1)>k[b])
            {
              System.out.println(mn.get(nb.get(vc)));
              break;
            }
           }
           catch(Exception hg)
           {
               
           }
          }
          }
        }
        
        
       }
    }
    
}
