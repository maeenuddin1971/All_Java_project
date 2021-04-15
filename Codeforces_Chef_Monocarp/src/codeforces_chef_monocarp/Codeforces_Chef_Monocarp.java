package codeforces_chef_monocarp;

import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_Chef_Monocarp {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        
        int[] p=new int[n];
        
        
        for(int i=0;i<n;i++)
        {
          p[i]=r.nextInt();
        }
        
        Arrays.sort(p);
        int kh=p[0];
        int mid,hg=0,lw=0,m=0;
        for(int i=0;i<n;i++)
        {
         //System.out.print(p[i]+" ");   
            
         if(p[i]!=kh)
         {
           kh=p[i];
           m=0;
           //System.out.println(kh);
         }
         else
         {
           if(m==0)
           {
             
           }
         }
            
            
            
        }
        
    }
    
}
