package hackerrank_cut_the_sticks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
public class Hackerrank_Cut_the_sticks {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       int t=r.nextInt();
       List<Integer>mn=new ArrayList<>();
       List<Integer>dc=new ArrayList<>();
       Map<Integer,Integer>w=new HashMap<>();
       Map<Integer,Integer>w2=new HashMap<>();
       Queue<Integer> p= new PriorityQueue<Integer>();
       for(int i=0;i<t;i++)
       {
           int f=r.nextInt();
           mn.add(f);
           if(w.containsKey(f))
           {
               continue;
           }
           else
           {
               w.put(f,0);
               p.add(f);
           }
       }
       dc=mn;
       System.out.println(mn.size());
       int y=0;
       for(int dr=0;dr<w.size();dr++)
       {
       if(dc.size()==1)
       {
           break;
       }
       int min;
       int m2=p.peek();
       
       if(dr==0)
       {
        min=p.remove();
        y=min;
       }
       else
       {
        m2=y;
        y=p.remove();
        min=y-m2;
        //m2=y;
       }
       int v=min;
       Integer[] ju=dc.toArray(new Integer[dc.size()]);
       mn=Arrays.asList(ju);
       //System.out.println(dc);
       dc.clear();
       for(int x=0;x<mn.size();x++)
       {
        
        int as=mn.get(x)-v;
       // System.out.println(as);
        if(as<=0)
        {
            continue;
        }
        else
        {
            int vd=as;
            dc.add(as);
            
        }
       }
       if(!w2.containsKey(dc.size())&&dc.size()!=0)
       {
       System.out.println(dc.size());
       w2.put(dc.size(),0);
       }
       
       if(dc.size()==0)
       {
           break;
       }
       //dc.clear();
       }
       
    }
    
}
