package codeforces_find_square;

import java.util.*;

public class Codeforces_find_square {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int t=r.nextInt();
        char[][] b=new char[n][t];
        for(int i=0;i<n;i++)
        {
            String data="";
            data=r.next();
            
            for(int u=0;u<t;u++)
            {
                b[i][u]=data.charAt(u);
            }
        }
      // System.out.println(b[1][1]);
      int j=0;  
      int a=2;
      int xc=0;
      int vb=0;
    for(int y=0;y<n;y++)
    {
        for(int f=0;f<t;f++)
        {  
            if(b[y][f]=='B')
            {
                vb=y;
                xc=f;
                j=0;
                a=3;
            // System.out.println(xc);
               //break;
               for(int c=f+1;c<t;c++)
               {
                   if(b[vb][c]=='B')
                   {
                       j++;
                   }
                   else
                   {
                     //  System.out.println(j+xc);
                       break;
                   }
               }
               break;
               
            }
        }
        if(a==3)
        {
            int sz=j/2+1;
            System.out.println(vb+sz);
            System.out.println(sz+xc);
            break;
        }
    }    
    }
   
    
}
