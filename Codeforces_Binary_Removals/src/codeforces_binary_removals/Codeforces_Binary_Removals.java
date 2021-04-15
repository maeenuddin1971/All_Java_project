package codeforces_binary_removals;

import java.util.Scanner;

public class Codeforces_Binary_Removals {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
    
        int gf=r.nextInt();
        r.nextLine();
        for(int it=0;it<gf;it++)
        {
       // r.nextLine();
         String gh=r.nextLine();
            /*if(it==71)
            {
                System.out.println("maeen "+gh);
            }*/
            
        //String gh=r.nextLine();
        int ga=0,m=0;
        for(int hs=0;hs<gh.length()-1;hs++)
        {
           if(gh.charAt(hs)=='1'&&gh.charAt(hs+1)=='1')
           {
            ga=hs+1; 
            m=1;
            break;
           }
        }
        if(m==0)
        {
            System.out.println("Yes");
        }
        else
        {
            if(gh.substring(ga,gh.length()).contains("00"))
            {
              System.out.println("No");  
            }
            else
            {
               System.out.println("yes");
            }
        }
        
        }
        
    
}
}
    