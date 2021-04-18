package hackerrank_closest_numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Hackerrank_Closest_Numbers {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int t=r.nextInt();
        
        int[] p=new int[t];
        
        for(int i=0;i<t;i++)
        {
         p[i]=r.nextInt();
        }
        
        Arrays.sort(p);
        Map<Integer,String>n=new HashMap<>();
        List<List<Integer>>m=new ArrayList<>();
        List<Integer>km=new ArrayList<>();
       
        int sum=p[1]-p[0];
        String ami=String.valueOf(p[0])+"t"+String.valueOf(p[1]);
        n.put(sum,ami+"t");
        for(int gh=1;gh<p.length-1;gh++)
        {
         int fd=p[gh+1]-p[gh];
         
         if(sum>=fd)
         {
          sum=fd;
          
          //n.put(fd,n.get(km));
         } 
         
         ami=String.valueOf(p[gh])+"t"+String.valueOf(p[gh+1]);
         if(n.containsKey(fd))
         {
         n.put(fd,n.get(sum)+ami+"t");
         }
         else
         {
         n.put(fd,ami+"t");
         }
         
         
        }
        
        //System.out.println(n);
       // System.out.println(n.get(sum));
        
        String result=n.get(sum);
        char[] m2=result.toCharArray();
        for(int i=0;i<result.length();i++)
        {
        if(m2[i]!='t')
        {
        System.out.print(m2[i]);
        }
        else
        {
        System.out.print(" ");
        }
        }
        
    }
    
}
