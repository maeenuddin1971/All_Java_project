package hackerrank_equal_stacks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Hackerrank_Equal_Stacks {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int t=r.nextInt();
        int y=r.nextInt();
        int ed=r.nextInt();
        
        
        int[] tr=new int [t];
        int[] yf=new int[y];
        int[] es=new int[ed];
        
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        Map<Integer,Integer> hm2=new HashMap<Integer,Integer>();
        Map<Integer,Integer> hm3=new HashMap<Integer,Integer>();
        Stack<Integer> st = new Stack<Integer>();
        Stack<Integer> st2 = new Stack<Integer>();
        Stack<Integer> st3 = new Stack<Integer>();
        
        int sum1=0;
        int sum2=0;
        int sum3=0;
        int sum4=0;
        
        for(int u=0;u<t;u++)
        {
           tr[u]=r.nextInt();
           
           st.push(tr[u]);
           
           
        }
        for(int de=0;de<y;de++)
        {
            yf[de]=r.nextInt();
            st2.push(yf[de]);
        }
        for(int sq=0;sq<ed;sq++)
        {
            es[sq]=r.nextInt();
            st3.push(es[sq]);
            
        }
        int rf=0;
        int tg=0;
        int yg=0;
        int i=0;
        List<Integer>vf=new ArrayList<Integer>();
        //System.out.println(st.peek());
        for(;;)
        {
            
            if(!st.isEmpty())
            {
             int ypg=st.pop();
             sum1=sum1+ypg;
             hm.put(sum1,ypg);
             vf.add(sum1);
            }
            else
            {
                rf=1;
            }
            
            if(!st2.isEmpty())
            {
                int ypg2=st2.pop();
                sum2=sum2+ypg2;
                hm2.put(sum2,ypg2);
            }
            else
            {
              tg=1;  
            }
            
            if(!st3.isEmpty())
            {
                int ypg3=st3.pop();
                sum3=sum3+ypg3;
                hm3.put(sum3,ypg3);
            }
            else
            {
                yg=1;
            }
            if(rf==1&&yg==1&&tg==1)
            {
               break; 
            }
            i++;
            
        }
        //System.out.println(hm3);
        //System.out.println(hm2);
        //System.out.println(vf);
        
        for(int gv=vf.size()-1;gv>=0;gv--)
        {
           try
           {
             if(hm2.containsKey(vf.get(gv))&&hm3.containsKey(vf.get(gv)))
             {
               System.out.println(vf.get(gv)); 
               break;
             }
           }
           catch(Exception fre)
           {
               
           }
        }
        
        
        
        
        
    }
    
}
