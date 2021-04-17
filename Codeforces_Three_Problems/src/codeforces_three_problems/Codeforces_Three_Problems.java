package codeforces_three_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
public class Codeforces_Three_Problems {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int t=r.nextInt();
        
        int[] mn=new int[t];
        List<Integer>jhy=new ArrayList<Integer>();
        List<Integer>jhy2=new ArrayList<Integer>();
        Map<Integer,Integer>hu=new HashMap<>();
        Map<Integer,Integer>hu2=new HashMap<>();
        for(int i=0;i<t;i++)
        {
            mn[i]=r.nextInt();
            hu.put(i,mn[i]); 
            hu2.put(mn[i], i);
        }
        Arrays.sort(mn);
        int k=0;
        for(int p=0;p<mn.length;p++)
        {
    
            if (hu.containsValue(mn[p])&&!jhy.contains(mn[p]))
            {
             //System.out.print(hu2.get(mn[p])+1+" ");
             jhy.add(mn[p]);
             jhy2.add(hu2.get(mn[p])+1);
             k++;
        }
            
            if(k==3)
            {
                break;
            }
            
    }
        
        if(k<3)
        {
            System.out.println("-1"+" "+"-1"+" "+"-1");
        }
        else
        {
           for(int p=0;p<jhy2.size();p++)
           {
               System.out.print(jhy2.get(p)+" ");
           }
        }
    
}
}
