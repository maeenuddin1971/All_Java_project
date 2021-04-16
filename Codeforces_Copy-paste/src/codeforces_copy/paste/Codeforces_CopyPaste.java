package codeforces_copy.paste;

import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_CopyPaste {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       int p=r.nextInt();
       
       for(int ug=0;ug<p;ug++)
       {
       int h=r.nextInt();
       int c=r.nextInt();
       
       int[] m=new int[h];
       
       for(int i=0;i<h;i++)
       {
         m[i]=r.nextInt();
       }
       
       Arrays.sort(m);
       int jh=m.length-1;
       int an=0;
       for(int ig=m.length-1;ig>0;ig--)
       {
         int hz=c-m[ig];
        // System.out.println(hz);
         if(hz<=0)
         {
           continue;
         }
         else
         {
           an=an+hz/m[0];
             
         }
       }
       System.out.println(an);
       
       
    }
    
}
}