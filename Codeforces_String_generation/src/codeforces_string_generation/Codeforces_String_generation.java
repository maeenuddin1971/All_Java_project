package codeforces_string_generation;
import java.util.Scanner;
public class Codeforces_String_generation {
    public static void main(String[] args) {
        
        
        Scanner r=new Scanner(System.in);
        int gq=r.nextInt();
        for(int he=0;he<gq;he++)
        {
        int t=r.nextInt();
        int m=r.nextInt();
        
        for(int uh=0;uh<m;uh++)
        {
          System.out.print("a");
        }
       // System.out.println();
        int gz=0;
        
        for(int yx=m;yx<t;yx++)
        {
           if(gz==0)
           {
             System.out.print("b");
             gz=1;
           }
           else if(gz==1)
           {
             System.out.print("c");
             gz=2;
           }
           else if(gz==2)
           {
             System.out.print("a");
             gz=0;
           }
        }
        System.out.println();
        
    }
    
}
}