package hackerrank_absolute_permutation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import static javax.swing.text.html.HTML.Attribute.N;

public class Hackerrank_Absolute_Permutation {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       int yh=r.nextInt();
       
       
       for(int h=0;h<yh;h++)
       {
       int n=r.nextInt();
       int x=r.nextInt();
       
       if(x>0&&n%(2*x)!=0)
       {
         System.out.print("-1");  
       }
       else
       {
       
       
       int[] pk=new int[n];
       for(int u=0;u<n;u++)
       {
         pk[u]=u+1;
       }
       int[] result=new int[n];
       
       boolean[] check=new boolean[n];
       
       for(int hn=0;hn<n;hn++)
       {
         if(check[hn]==false&&check[hn+x]==false)
         {
         result[hn]=pk[hn+x];
         result[hn+x]=pk[hn];
         
         check[hn]=true;
         check[hn+x]=true;
         }
       }
       
       
       for(int u=0;u<n;u++)
       {
         System.out.print(result[u]+" ");
       }
       
    
    
}
        System.out.println(); 
}
}
}