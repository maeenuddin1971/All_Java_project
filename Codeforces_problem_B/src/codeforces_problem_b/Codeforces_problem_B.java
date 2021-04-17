package codeforces_problem_b;

import java.util.Scanner;

public class Codeforces_problem_B {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int pg=r.nextInt();
        for(int io=0;io<pg;io++)
        {
        int n=r.nextInt();
        int[] u=new int[n];
        
        int hx=0;
        int max=0;
        for(int ih=0;ih<n;ih++)
        {
          u[ih]=r.nextInt();
          hx=hx+u[ih];
          if(max<hx)
          {
            max=hx;
          }
        }
        
       // System.out.println(max);
        
        
        int fg=0;
        
        int min=0;
        int as=r.nextInt();
        int[] pk=new int[as];
        for(int he=0;he<as;he++)
        {
          pk[he]=r.nextInt();
          fg=fg+pk[he];
          if(min<fg)
          {
            min=fg;
          }
        }
        
       System.out.println(min+max);
        
    }
    
}
}