package codeforces_three_integers_again;
import java.util.*;
public class Codeforces_Three_Integers_again {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       
       int t=r.nextInt();
       int m=r.nextInt();
       
       int a,b,c;
////      
       if(t>m)
       {
          a=m-1;
          
          b=t-a;
          
          c=1;
          
          System.out.println(a+" "+b+" "+c);
       }
       else if(t<m)
       {
           int q;
           q=t;
           
           t=m;
           m=q;
           
           
           
           a=m-1;
          
          b=t-a;
          
          c=1;
          
          System.out.println(a+" "+b+" "+c);
           
           
       }
       else if(t==m)
       {
           a=m-1;
           b=1;
           c=1;
           
           System.out.println(a+" "+b+" "+c);
       }
       
    }
    
}
