package codeforces_déjà_vu;

import java.util.Scanner;

public class Codeforces_Déjà_Vu {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int df=r.nextInt();
        r.nextLine();
        for(int hw=0;hw<df;hw++)
        {
        String gh=r.nextLine();
        int gf=0;
        
        if(gh.charAt(0)!=gh.charAt(gh.length()-1))
        {
            System.out.println("YES");
            if(gh.charAt(0)!='a'&&gh.charAt(gh.length()-1)!='a')
            {
                System.out.println('a'+gh);
            }
            else if(gh.charAt(0)=='a')
            {
                
                System.out.println('a'+gh);
            }
            else
            {
                System.out.println(gh+'a');
            }
        }
        else
        {
          if(gh.length()%2==0)
          {
             int hc=0;
             for(int ih=0,pj=gh.length()-1;ih<gh.length()/2;ih++,pj--)
             {
               if(gh.charAt(ih)!='a')
               {
                 System.out.println("YES");
                 hc=1;
                 System.out.println(gh+'a');
                 break;
               }
               
               if(gh.charAt(pj)!='a')
               {
                 System.out.println("YES");
                 System.out.println('a'+gh);
                 hc=1;
                 break;
               }
             }
             if(hc==0)
             {
                 
                 System.out.println("No");
             }
             
          }
          else
          {
            // System.out.println("maeen");
           
             int hc=0;
             for(int ih=0,pj=gh.length()-1;ih<gh.length()/2;ih++,pj--)
             {
               if(gh.charAt(ih)!='a')
               {
                 System.out.println("YES");
                 hc=1;
                 System.out.println(gh+'a');
                 break;
               }
               
               if(gh.charAt(pj)!='a')
               {
                 System.out.println("YES");
                 System.out.println('a'+gh);
                 hc=1;
                 break;
               }
             }
            // System.out.println(gh.charAt(gh.length()/2));
             //System.out.println(gh.charAt((gh.length())/2)+1);
             if(gh.charAt((gh.length())/2)!='a'&&hc==0)
             {
                System.out.println("YES");
                System.out.println('a'+gh);
                hc=1;
             }
             if(hc==0)
             {
                 System.out.println("NO");
             }
              
              
          }
        }
        
        
        
    }
    
}
}