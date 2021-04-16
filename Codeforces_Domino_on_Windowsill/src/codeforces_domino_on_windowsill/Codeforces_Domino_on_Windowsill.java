package codeforces_domino_on_windowsill;

import java.util.Scanner;

public class Codeforces_Domino_on_Windowsill {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int jh=r.nextInt();
        
        for(int yh=0;yh<jh;yh++)
        {
        int n=r.nextInt();
        
        int k1=r.nextInt();
        int k2=r.nextInt();
        
        int m=r.nextInt();
        int f=r.nextInt();
        
        int h=2*n-(k1+k2);
        
        System.out.println(h);
        
        if(m*2<=k1+k2&&h>=2*f)
        {
            System.out.println("Yes");
        }
        else
        {
          System.out.println("No");
        }
        
    }
    
}
}