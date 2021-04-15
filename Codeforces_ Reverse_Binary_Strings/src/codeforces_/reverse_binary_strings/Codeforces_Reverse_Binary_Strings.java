
package codeforces_.reverse_binary_strings;

import java.util.Scanner;

public class Codeforces_Reverse_Binary_Strings {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int h=r.nextInt();
       // r.nextLine();
        for(int iu=0;iu<h;iu++)
        {
        int im=r.nextInt();
        r.nextLine();
        String gh=r.nextLine();
        
        int sum=0;
        int f=0;
        int g=0,k=0;
        int sum2=0;
        for(int y=0;y<gh.length();y++)
        {
            //int g=0;
            
            if(gh.charAt(y)=='1')
            {
              g++; 
              //System.out.println(g);
            }
            else
            {
             if(g!=0)
             sum=sum+(g-1);
             //System.out.println("maeen");
             g=0;
            }
            
            if(gh.charAt(y)=='0')
            {
              k++;  
            }
            else
            {
              if(k!=0)
              {
                sum2=sum2+(k-1);
              }
              
              k=0;
            }
            
            
            
        }
        
       // System.out.println(sum);
        
        //System.out.println(sum2);
        
        System.out.println(Math.max(sum,sum2));
    }
    
}
}