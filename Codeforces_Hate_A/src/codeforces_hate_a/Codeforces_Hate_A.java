package codeforces_hate_a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Codeforces_Hate_A {
    public static void main(String[] args) {
      Scanner r=new Scanner(System.in);
      
    String gh=r.nextLine();
      int check=0;
     char[] pk=gh.toCharArray();
      
      PriorityQueue<Integer>pi=new PriorityQueue<Integer>();
      boolean[] yu=new boolean[30];
      Map<String,Integer>jk=new HashMap<String,Integer>();
      char bh='a';
      for(int t=1;t<27;t++)
      {
       // System.out.println(t);
        yu[t]=false; 
        String nj=String.valueOf(bh);
        //System.out.println(nj);
        jk.put(nj,t);
        bh++;
      }
    // System.out.println(jk.get(String.valueOf('a')));
    int sum=0; 
    List<Integer> fgr=new ArrayList<Integer>();
   for(char fg='a';fg<='z';fg++)
   {
       if((yu[jk.get(String.valueOf(fg))])==false)
       {
           sum=0;
           for(int gt=0;gt<gh.length();gt++)
           {
               if(fg==pk[gt])
               {
                sum++;   
               }
           }
           yu[jk.get(String.valueOf(fg))]=true;
         //  System.out.println(fg+" "+sum);
           if(sum!=0&&fg!='a')
           {
               check=1;
               int ou=0;
               int half=sum/2;
             for(int we=0;we<gh.length();we++)
             {
                 if(pk[we]==fg)
                 {
                    if(ou==half)
                    {
                       break;
                    }
                    else
                    {
                       // System.out.println("mama "+fg+" "+we);
                        fgr.add(we);
                       
                    }
                    ou++;
                 }
                 
             }
           }
       }
   }
   
  if(fgr.size()!=0)
  {
  Collections.sort(fgr);
  //System.out.println(fgr);
 //   System.out.println(fgr.get(fgr.size()-1));
 //uporer porjnto just dekha hoice j knta koyta ache
   
  String rf=gh.substring(0,fgr.get(fgr.size()-1)+1);
 // System.out.println(rf);
  
  for(int i=fgr.get(fgr.size()-1)+1;i<gh.length();i++)
  {
      if(pk[i]!='a')
      {
         
         // break;
      }
      else if(pk[i]=='a')
      {
        // System.out.println("mama nai");
         rf=rf+String.valueOf(pk[i]);
         // System.out.println(rf);
      }
  }
  
 // System.out.println(rf);
   
  
  String rf2=gh.substring(0,rf.length());
  String rf3=gh.substring(rf.length(),gh.length());
//  System.out.println(rf3);
  
  List<String>ew=new ArrayList<String>();
  char[] ju=new char[10];
  int m=0;
  String v="";
  for(int i=0;i<rf2.length();i++)
  {
      if(pk[i]!='a')
      {
        v=v+String.valueOf(pk[i]);
      }
  }
  
  
  
//  System.out.println(v);
  if(v.compareTo(rf3)==0)
  {
      System.out.println(rf2);
  }
  else
      System.out.println(":(");
      
    }
  else if(check==0)
  {
   System.out.println(gh);
  }
  else 
  {
      System.out.println(":(");
  }
    }
   
    
}
