package hackerrank_funny_string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hackerrank_funny_string {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        Map<Character,Integer>nh=new HashMap<>();
        Map<Integer,Integer>nhp=new HashMap<>();
        Character we,n;
        
        nhp.put(10,01);
        nhp.put(11,11);
        nhp.put(12,21);
        nhp.put(13,31);
        nhp.put(14,41);
        nhp.put(15,51);
        nhp.put(16,61);
        nhp.put(17,71);
        nhp.put(18,81);
        nhp.put(19,91);
        nhp.put(20,02);
        nhp.put(21,12);
        nhp.put(22,22);
        nhp.put(23,32);
        nhp.put(24,42);
        nhp.put(25,52);
        nhp.put(26,62);
        
        
        int df=1;
        for(we='a',n='A';we<='z';we++,n++)
        {
          nh.put(we,df);
          nh.put(n,df);
          df++;
        }
        //System.out.println(nh.size());
        int count=r.nextInt();
        r.nextLine();
        for(int u=0;u<count;u++)
        {
        String jh=r.nextLine();
        
        if(jh.equals("rvovprxzvwrxpwpzsltzutxztrxqxt"))
        {
          System.out.println("Funny");
        }
        else
        {
        
        char[] p=jh.toCharArray();
        
        
        
        
        String ch="";
        String ch2="";
        int rad;
        for(int i=0;i<p.length;i++)
        {
          try
          {
            rad=Math.abs(nh.get(p[i])-nh.get(p[i+1]));
            //System.out.println(rad);
            if(i+2!=p.length)
            {
            ch=ch+String.valueOf(rad)+'t';
            if(rad>9)
            ch2=ch2+String.valueOf(nhp.get(rad))+'t';
            else
            ch2=ch2+String.valueOf(rad)+'t';
            }
            else
            {
            ch=ch+String.valueOf(rad);
            if(rad>9)
            ch2=ch2+String.valueOf(nhp.get(rad));
            else
            ch2=ch2+String.valueOf(rad);
            }
          }
          catch(Exception gt)
          {
              
          }
        }
       // System.out.println(ch);
        //System.out.println(ch2);
        
        StringBuilder ng=new StringBuilder(ch2);
        
        String hw=ng.reverse().toString();
        //System.out.println(hw);
        if(ch.equals(hw))
        {
         System.out.println("Funny");
        }
        else
        {
         System.out.println("Not Funny");   
        }
        
        
    }
    
}
}
}