package hackerrank_gridland_metro;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Hackerrank_Gridland_Metro {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int n=r.nextInt();
        int m=r.nextInt();
        
        int k=r.nextInt();
        
        BigInteger bd=BigInteger.valueOf(0);
        //System.out.println(bd);
        Map<Integer,Stack<int[]>>map=new HashMap<>();
        List<Integer>ms=new ArrayList<>();
        
        for(int bw=0;bw<k;bw++)
        {
          int f=r.nextInt();
          int c1=r.nextInt();
          int c2=r.nextInt();
          
          Stack<int[]>man=map.get(f);
          
          if(man==null)
          {
              man=new Stack<>();
              man.push(new int[]{c1,c2});
              map.put(f, man);
              ms.add(f);
          }
          else
          {
             int[] dq=man.peek();
             
             if(dq[1]>=c1)
             {
               dq[1]=Math.max(dq[1],c2);
             }
             else
             man.push(new int[]{c1,c2});
             
          }
          
          
        }
        int sum=0;
        for(int u=0;u<ms.size();u++)
        {
        //System.out.println(map);
            
         Stack<int[]>mv=map.get(ms.get(u));
         
         for(int va=0;va<mv.size();va++)
         {
           int[] pm=mv.get(va);
           
           for(int bt=0;bt<pm.length;bt++)
           {
            // System.out.print(pm[bt]+" ");
             int mjh=pm[bt+1];
             int mjh2=pm[bt];
             sum=sum+pm[bt+1]-pm[bt]+1;
             
             bd=bd.add(BigInteger.valueOf(mjh)).subtract(BigInteger.valueOf(mjh2)).add(BigInteger.valueOf(1));
            // bd=;
            // System.out.println(bd);
             bt++;
           }
           
         }
        // System.out.println();   
        }
        //System.out.println(bd);
        //System.out.println(sum);
        BigInteger vf=BigInteger.valueOf(8);
        //System.out.println(vf.add(vf).add(BigInteger.valueOf(9)).add(BigInteger.valueOf(3)).subtract(BigInteger.valueOf(2)));
        System.out.println(BigInteger.valueOf(n).multiply(BigInteger.valueOf(m)).subtract(bd));
        
        
        
        /*Map<Integer,List<int[]>>mapk=new HashMap<>();
        
        for(int gh=0;gh<k;gh++)
        {
          int f=r.nextInt();
          int c1=r.nextInt();
          int c2=r.nextInt();
          List<int[]>pj=mapk.get(f);
          
          if(pj==null)
          {
            pj=new LinkedList<>();
            
            pj.add(new int[]{c1,c2});
            mapk.put(f, pj);
          }
          else
          {
            pj.add(new int[]{c1,c2});
            
          }
          
        }
        
        System.out.println(mapk);
        
        List<int[]>py=mapk.get(2);
        
        for(int bg=0;bg<py.size();bg++)
        {
          int[] mant=py.get(bg);
          
          for(int i=0;i<mant.length;i++)
          {
             System.out.print(mant[i]+" ");
          }
        }*/
        
        
    }
    
}
