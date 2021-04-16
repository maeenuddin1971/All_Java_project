package codeforces_fair_division;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Codeforces_Fair_Division {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       int hw=r.nextInt();
       
       for(int uj=0;uj<hw;uj++)
       {
       int t=r.nextInt();
       int[] m=new int[t];
       Map<Integer,Integer>pk=new HashMap<>();
       pk.put(1,0);
       pk.put(2,0);
       int sum=0;
       for(int i=0;i<t;i++)
       {
          m[i]=r.nextInt();
          pk.put(m[i],pk.get(m[i])+1);
          sum=sum+m[i];
          
       }
       
       //System.out.println(sum);
       
       if(sum%2!=0)
       {
         System.out.println("NO");
       }
       else
       {
       if(pk.get(1)%2==0&&pk.get(2)%2==0)
       {
         System.out.println("YES");
       }
       else if(t%2!=0&&(pk.get(1)==0||pk.get(2)==0))
       {
         System.out.println("NO");
       }
       else
       {
         System.out.println("YES");
       }
       }
       
    }
    
}
}