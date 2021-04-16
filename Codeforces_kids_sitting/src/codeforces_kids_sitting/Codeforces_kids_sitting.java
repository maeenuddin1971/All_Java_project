package codeforces_kids_sitting;

import java.util.Scanner;

public class Codeforces_kids_sitting {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int m=r.nextInt();
        
        for(int it=0;it<m;it++)
        {
        int t=r.nextInt();
        
        int k=4*t;
        for(int i=0;i<t;i++)
        {
          
            System.out.print(k+" ");
            
            k=k-2;
            
        }
        
        System.out.println();
        
    }
    
}
}