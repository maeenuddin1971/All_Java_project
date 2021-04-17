package codeforces_the_grid_search;
import java.util.Scanner;
public class Codeforces_The_Grid_Search {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       int count=r.nextInt();
       
       for(int gt=0;gt<count;gt++)
       {
       int t=r.nextInt();
       int m=r.nextInt();
       r.nextLine();
       String[] w=new String[t];
       
       for(int y=0;y<t;y++)
       {
           w[y]=r.nextLine();
       }
       int h=r.nextInt();
       int jy=r.nextInt();
       r.nextLine();
       String[] jr=new String[h];
       
       for(int y=0;y<h;y++)
       {
           jr[y]=r.nextLine();
       }
       
       int emon=0;
       for(int y=0;y<t;y++)
       {
         if(w[y].contains(jr[0]))
         {
           //System.out.println("maeen");
           emon++;
           //System.out.println(w[y].indexOf(jr[0]));
           int br=w[y].indexOf(jr[0]);
           y++;
           for(int dq=1;dq<h;dq++)
           {
             if(w[y].substring(br,br+jy).equals(jr[dq]))
             {
               //System.out.println("rasel"); 
               emon++;
             }
             y++;
           }
           
           if(emon==h)
           {
             System.out.println("YES");
           }
           else
           {
             System.out.println("NO");  
           }
           
           break;
         }
         
       }
       }
    }
    
}
