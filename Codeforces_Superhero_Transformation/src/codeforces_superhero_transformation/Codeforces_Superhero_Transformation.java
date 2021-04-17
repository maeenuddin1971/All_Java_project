package codeforces_superhero_transformation;

import java.util.Scanner;

public class Codeforces_Superhero_Transformation {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       
       String hj=r.nextLine();
       String mp=r.nextLine();
       
       char[] p=hj.toCharArray();
       char[] hy=mp.toCharArray();
       
       int sum=0;
       int sum2=0;
     String string=mp;
     String reverse = new StringBuffer(string).reverse().toString();
  //  System.out.println(reverse);
       if(hj.contains(mp)||hj.contains(reverse))
       {
           System.out.println("No");
       }
       else
       if(p.length>=hy.length)
       {
       for(int y=0;y<hj.length();y++)
       {
           if(p[y]=='a'||p[y]=='e'||p[y]=='i'||p[y]=='o'||p[y]=='u')
           {
              sum++; 
           }
       }
        for(int y=0;y<mp.length();y++)
       {
           if(hy[y]=='a'||hy[y]=='e'||hy[y]=='i'||hy[y]=='o'||hy[y]=='u')
           {
              sum2++; 
           }
       }
        
      if(sum==sum2)
      {
          System.out.println("Yes");
      }
      else
          System.out.println("No");
       }
       else
           System.out.println("No");
       
       
       
       
       
       
    }
    
}
