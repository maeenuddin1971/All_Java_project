package codeforces_accuratelee;

import java.util.Scanner;

public class Codeforces_AccurateLee {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       
       int n=r.nextInt();
       
       
       for(int jg=0;jg<n;jg++)
       {
       int t=r.nextInt();
       r.nextLine();
       String gh=r.nextLine();
       
       if(gh.contains("10"))
       {
       String rt="";
       if(gh.length()>1)
       {
       for(int i=0;i<gh.length();i++)
       {
         // System.out.println(i);
          
          if(gh.charAt(i)=='1')
          {
            if(gh.charAt(gh.length()-1)=='1')
            {
              for(int hc=gh.length()-1;hc>=0;hc--)
              {
                if(gh.charAt(hc)=='1')
                {
                  rt=rt+1;
                }
                else
                {
                  rt=0+rt;
                  break;
                }
              }
            }
            else
            {
              rt=rt+0;
            }
            break;
          }
          else
          {
            rt=rt+0;
          }
       }
       
       System.out.println(rt);
       }
       else
       {
         System.out.println(gh);
       }
       }
       else
       {
         System.out.println(gh);
       }
    }
    
}
}