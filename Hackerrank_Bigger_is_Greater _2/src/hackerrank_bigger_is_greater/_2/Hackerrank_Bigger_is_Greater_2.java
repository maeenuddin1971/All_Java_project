
package hackerrank_bigger_is_greater._2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Hackerrank_Bigger_is_Greater_2 {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int ds=r.nextInt();
        
        
        r.nextLine();
        Map<Character,Integer>fr=new HashMap<>();
        Map<Integer,Character>gfr=new HashMap<>();
        int z=1;
        for(Character w='a';w<='z';w++)
        {
         fr.put(w, z);
         gfr.put(z,w);
         z++;
        }
        //System.out.println(fr);
        //System.out.println(gfr);
        for(int u=0;u<ds;u++)
        {
        List<Integer>km=new ArrayList<>();
        List<Integer>m=new ArrayList<>();    
        
        String gd=r.nextLine();
       // gd.\
        String bp="";
        for(int ba=0;ba<gd.length();ba++)
        {
          km.add(fr.get(gd.charAt(ba)));
          bp=bp+gfr.get(fr.get(gd.charAt(ba)));
        }
        //System.out.println(bp);
        int fx=0;
        int s=0;
        String result="";
        Character extra=0;
        for(s=km.size()-1;s>0;s--)
        {
         if(km.get(s)>km.get(s-1))
         {
             int f=km.get(s-1);
             //System.out.println(f);
            //System.out.println(s);
            // break;
             
             for(int bw=km.size()-1;bw>=s;bw--)
             {
                 //System.out.println(km.get(bw));
                 
                 if(km.get(bw)>f&&fx==0)
                 {
                   int bd=km.get(bw);
                   km.set(bw,f);
                  // km.add(bw,f);
                   km.set(s-1,bd);
                   extra=gfr.get(bd);
                   fx=1;
                   m.add(f);
                   result=result+gfr.get(f);
                 }
                 else
                 {
                   m.add(km.get(bw));
                   result=result+gfr.get(km.get(bw));
                 }
                 
                 
             }
             break;
         }
        }
        //System.out.println(km);
       // System.out.println(result);
        //System.out.println(m);
        //Collections.sort(m);
        
        
        
        int bc=km.size()-m.size();
        if(!m.isEmpty())
        {
        String sub=bp.substring(0,km.size()-m.size()-1)+extra+result;
        System.out.println(sub);
        }
        else
        {
         System.out.println("no answer");
        }
        
    }
    
}
}