package hackerrank_beautiful_triplets;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hackerrank_Beautiful_Triplets {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int d=r.nextInt();
        
        int[] p=new int[n];
        Map<Integer,Integer>y=new HashMap<>();
        for(int i=0;i<n;i++)
        {
         p[i]=r.nextInt();
         y.put(p[i],i);
        }
        int sum=0;
        for(int u=0;u<n;u++)
        {
          int bd=p[u];
          
          if(y.containsKey(bd+d)&&y.containsKey(bd+d+d)&&y.get(bd+d)>u&&y.get(bd+d+d)>y.get(bd+d))
          {
           sum++; 
          }
        }
        System.out.println(sum);
    }
    
}
