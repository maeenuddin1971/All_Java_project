package hackerrank_happy_ladybugs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Hackerrank_Happy_Ladybugs {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        for(int hf=0;hf<n;hf++)
        {
        int g=r.nextInt();
        r.nextLine();
        String ht=r.nextLine();
        //System.out.println(ht);
        char[] m=ht.toCharArray();
        Map<Character,Integer>bd=new HashMap<>();
        
        
        
        
        if(ht.contains("_"))
        {
        
        
        List<Character>nt=new ArrayList<>();
        for(int y=0;y<ht.length();y++)
        {
         //System.out.println("bangladesh");  
         
         if(!bd.containsKey(m[y]))
         {
          bd.put(m[y],1);
          nt.add(m[y]);
          //System.out.println("bangladesh");
         }
         else
         {
          bd.put(m[y],bd.get(m[y])+1);
          
         }
        }
        //System.out.println(bd);
        int sum=0;
        for(int u=0;u<nt.size();u++)
        {
          if(bd.get(nt.get(u))==1&&nt.get(u)!='_')
          {
            System.out.println("NO"); 
            sum=1;
            break;
          }
        }
        if(sum==0)
        {
         System.out.println("YES");
        }
        
        
        }
        else
        {
         int hp=0;
         for(int u=0;u<ht.length();u++)
         {
           if(!bd.containsKey(m[u]))
           {
            if(bd.containsValue(1))
            {
              System.out.println("NO");
              hp=1;
              break;
            }
            bd.put(m[u],1);
           }
           else
           {
            bd.put(m[u],bd.get(m[u])+1);
           }
         }
         if(bd.containsValue(1)&&hp!=1)
         {
             hp=1;
             System.out.println("NO");
         }
         if(hp==0)
         {
          System.out.println("YES");
         }
        }
        
    }
    }
}
