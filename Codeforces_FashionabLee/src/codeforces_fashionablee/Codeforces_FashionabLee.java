package codeforces_fashionablee;

import java.util.Scanner;

public class Codeforces_FashionabLee {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       int n=r.nextInt();
       
       for(int i=0;i<n;i++)
       {
          int h=r.nextInt();
          
          if(h%4==0)
          {
              System.out.println("YES");
          }
          else
          {
            System.out.println("NO");
          }
       }
    }
    
}
