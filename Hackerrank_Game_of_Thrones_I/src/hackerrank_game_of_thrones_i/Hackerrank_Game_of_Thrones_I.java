package hackerrank_game_of_thrones_i;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Hackerrank_Game_of_Thrones_I {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        String in=r.nextLine();
        
        char[] p=in.toCharArray();
        Map<Character,Integer>pk=new HashMap<>();
        List<Character>pj=new ArrayList<>();
        for(int i=0;i<p.length;i++)
        {
         if(!pk.containsKey(p[i]))
         {
         pk.put(p[i],1);
         pj.add(p[i]);
         }
         else
         {
         pk.put(p[i],pk.get(p[i])+1);
         }
        }
       // System.out.println(pk);
        
        int sum=0;
        for(int u=0;u<pj.size();u++)
        {
          if(pk.get(pj.get(u))%2==0)
          {
            continue;  
          }
          else
          {
            sum++;  
          }
        }
        if(sum<=1)
        System.out.println("YES");
        else
        System.out.println("NO");
        
    }
    
}
