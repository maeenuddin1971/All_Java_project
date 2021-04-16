package codeforces_maximum_gcd;

import java.util.Scanner;

public class Codeforces_Maximum_GCD {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int n=r.nextInt();
        for(int i=0;i<n;i++)
        {
        int m=r.nextInt();
        
        if(m%2==0)
        {
           System.out.println(m/2);
        }
        else
        {
          int g=m-1;
          System.out.println(g/2);
        }
        
    }
    
}
}
