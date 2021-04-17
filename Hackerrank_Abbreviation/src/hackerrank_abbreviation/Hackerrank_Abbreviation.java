package hackerrank_abbreviation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hackerrank_Abbreviation {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       
       int yx=r.nextInt();
       r.nextLine();
       
       for(int iu=0;iu<yx;iu++)
       {
       String gh=r.nextLine();
       String gb=r.nextLine();
       
       int gx=0;
       int bz=0;
       
       
       Map<Character,Integer>pk=new HashMap<>();
       Map<Character,Integer>pm=new HashMap<>();
       
       for(int i=0;i<gh.length();i++)
       {
         if(!pk.containsKey(gh.charAt(i)))
         {
           pk.put(gh.charAt(i),1);
         }
         else
         {
           pk.put(gh.charAt(i),pk.get(gh.charAt(i))+1);
         }
       }
       //System.out.println(pk);
       
       
       for(int i=0;i<gb.length();i++)
       {
         if(!pm.containsKey(gb.charAt(i)))
         {
           pm.put(gb.charAt(i),1);
         }
         else
         {
           pm.put(gb.charAt(i),pm.get(gb.charAt(i))+1);
         }
       }
       
       //System.out.println(pm);
       int h=0;
       for(Character fn='A';fn<='Z';fn++)
       {
         if(pm.containsKey(fn)&&(!pk.containsKey(fn)&&!pk.containsKey(Character.toLowerCase(fn))))
         {
           System.out.println("NO");
           //System.out.println(pm.get(fn));
           //System.out.println(pk.get(fn)); 
           h=1;
           break;
         }
         
         if(pk.containsKey(fn)&&!pm.containsKey(fn))
         {
           System.out.println("NO");
           h=1;
           break;
         }
         
         if(pk.containsKey(fn)&&pm.containsKey(fn))
         {
             if(pk.get(fn)>pm.get(fn))
             {
             System.out.println("NO");
             h=1;
             break;
             }
         }
         
         
         
       }
       
       
       
       
       
       
       
       
       
       if(h==0)
       {
       for(int ih=0;ih<gb.length();ih++)
       {
         Character g=gb.charAt(ih);
        // System.out.println(gx);
         bz=0;
         for(int ic=gx;ic<gh.length();ic++)
         {
           if(g==gh.charAt(ic)||g==Character.toUpperCase(gh.charAt(ic)))
           {
             bz=1; 
             gx=ic+1;
             //System.out.println("MAEEN");
             break;
           }
         }
         if(bz==0)
         {
           System.out.println("NO");
           break;
         }
         
       }
       
       if(bz==1)
       {
           System.out.println("YES");
       }
       
    }
    
}
}}