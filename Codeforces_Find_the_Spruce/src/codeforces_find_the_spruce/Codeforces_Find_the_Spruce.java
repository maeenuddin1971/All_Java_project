package codeforces_find_the_spruce;

import java.util.Scanner;

public class Codeforces_Find_the_Spruce {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       int gf=r.nextInt();
       
       
       for(int hw=0;hw<gf;hw++)
       {
       int t=r.nextInt();
       int m=r.nextInt();
       
       String[] p=new String[t];
       
       r.nextLine();
       int[][] pt=new int[t][m];
       for(int y=0;y<t;y++)
       {
         p[y]=r.nextLine();
         
         for(int ig=0;ig<m;ig++)
         {
           if(p[y].charAt(ig)=='*')
           {
             pt[y][ig]=1;  
           }
           else
           {
             pt[y][ig]=0;
           }
         }
         
       }
       
       //System.out.println(p[p.length-1]);
       
       /*for(int hc=0;hc<t;hc++)
       {
           for(int hz=0;hz<m;hz++)
           {
             System.out.print(pt[hc][hz]+" ");
           }
           System.out.println();
       }*/
       //System.out.println();
       for(int tf=t-2;tf>=0;tf--)
       {
          for(int hx=1;hx<m-1;hx++)
          {
            if(pt[tf][hx]==1)
            {
               int gd=Math.min(pt[tf+1][hx],pt[tf+1][hx-1]);
               pt[tf][hx]=Math.min(gd,pt[tf+1][hx+1])+1;
            }
          }
       }
       
       int sum=0;
       
       for(int hc=0;hc<t;hc++)
       {
           for(int hz=0;hz<m;hz++)
           {
             //System.out.print(pt[hc][hz]+" ");
               sum=sum+pt[hc][hz];
           }
          // System.out.println();
       }
       
       System.out.println(sum);
       
    }
    
}
}