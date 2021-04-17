package hackerrank_anagram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Hackerrank_Anagram {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int num=r.nextInt();
        r.nextLine();
        for(int u=0;u<num;u++)
        {
        String gh=r.nextLine();
        
        if(gh.length()%2==0)
        {
        String half1=gh.substring(0,gh.length()/2);
        
        //System.out.println(half1);
        
        String half2=gh.substring(gh.length()/2,gh.length());
        
      //  System.out.println(half2);
        
        char[] h1=half1.toCharArray();
        char[] h2=half2.toCharArray();
        
        
        Map<Character,Integer>ku=new HashMap<>();
        Map<Character,Integer>ku2=new HashMap<>();
        List<Character>m=new ArrayList<>();
        List<Character>m2=new ArrayList<>();
        for(int g=0;g<h1.length;g++)
        {
          if(!ku.containsKey(h1[g]))
          {
           ku.put(h1[g],1);
           m.add(h1[g]);
          }
          else
          {
           ku.put(h1[g],ku.get(h1[g])+1);
          }
          
          
          if(!ku2.containsKey(h2[g]))
          {
           ku2.put(h2[g],1);
           m2.add(h2[g]);
          }
          else
          {
           ku2.put(h2[g],ku2.get(h2[g])+1);
          }
          
          
        }
       // System.out.println(ku);
        //System.out.println(ku2);
        
        
       int sum=0;
          for(int hb=0;hb<m2.size();hb++)
          {
            if((ku.containsKey(m2.get(hb))&&(ku2.containsKey(m2.get(hb)))))
            {
             if(ku.get(m2.get(hb))<ku2.get(m2.get(hb)))
             {
               sum=sum+ku2.get(m2.get(hb))-ku.get(m2.get(hb));
              // System.out.println("maeen");
             }
            }
            
            if((!ku.containsKey(m2.get(hb))&&(ku2.containsKey(m2.get(hb)))))
            {
             sum=sum+ku2.get(m2.get(hb));
            // System.out.println("maeen");
            }
            
          }
          System.out.println(sum);
        
        
        
        
        
        }
        else
        {
        System.out.println(-1);
        }
    }
    
}
}