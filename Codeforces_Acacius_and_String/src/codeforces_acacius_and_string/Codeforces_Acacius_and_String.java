package codeforces_acacius_and_string;

import java.util.Scanner;

public class Codeforces_Acacius_and_String {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       
       int hx=r.nextInt();
       r.nextLine();
       //int man=0;
       for(int ub=0;ub<hx;ub++)
       {
       //r.nextLine();
       int h=r.nextInt();
       //r.nextLine();
       String gh=r.next();
       int man=0;
       char[] p=gh.toCharArray();
       String rt="abacaba";
       
       if(gh.contains("abacaba"))
       {
          man=1;
          int z=0;
          for(int i=0;i<gh.length();i++)
          {
            if(gh.charAt(i)=='a')
            {
                try
                {
                String vx=gh.substring(i,rt.length()+i);
                //System.out.println(vx);
                if(vx.contains(rt))
                {
                  z++;
                }
                }
                catch(Exception jb)
                {
                    
                }
            }
            else if(gh.charAt(i)=='?')
            {
              p[i]='g';
               
              // System.out.println(gh);
               //System.out.println("maeen");
            }
          }
          
          if(z>1)
          {
             System.out.println("No"); 
             //System.out.println(gh);
          }
          else
          {
            System.out.println("Yes");
            gh=String.copyValueOf(p);
            System.out.println(gh);
          }
          //System.out.println(z);
       }
       else
       {
           for(int i=0;i<gh.length();i++)
           {
               if(gh.charAt(i)=='a')
               {
                   int hf=i;
                   for(int hg=0;hg<rt.length();hg++)
                   {
                      try
                      {
                      if(gh.charAt(hf)==rt.charAt(hg))
                      {
                        hf++;
                        continue;
                      }
                      else if(gh.charAt(hf)=='?')
                      {
                        // System.out.println("maeen");
                         p[hf]=rt.charAt(hg);
                         hf++;
                      }
                      else
                      {
                         break;
                      }
                      }
                      catch(Exception jh)
                      {
                          
                      }
                   }
                   String gf=String.copyValueOf(p);
                   //System.out.println(gf);
                   if(gf.contains(rt))
                   {
                     System.out.println("Yes");
                     man=1;
                     String tu=gf.replace('?','g');
                     System.out.println(tu);
                     break;
                   }
               }
               else
               {
                  
                   
                   int hf=i;
                   for(int hg=0;hg<rt.length();hg++)
                   {
                      try
                      {
                      if(gh.charAt(hf)==rt.charAt(hg))
                      {
                        hf++;
                        continue;
                      }
                      else if(gh.charAt(hf)=='?')
                      {
                        // System.out.println("maeen");
                         p[hf]=rt.charAt(hg);
                         hf++;
                      }
                      else
                      {
                         break;
                      }
                      }
                      catch(Exception jh)
                      {
                          
                      }
                   }
                   String gf=String.copyValueOf(p);
                  // System.out.println(gf);
                   if(gf.contains(rt))
                   {
                     System.out.println("Yes");
                     man=1;
                     String tu=gf.replace('?','g');
                     System.out.println(tu);
                     break;
                   }
                   
                   
                   
               }
           }
       }
       if(man==0)
       {
         System.out.println("No");
       }
       
    }
    
}
}
