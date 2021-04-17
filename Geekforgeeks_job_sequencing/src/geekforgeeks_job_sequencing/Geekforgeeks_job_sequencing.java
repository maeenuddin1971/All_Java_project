package geekforgeeks_job_sequencing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Geekforgeeks_job_sequencing {
    public static void main(String[] args) {
        
        int[] d={2,1,3,2,1};
        int[] p={60,100,20,40,20};
        List<Integer>px=new ArrayList<>();
        Map<Integer,List<Integer>>km=new HashMap<>();
        Map<Integer,Integer>pd=new HashMap<>();
        for(int i=0;i<d.length;i++)
        {
          List<Integer> jh=km.get(p[i]);
         
          if(jh==null)
          {
            jh=new ArrayList<>();
            jh.add(d[i]);
            km.put(p[i],jh);
            px.add(p[i]);
          }
          else
          {
            jh.add(d[i]);
            km.put(p[i], jh);
          }
        }
        
        System.out.println(px);
       // Arrays.sort(px);\
        int pro=0;
        Collections.sort(px);
        for(int gh=px.size()-1;gh>=0;gh--)
        {
          List<Integer>fg=km.get(px.get(gh));
          
          for(int i=0;i<fg.size();i++)
          {
             if(!pd.containsKey(fg.get(i)))
             {
               pd.put(fg.get(i), i);
               pro=pro+px.get(gh);
             }
          }
          
          //System.out.println();
          
        }
        System.out.println(pro);
        
    }
    
}
