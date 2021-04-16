package codeforces_love_a;

import java.util.Scanner;

public class Codeforces_Love_A {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       
       
       String gh=r.nextLine();
       
       
       char[] p=gh.toCharArray();
       int x=0;
       int t=0;
       for(int i=0;i<p.length;i++)
       {
           if(p[i]=='a')
           {
              x++; 
           }
           else
               t++;
          
       }
    //   System.out.println(x+" "+t);
       
       if(x>t)
       {
           System.out.println(p.length);
       }
       else if(x==t)
       {
           t--;
           x=x+t;
           System.out.println(x);
       }
       else
       {
           //t=t-x;
           x=x+x-1;
           System.out.println(x);
           
       }
    }
    
}
