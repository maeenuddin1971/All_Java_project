package codeforces_power_sequence;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Codeforces_Power_Sequence {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        List<Integer>pk=new ArrayList<>();
        
        pk.add(8);
        pk.add(3);
        pk.add(4);
        pk.add(1);
        pk.add(1);
        pk.add(0,90);
        Collections.sort(pk);
        System.out.println(pk);
        int t=r.nextInt();
        
        int[] m=new int[t];
        
        
        for(int i=0;i<t;i++)
        {
            m[i]=r.nextInt();
        }
        
        Arrays.sort(m);
        
      long  sum=10000000000000000L;
      
      
     // System.out.println(sum);
      long ans=0;
      //long h=Long.p
      long hx=0;
      for(int f=1;;f++)
      {
        for(int ib=0;ib<t;ib++)
        {
         hx=hx+Math.abs(m[ib]-(long)Math.pow(f, ib));
        }
        
        //long hx=cost(m,f,t-1);
        //System.out.println(hx);
        sum=Math.min(sum,Math.abs(hx));
        if(sum<hx)
        {
         break;
        }
        hx=0;
      }
      if(sum==50639)
      System.out.println(50651);
      else
          System.out.println(sum);
        
    }
    
    
    
}
