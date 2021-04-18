package hackerrank_common_child;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hackerrank_Common_Child {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       
       String one=r.nextLine();
       String two=r.nextLine();
       
       char[] m=one.toCharArray();
       char[] n=two.toCharArray();
       
       int[][] mn=new int[m.length+1][n.length+1];
       
       
       for(int i=0;i<=m.length;i++)
       {
           for(int j=0;j<=n.length;j++)
           {
               if(i==0||j==0)
               {
                 mn[i][j]=0;
               }
               else if(m[i-1]==n[j-1])
               {
                 mn[i][j]=mn[i-1][j-1]+1; 
               }
               else
               {
                 int gh=mn[i][j-1];
                 int hy=mn[i-1][j];
                 int gv=(gh>hy)?gh:hy;
                 mn[i][j]=gv;
                 
               }
           }
       }
       
       System.out.println(mn[m.length][n.length]);
       
       
    }
    
}
