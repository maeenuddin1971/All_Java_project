package codeforces_accordion;
import java.util.*;
public class Codeforces_Accordion {
    public static int maeen=1;
  static  PriorityQueue<Integer> pQueue = 
                          new PriorityQueue<Integer>(); 
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       
       String gh=r.nextLine();
       
       char[] p=gh.toCharArray();
       
       
       
       
       
       
       for(int i=0;i<p.length;i++)
       {
           if(p[i]=='[')
           {
              
            for(int u=i;u<p.length;u++)
            {
                if(p[u]==']')
                {
                    
                    check(i,u,gh);
                    break;
                }
            }
               
               
               
           }
       }
       
      result();
    }
    
    
    
    static void check(int y,int p,String kl)
    {
        //System.out.println(y);
        //System.out.println(p);
        int m=0,z=0;
        char[] jh=kl.toCharArray();
        for(int vb=y;vb<=p;vb++)
        {
           if(jh[vb]==':')
           {
               m=vb;
              // System.out.println(": is in "+m);
               break;
           }
        }
        for(int df=p;df>=y;df--)
        {
            if(df==m)
            {
                break;
            }
            else
            {
                if(jh[df]==':')
                {
                     z=df;
                    // System.out.println(": is in "+df);
                     break;
                }
            }
        }
        
        if(m!=0&&z!=0)
        {
            last(m,z,kl);
        }
    }

    private static void last(int m,int z,String hj) {
      //  System.out.println(m+" "+z);
        char[] op=hj.toCharArray();
        int sum=4;
        for(int vf=m;vf<=z;vf++)
        {
            if(op[vf]=='|')
            {
                sum++;
            }
        }
       // maeen=sum;
       pQueue.add(sum);
        
    }

    private static void result() {
       if(pQueue.size()==0)
       {
           System.out.println("-1");
       }
       else
           System.out.println(pQueue.peek());
    }
    
    
    
    
}
