package hackerrank_bear_and_steady_gene;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Hackerrank_Bear_and_Steady_Gene {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int t=r.nextInt();
        r.nextLine();
        String gh=r.nextLine();
        
        char[] p=gh.toCharArray();
        Map<Character,Integer>jk=new HashMap<>();
        Map<Character,Integer>jk2=new HashMap<>();
        Map<Character,Integer>jk3=new HashMap<>();
        List<Character>pk=new ArrayList<>();
        List<Character>pk2=new ArrayList<>();
        int hy=t/4;
        for(int i=0;i<gh.length();i++)
        {
         if(!jk.containsKey(p[i]))
         {
           jk.put(p[i],1);
           pk.add(p[i]);
         }
         else
         {
           jk.put(p[i],jk.get(p[i])+1);
         }
        }
        //System.out.println(jk);
        //System.out.println(hy);
        
        for(int u=0;u<pk.size();u++)
        {
          if(jk.get(pk.get(u))>hy)
          {
            int hf=jk.get(pk.get(u))-hy;
            jk2.put(pk.get(u),hf);
            pk2.add(pk.get(u));
          }
        }
        int bg=0;
        
        
        ///System.out.println(jk2);
        int min=500000000;
        for(;;)
        {
            String re="";
            
            for(int hb=0;hb<pk2.size();hb++)
            {
              int fv=jk2.get(pk2.get(hb));
              jk3.put(pk2.get(hb),fv);         
            }
            
            if(bg==p.length)
            {
              break;
            }
            //System.out.println(jk3);
            for(int u=bg;u<p.length;u++)
            {
             if(jk3.containsKey(p[u])&&jk3.get(p[u])!=0)
             {
               jk3.put(p[u],jk3.get(p[u])-1);
              
               re=re+p[u];
              
               
               if(jk3.get(p[u])==0)
               {
                 jk3.remove(p[u]);
               }
               
               if(jk3.isEmpty())
               {
                 //System.out.println(re);
                 if(min>re.length())
                 {
                  min=re.length();
                 }
                 
                 break;
               }
               
             }
             else
             {
              re=re+p[u];
             }
            }
           
            bg++;
        }
        if(min==500000000)
        {
          System.out.println(0);
        }
        else
        System.out.println(min);
        
        
    }
    
}
